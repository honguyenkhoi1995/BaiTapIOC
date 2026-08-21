package com.example.demo.controller;

import com.example.demo.configproperties.DatabaseConfig;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
    private final DatabaseConfig databaseConfig;

    public DatabaseController(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }

    @GetMapping("/database")
    public Map<String, String> getDatabaseConfig() {
        return Map.of(
            "url", databaseConfig.getUrl(),
            "username", databaseConfig.getUsername()
        );
    }
}
