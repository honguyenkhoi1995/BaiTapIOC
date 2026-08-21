package com.example.demo.component;

import java.util.UUID;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    private final String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }
}
