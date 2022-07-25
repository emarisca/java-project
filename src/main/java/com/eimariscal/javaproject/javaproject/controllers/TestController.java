package com.eimariscal.javaproject.javaproject.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public ArrayList<String> getTest() {
        return new ArrayList<String>() {
            {
                add("Geeks");
                add("for");
                add("Geeks");
            }
        };
    }
}
