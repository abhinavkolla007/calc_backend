package com.example.calcbackend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ArithmeticOperations {

    @GetMapping("add/{A}/{B}")
    public String add(@PathVariable("A") int a,@PathVariable("B") int b){
        return " " + (a+b);
    }
}
