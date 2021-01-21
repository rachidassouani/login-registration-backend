package io.rachidassouani.loginregistrationbackend.controller;

import io.rachidassouani.loginregistrationbackend.dto.RegistrationRequest;
import io.rachidassouani.loginregistrationbackend.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }
}
