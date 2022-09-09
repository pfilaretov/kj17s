package pro.filaretov.spring.kotlin.kj17s.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(Kj17sProperties::class)
class Kj17sConfig


@ConstructorBinding
@ConfigurationProperties("kj17s")
data class Kj17sProperties(
    /**
     * Dummy property with some default value
     */
    val dummy: String = "42"
)