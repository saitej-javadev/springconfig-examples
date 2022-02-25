package com.saitej.springconfiguration.springconfigexamples;

import com.saitej.springconfiguration.springconfigexamples.config.ConstructorConfig;
import com.saitej.springconfiguration.springconfigexamples.config.PropertiesConfig;
import com.saitej.springconfiguration.springconfigexamples.repos.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringconfigExamplesApplication {

    public static void main(String[] args) {

       ApplicationContext ctx= SpringApplication.run(SpringconfigExamplesApplication.class, args);
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

        System.out.println("--------------------Reading properties from application.properties");

        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());

        System.out.println("--------------------Reading properties from PropertiesConfig class");
        PropertiesConfig propertiesConfig = ctx.getBean(PropertiesConfig.class);
        System.out.println(propertiesConfig.getUsername());
        System.out.println(propertiesConfig.getPassword());
        System.out.println(propertiesConfig.getUrl());



System.out.println("--------------------Reading properties from ConstructorConfig class");
        ConstructorConfig constructorConfig = ctx.getBean(ConstructorConfig.class);
        System.out.println(constructorConfig.getUsername());
        System.out.println(constructorConfig.getPassword());
        System.out.println(constructorConfig.getUrl());


    }

}
