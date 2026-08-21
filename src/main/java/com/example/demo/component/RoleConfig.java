package com.example.demo.component;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RoleConfig {
    @Value("#{'${app.roles}'.split(',')}")
    private List<String> roles;

    public List<String> getRoles() {
        return roles;
    }
}
