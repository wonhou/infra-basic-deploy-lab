// src/main/java/com/example/deploylab/BackendController.java

package com.example.deploylab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BackendController {

    @GetMapping("/backend")
    public String backend() {
        return "backend";
    }
}