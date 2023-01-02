package org.nicoarianto.infrastructure.configuration

import org.nicoarianto.infrastructure.aws.configuration.AwsProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(AwsProperties::class)
class InfrastructureConfiguration
