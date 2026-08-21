package com.example.demo.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "feature", havingValue = "true")
public class FeatureService {
    public String getMessage() {
        return "Feature is enabled";
    }
}
