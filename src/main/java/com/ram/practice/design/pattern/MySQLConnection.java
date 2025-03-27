package com.ram.practice.design.pattern;

import org.springframework.stereotype.Component;

@Component
public class MySQLConnection implements DatabaseConnection{
    @Override
    public void connection() {
        System.out.println("MySQL DB Connection is created");
    }
}
