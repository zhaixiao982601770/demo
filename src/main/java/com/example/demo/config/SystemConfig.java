package com.example.demo.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 自定义实体类
 *
 */

@Component
@ConfigurationProperties(prefix = "app")
@Data
public class SystemConfig {

    private String info;
    private String author;
    private String email;


    private String swaggerTitle;



    private String swaggerContactName;

    private String swaggerContactWebUrl;

    private String swaggerContactEmail;
    private String swaggerVersion;

    private String swaggerDescription;
    private String swaggerTermsOfServiceUrl;
}
