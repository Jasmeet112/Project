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
public class DeckTest {
    
    public DeckTest() {
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
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        instance.shuffle();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeal() {
        System.out.println("deal");
        int numberOfCards = 0;
        Deck instance = new Deck();
        List<Card> expResult = null;
        List<Card> result = instance.deal(numberOfCards);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Deck instance = new Deck();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
