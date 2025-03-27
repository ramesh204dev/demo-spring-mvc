package com.ram.practice.design.pattern;

import org.springframework.stereotype.Component;

@Component
public class PostgresSQLFactory implements DatabaseFactory{
    private final PostgresSQLConnection postgresSQLConnection;
    private final PostgresSQLQueryExecutor postgresSQLQueryExecutor;

    public PostgresSQLFactory(PostgresSQLConnection postgresSQLConnection, PostgresSQLQueryExecutor postgresSQLQueryExecutor) {
        this.postgresSQLConnection = postgresSQLConnection;
        this.postgresSQLQueryExecutor = postgresSQLQueryExecutor;
    }

    @Override
    public DatabaseConnection getConnection() {
        return postgresSQLConnection;
    }

    @Override
    public QueryExecutor getQueryExecutor() {
        return postgresSQLQueryExecutor;
    }
}
