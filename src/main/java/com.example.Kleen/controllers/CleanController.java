package com.example.Kleen.controllers;

import com.example.Kleen.dtos.request.RegisterRequest;
import com.example.Kleen.dtos.response.RegisterResponse;
import com.example.Kleen.services.CleanerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CleanController {

    private CleanerService cleanerService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request) {
        return new ResponseEntity<>(cleanerService.register(request), HttpStatus.OK);
    }
}
