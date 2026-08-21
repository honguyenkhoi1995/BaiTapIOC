package com.example.demo.controller;

import com.example.demo.component.AppInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppInfoController {
    private final AppInfo appInfo;

    public AppInfoController(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    @GetMapping("/app-name")
    public String getAppName() {
        return appInfo.getAppName();
    }
}
