package com.bk.configuration;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.bk.repository")
@PropertySource("classpath:db.properties")
public class DatabaseConfig {

    @Value("${mongo.dbname:oms}")
    private String mongoDbName;

    @Value("${mongo.host:localhost}")
    private String mongoHost;

    @Value("${mongo.port:27017}")
    private int mongoPort;

    @Bean
    public MongoClient mongo() {
        return new MongoClient(mongoHost,mongoPort);
    }

    @Bean
    protected MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongo(),mongoDbName);
    }
}
