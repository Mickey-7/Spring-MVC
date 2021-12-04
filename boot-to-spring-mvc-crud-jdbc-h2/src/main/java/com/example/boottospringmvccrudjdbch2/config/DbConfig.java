package com.example.boottospringmvccrudjdbch2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DbConfig {
    @Autowired
    private Environment environment;

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .driverClassName(environment.getProperty("jdbc.driverClassName"))
                .url(environment.getProperty("jdbc.url"))
                .username(environment.getProperty("jdbc.username"))
                .password(environment.getProperty("jdbc.password"))
                .build();
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() throws ClassNotFoundException {
        return new JdbcTemplate(dataSource());
    }
}
