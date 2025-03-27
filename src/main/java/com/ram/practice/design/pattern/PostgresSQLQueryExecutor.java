package com.ram.practice.design.pattern;

import org.springframework.stereotype.Component;

@Component
public class PostgresSQLQueryExecutor implements QueryExecutor {
    @Override
    public void execute(String query) {
        System.out.println("Query is executing on PostgresSQL DB");
    }
}
