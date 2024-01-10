package ie.atu.cicd1project2023registrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    private NotifyClient notifyClient;
    @Autowired
    public RegistrationController(NotifyClient notifyClient) {
        this.notifyClient = notifyClient;
    }

    @PostMapping("/Verify")
    public String verifyDetails(@RequestBody PersonDetails personDetails) {
        String verificationMessage = String.format("Ticket request for Customer %s has been successful. The purchase is confirmed!", personDetails.getName(), personDetails.getEmail());
        return verificationMessage;
    }
    @PostMapping("/register")
    public String notifyDetails(@RequestBody PersonDetails personDetails){
        String notify = notifyClient.anyDetails(personDetails);
        return notify;
    }
}

