package ie.atu.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class unitTest {
    @Test
    public void NoArgsConstructorTest() {
        PersonDetails personDetails = new PersonDetails();

        assertNotNull(personDetails);
        assertNull(personDetails.getName());
        assertNull(personDetails.getEmail());
    }

    @Test
    public void AllArgsConstructorTest() {
        String name = "Jane Doe";
        String email = "jane@atu.ie";

        PersonDetails personDetails = new PersonDetails(name, email);
        assertNotNull(personDetails);
        assertEquals(name, personDetails.getName());
        assertEquals(email, personDetails.getEmail());  //Check the email matches the provided value
    }

    @Test
    public void GetterAndSetterTest() {

        PersonDetails personDetails = new PersonDetails();
        String name = "Jane Doe";
        String email = "jane@atu.ie";

        personDetails.setName(name);
        personDetails.setEmail(email);

        assertEquals("Jane Doe", personDetails.getName());
        assertEquals("jane@atu.ie", personDetails.getEmail());

    }

    public class PersonDetails {
        String name;
        String email;

        public PersonDetails(String name, String email) {
            this.name = name;
            this.email = email;
        }

        //Default constructor. No parameters
        public PersonDetails() {

        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
    }
}
