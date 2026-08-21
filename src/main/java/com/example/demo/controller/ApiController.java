package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/api/1")
    public Map<String, Object> api1() {
        return Map.of("name", "An", "age", 20);
    }

    @GetMapping("/api/2")
    public List<String> api2() {
        return Arrays.asList("java", "spring", "json");
    }

    @GetMapping("/api/3")
    public Map<String, Object> api3() {
        return Map.of("user", Map.of("id", 1, "name", "Bình"));
    }

    @GetMapping("/api/4")
    public List<Map<String, Object>> api4() {
        return Arrays.asList(
            Map.of("id", 1, "name", "A"),
            Map.of("id", 2, "name", "B")
        );
    }

    @GetMapping("/api/5")
    public Map<String, Object> api5() {
        return Map.of("orders", Arrays.asList(
            Map.of("id", 1, "total", 100),
            Map.of("id", 2, "total", 200)
        ));
    }
}
