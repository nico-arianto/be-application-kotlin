package org.nicoarianto.infrastructure.aws.dynamodb

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(AwsProperties::class)
class PropertiesConfiguration
