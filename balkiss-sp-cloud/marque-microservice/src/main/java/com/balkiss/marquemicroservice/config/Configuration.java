package com.balkiss.marquemicroservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
@Data
@Component
@RefreshScope
@ConfigurationProperties(prefix = "author")
public class Configuration {
    private String name;
    private String email;
}