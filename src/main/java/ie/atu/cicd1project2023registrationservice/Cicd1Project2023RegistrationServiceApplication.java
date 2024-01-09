package ie.atu.cicd1project2023registrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Cicd1Project2023RegistrationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cicd1Project2023RegistrationServiceApplication.class, args);
    }



}
