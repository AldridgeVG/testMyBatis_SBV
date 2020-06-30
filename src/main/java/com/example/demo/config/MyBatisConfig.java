package com.example.demo.config;

//important
import org.apache.ibatis.session.Configuration;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

    @Bean
    public ConfigurationCustomizer configuartionCustomizer(){
        return new ConfigurationCustomizer() {

            @Override
            public void customize(Configuration configuration) {
                //use camel case naming
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
