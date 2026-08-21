package com.example.demo.controller;

import com.example.demo.component.PrototypeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrototypeController {
    private final PrototypeBean bean1;
    private final PrototypeBean bean2;

    public PrototypeController(PrototypeBean bean1, PrototypeBean bean2) {
        this.bean1 = bean1;
        this.bean2 = bean2;
    }

    @GetMapping("/prototype")
    public String checkPrototype() {
        return "Bean 1: " + bean1.getId()
            + "\nBean 2: " + bean2.getId()
            + "\nSame instance: " + (bean1 == bean2);
    }
}
