package com.example.demo.controller;

import com.example.demo.component.RoleConfig;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    private final RoleConfig roleConfig;

    public RoleController(RoleConfig roleConfig) {
        this.roleConfig = roleConfig;
    }

    @GetMapping("/roles")
    public List<String> getRoles() {
        return roleConfig.getRoles();
    }
}
