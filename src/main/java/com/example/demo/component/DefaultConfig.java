package com.example.demo.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DefaultConfig {
    @Value("${app.message:Hello Spring}")
    private String message;

    public String getMessage() {
        return message;
    }
}
