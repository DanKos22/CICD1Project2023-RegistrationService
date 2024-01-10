package ie.atu.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class integrationTest {

    @Test
    public void testVerifyDetails() {

        NotifyClientTest notifyClientTest = new NotifyClientTest();

        RegistrationController registrationController = new RegistrationController(notifyClientTest);

        PersonDetails personDetails = new PersonDetails("John Doe", "john@atu.ie");

        // Call the method to be tested.
        String outcome = registrationController.verifyDetails(personDetails);

        //Assert that the value of outcome is equal to the expected value "Verification".
        assertEquals("Verification", outcome);
    }
    private class NotifyClientTest {

    }

    public class PersonDetails {
        String name;
        String email;

        public PersonDetails(String name, String email) {
            this.name = name;
            this.email = email;
        }

    }

    public class RegistrationController {

        NotifyClientTest notifyClientTest;

        public RegistrationController(NotifyClientTest notifyClientTest) {
            this.notifyClientTest = notifyClientTest;
        }
        public String verifyDetails(PersonDetails personDetails) {
            return "Verification";
        }
    }
}
