/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;
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
public class AIPlayerTest {
    
    public AIPlayerTest() {
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
    public void testPlayCard() {
        System.out.println("playCard");
        AIPlayer instance = null;
        Card expResult = null;
        Card result = instance.playCard();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPassCards() {
        System.out.println("passCards");
        List<Card> cardsToPass = null;
        AIPlayer instance = null;
        instance.passCards(cardsToPass);
        fail("The test case is a prototype.");
    }
    
}
