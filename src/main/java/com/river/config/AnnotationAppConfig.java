package com.river.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.river.model")
//ComponentScan can scan bean create in AppConfig. Because AppConfig is @Configuration
public class AnnotationAppConfig {
}
