package com.ram.practice.design.pattern;

import org.springframework.stereotype.Component;


public  interface DatabaseFactory {
    DatabaseConnection getConnection();
    QueryExecutor getQueryExecutor();
}
