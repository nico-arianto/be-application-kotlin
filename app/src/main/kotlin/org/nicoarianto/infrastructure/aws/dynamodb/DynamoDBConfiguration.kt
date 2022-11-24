package org.nicoarianto.infrastructure.aws.dynamodb

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

@Configuration
class DynamoDBConfiguration {

    @Bean(destroyMethod = "close")
    fun client(properties: AwsProperties): DynamoDbAsyncClient = DynamoDbAsyncClient.builder()
        .apply {
            properties.accessKeyId?.let { access -> properties.secretAccessKey?.let { secret -> Pair(access, secret) } }
                ?.apply {
                    credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(first, second)))
                }
        }
        .region(Region.of(properties.region))
        .apply {
            properties.endpoint?.apply { endpointOverride(this) }
        }
        .build()
}
