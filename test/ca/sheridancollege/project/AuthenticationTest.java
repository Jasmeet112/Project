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
public class AuthenticationTest {
    
    public AuthenticationTest() {
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
    public void testRegister() {
        System.out.println("register");
        String userID = "";
        String username = "";
        String password = "";
        String email = "";
        Authentication instance = new Authentication();
        boolean expResult = false;
        boolean result = instance.register(userID, username, password, email);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        Authentication instance = new Authentication();
        User expResult = null;
        User result = instance.login(username, password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String username = "";
        Authentication instance = new Authentication();
        User expResult = null;
        User result = instance.getUser(username);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
