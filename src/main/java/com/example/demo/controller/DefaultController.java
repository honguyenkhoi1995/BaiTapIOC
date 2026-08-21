package com.example.demo.controller;

import com.example.demo.component.DefaultConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    private final DefaultConfig defaultConfig;

    public DefaultController(DefaultConfig defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

    @GetMapping("/default")
    public String getDefault() {
        return defaultConfig.getMessage();
    }
}
