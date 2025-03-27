package com.ram.practice.design.pattern;

import org.springframework.stereotype.Component;

@Component
public class MySQLFactory implements DatabaseFactory{
    private final MySQLConnection mySQLConnection;
    private final MySQLQueryExecutor mySQLQueryExecutor;

    public MySQLFactory(MySQLConnection mySQLConnection, MySQLQueryExecutor mySQLQueryExecutor) {
        this.mySQLConnection = mySQLConnection;
        this.mySQLQueryExecutor = mySQLQueryExecutor;
    }


    @Override
    public DatabaseConnection getConnection() {
        return mySQLConnection;
    }

    @Override
    public QueryExecutor getQueryExecutor() {
        return mySQLQueryExecutor;
    }
}
