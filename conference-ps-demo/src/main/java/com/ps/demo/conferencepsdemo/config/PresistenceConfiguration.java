package com.ps.demo.conferencepsdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PresistenceConfiguration {
//    @Value("${db_url}")
//    private String url;
//
//    @Value("${username}")
//    private String username;
//
//    @Value("${password}")
//    private String password;
//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url(url);
//        builder.username(username);
//        builder.password(password);
//        return builder.build();
//    }
}
