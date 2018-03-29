package com.yuanwj.config;

import com.yuanwj.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bmk on 18-3-29.
 */
@Configuration
//@ConditionalOnBean(ExampleService.class)
@EnableConfigurationProperties(ExampleProperties.class)
public class ExampleAutoConfig {

    @Autowired
    private ExampleProperties exampleProperties;

    @Bean
    @ConditionalOnMissingBean
    public ExampleService getExampleService(){
        return new ExampleService(exampleProperties.getNumber());
    }


}
