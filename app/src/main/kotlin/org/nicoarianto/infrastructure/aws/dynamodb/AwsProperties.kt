package org.nicoarianto.infrastructure.aws.dynamodb

import org.springframework.boot.context.properties.ConfigurationProperties
import java.net.URI

@ConfigurationProperties("aws")
data class AwsProperties(val accessKeyId: String?, val secretAccessKey: String?, val region: String, val endpoint: URI?)
