package com.saitej.springconfiguration.springconfigexamples.config;

import com.saitej.springconfiguration.springconfigexamples.repos.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(ConstructorConfig.class)
@Configuration
public class JavaConfiguration {

    //Using Basic java configuration
  /*  @Bean
    FakeDataSource fakeDataSource(@Value("${guru.spring.username}") String username,
                                  @Value("${guru.spring.password}")String password,
                                  @Value("${guru.spring.url}")String url){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return  fakeDataSource;
    }*/

  //Using separate Config class for properties
  /*@Bean
    FakeDataSource fakeDataSource(PropertiesConfig propertiesConfig){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(propertiesConfig.getUsername());
        fakeDataSource.setPassword(propertiesConfig.getPassword());
        fakeDataSource.setUrl(propertiesConfig.getUrl());
        return  fakeDataSource;
    } */

    //Using separate Constructor Config class for properties
    // We should configure @EnableConfigurationProperties(ConstructorConfig.class) in Java Configuration class for Constructor configuraton
  @Bean
    FakeDataSource fakeDataSource(ConstructorConfig constructorConfig){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(constructorConfig.getUsername());
        fakeDataSource.setPassword(constructorConfig.getPassword());
        fakeDataSource.setUrl(constructorConfig.getUrl());
        return  fakeDataSource;
    }







}
