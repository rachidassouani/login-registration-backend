package io.rachidassouani.loginregistrationbackend.service;

import io.rachidassouani.loginregistrationbackend.dto.RegistrationRequest;
import io.rachidassouani.loginregistrationbackend.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public String register(RegistrationRequest request) {
        return registrationRepository.register(request);
    }
}
