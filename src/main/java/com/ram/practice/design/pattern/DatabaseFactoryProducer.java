package com.ram.practice.design.pattern;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseFactoryProducer {
    @Value("${db.type}")
    private String dbType;

    private final MySQLFactory mySQLFactory;
    private final PostgresSQLFactory postgresSQLFactory;

    public DatabaseFactoryProducer(MySQLFactory mySQLFactory, PostgresSQLFactory postgresSQLFactory) {
        this.mySQLFactory = mySQLFactory;
        this.postgresSQLFactory = postgresSQLFactory;
    }

    @Bean("databaseFactory")
    public DatabaseFactory getDatabaseFactory(){
        switch (dbType.toUpperCase()) {
            case "MYSQL":
                return mySQLFactory;
            case "POSTGRESSQL":
                return postgresSQLFactory;
            default:
                throw new IllegalArgumentException("UnSupported Database type "+dbType);
        }
    }
}
