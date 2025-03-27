package com.ram.practice.design.pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

   private final  DatabaseFactory databaseFactory;

    public DatabaseService(DatabaseFactory databaseFactory) {
        this.databaseFactory = databaseFactory;
    }


    public void performDatabaseOperations(){
        DatabaseConnection databaseConnection = databaseFactory.getConnection();
        QueryExecutor queryExecutor = databaseFactory.getQueryExecutor();

        databaseConnection.connection();
        queryExecutor.execute("Selcect * from Users");
    }


}
