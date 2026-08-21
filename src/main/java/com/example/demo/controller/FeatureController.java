package com.example.demo.controller;

import com.example.demo.conditional.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureController {
    private final FeatureService featureService;

    @Autowired(required = false)
    public FeatureController(FeatureService featureService) {
        this.featureService = featureService;
    }

    @GetMapping("/feature")
    public String getFeature() {
        if (featureService == null) {
            return "Feature is disabled";
        }
        return featureService.getMessage();
    }
}
