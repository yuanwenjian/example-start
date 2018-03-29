package com.yuanwj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by bmk on 18-3-29.
 */
@ConfigurationProperties(prefix = "example")
public class ExampleProperties {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
