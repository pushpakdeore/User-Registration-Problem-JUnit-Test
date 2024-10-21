package org.example;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {


    @Test
    void testValidFirstName_Happy() {
        assertTrue(Validation.isValidFirstName("John"));
    }

    @Test
    void testValidLastName_Happy() {
        assertTrue(Validation.isValidLastName("Doe"));
    }

    @Test
    void testValidEmail_Happy() {
        assertTrue(Validation.isValidEmail("john.doe@bl.co.in"));
    }

    @Test
    void testValidMobileNumber_Happy() {
        assertTrue(Validation.isValidMobileNumber("91 9919819801"));
    }

    @Test
    void testValidPassword_Happy() {
        assertTrue(Validation.isValidPassword("Password1"));
    }


    @Test
    void testInvalidFirstName_Sad() {
        assertFalse(Validation.isValidFirstName("john"));
        assertFalse(Validation.isValidFirstName("Jo"));
    }

    @Test
    void testInvalidLastName_Sad() {
        assertFalse(Validation.isValidLastName("doe"));
        assertFalse(Validation.isValidLastName("Do"));
    }

    @Test
    void testInvalidEmail_Sad() {
        assertFalse(Validation.isValidEmail("john.doe@bl"));
        assertFalse(Validation.isValidEmail("john.doe@.com"));
    }

    @Test
    void testInvalidMobileNumber_Sad() {
        assertFalse(Validation.isValidMobileNumber("91123456789"));  // Missing space
        assertFalse(Validation.isValidMobileNumber("91 12345"));     // Invalid length
    }

    @Test
    void testInvalidPassword_Sad() {
        assertFalse(Validation.isValidPassword("password1"));  // No uppercase
        assertFalse(Validation.isValidPassword("Password"));   // No number
        assertFalse(Validation.isValidPassword("Pass1"));      // Too short
    }
}