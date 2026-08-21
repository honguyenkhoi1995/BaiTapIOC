package com.example.demo.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PortConfig {
    @Value("${app.port}")
    private int port;

    public int getPort() {
        return port;
    }
}
