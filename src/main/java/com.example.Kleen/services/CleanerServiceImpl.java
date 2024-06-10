package com.example.Kleen.services;

import com.example.Kleen.dtos.request.RegisterRequest;
import com.example.Kleen.dtos.response.RegisterResponse;
import com.example.Kleen.model.Cleaner;
import com.example.Kleen.repository.CleanerRepository;
import org.springframework.stereotype.Service;

@Service
public class CleanerServiceImpl implements CleanerService {

    private CleanerRepository cleanerRepository;

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        Cleaner cleaner = new Cleaner();
        cleaner.setPassword(registerRequest.getPassword());
        cleaner.setUsername(registerRequest.getUsername());

        cleanerRepository.save(cleaner);
        RegisterResponse response = new RegisterResponse();
        response.setMessage("Registration successful");
        return response;
    }
}
