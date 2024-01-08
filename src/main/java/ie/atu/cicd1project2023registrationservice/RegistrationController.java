package ie.atu.cicd1project2023registrationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/Verify")
    public String verifyDetails(@RequestBody PersonDetails personDetails) {
        String verificationMessage = String.format("Confirming %s email %s has purchased following purchase", personDetails.getName(), personDetails.getEmail());
        return verificationMessage;

    }
}

