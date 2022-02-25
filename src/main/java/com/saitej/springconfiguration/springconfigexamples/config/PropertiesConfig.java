package com.saitej.springconfiguration.springconfigexamples.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
//By using this class properties file values will be stored in this class object this is an alternative to @value annotation
@ConfigurationProperties("guru.spring")  // should match with properties file key name
@Configuration
public class PropertiesConfig {

    private String username;
    private String password;
    private String url;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
