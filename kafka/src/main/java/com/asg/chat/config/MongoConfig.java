package com.asg.chat.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@RequiredArgsConstructor
@EnableMongoRepositories(basePackages = "com.asg.chat.config")
@Configuration
public class MongoConfig {

    private final MongoProperties mongoProperties;

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(mongoProperties.getClient());
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), mongoProperties.getName());
    }

}