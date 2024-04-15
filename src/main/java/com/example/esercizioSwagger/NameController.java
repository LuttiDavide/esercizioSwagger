package com.example.esercizioSwagger;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/name/reverse")
    public String reverseName(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }
}