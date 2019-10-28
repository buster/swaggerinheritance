package com.example.swaggerinheritance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

    @PostMapping
    public void create(@RequestBody Animal animal) {
        System.out.println("test");
    }
}
