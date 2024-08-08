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
public class TrickTest {
    
    public TrickTest() {
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
    public void testAddCard() {
        System.out.println("addCard");
        Card card = null;
        Player player = null;
        Trick instance = new Trick();
        instance.addCard(card, player);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetWinner() {
        System.out.println("getWinner");
        Trick instance = new Trick();
        Player expResult = null;
        Player result = instance.getWinner();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalculatePoints() {
        System.out.println("calculatePoints");
        Trick instance = new Trick();
        int expResult = 0;
        int result = instance.calculatePoints();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
