package com.example.Kleen.controllers;

import com.example.Kleen.services.FibonacciService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

    @GetMapping("/{n}")
    public int getFibonacci(@PathVariable int n) {
        return FibonacciService.fibonacci(n);
    }
}
