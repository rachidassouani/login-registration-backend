package io.rachidassouani.loginregistrationbackend.repository;

import io.rachidassouani.loginregistrationbackend.dto.RegistrationRequest;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class RegistrationRepository {

    public String register(RegistrationRequest request) {
        return "Saved!";
    }
}
