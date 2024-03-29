package ie.atu.cicd1project2023registrationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "affirm", url = "http://notification-service:8082")
public interface NotifyClient {
    @PostMapping("/subscribe")
    String anyDetails(@RequestBody PersonDetails personDetails);
}
