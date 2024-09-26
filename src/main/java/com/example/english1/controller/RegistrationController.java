package com.example.english1.controller;

import com.example.english1.bean.Registration;
import com.example.english1.dto.RegistrationDTO;
import com.example.english1.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/save")
    public Registration createRegistration(@RequestBody RegistrationDTO registrationDTO) {
        return registrationService.saveRegistration(registrationDTO);
    }

    @GetMapping
    public List<Registration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }
}
