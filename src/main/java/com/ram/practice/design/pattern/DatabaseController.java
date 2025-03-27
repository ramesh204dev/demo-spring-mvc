package com.ram.practice.design.pattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/database")
public class DatabaseController {

    private final DatabaseService databaseService;

    public DatabaseController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    @GetMapping("/execute")
    public String executeQuery(){
        databaseService.performDatabaseOperations();
        return "Query is Executed on Database Successfully !!!";
    }
}
