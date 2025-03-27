package com.ram.practice.design.pattern;

import org.springframework.stereotype.Component;

@Component
public class PostgresSQLConnection implements DatabaseConnection{
    @Override
    public void connection() {
        System.out.println("PostgresSQL DB Connection is created");
    }
}
