package org.nicoarianto.infrastructure.aws.dynamodb

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import java.net.URI

@ConfigurationProperties("aws")
@ConstructorBinding
data class AwsProperties(val accessKeyId: String?, val secretAccessKey: String?, val region: String, val endpoint: URI?)
