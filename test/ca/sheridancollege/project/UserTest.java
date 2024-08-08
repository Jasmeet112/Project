/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jassk
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        User instance = null;
        String expResult = "";
        String result = instance.getUserID();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        User instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateProfile() {
        System.out.println("updateProfile");
        String username = "";
        String password = "";
        String email = "";
        User instance = null;
        instance.updateProfile(username, password, email);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetUserDetails() {
        System.out.println("getUserDetails");
        User instance = null;
        String expResult = "";
        String result = instance.getUserDetails();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
