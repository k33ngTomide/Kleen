package com.example.Kleen.services;


import com.example.Kleen.dtos.request.RegisterRequest;
import com.example.Kleen.dtos.response.RegisterResponse;

public interface CleanerService {

    RegisterResponse register(RegisterRequest registerRequest);
}
