package com.example.demo.controller;

import com.example.demo.component.PortConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {
    private final PortConfig portConfig;

    public PortController(PortConfig portConfig) {
        this.portConfig = portConfig;
    }

    @GetMapping("/port")
    public int getPort() {
        return portConfig.getPort();
    }
}
