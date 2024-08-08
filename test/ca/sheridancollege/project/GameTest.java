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
public class GameTest {
    
    public GameTest() {
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
    public void testAddPlayer() {
        System.out.println("addPlayer");
        Player player = null;
        Game instance = null;
        instance.addPlayer(player);
        fail("The test case is a prototype.");
    }

    @Test
    public void testStartGame() {
        System.out.println("startGame");
        Game instance = null;
        instance.startGame();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPlay() {
        System.out.println("play");
        Game instance = null;
        instance.play();
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        String gameID = "";
        Game expResult = null;
        Game result = Game.getInstance(gameID);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEndRound() {
        System.out.println("endRound");
        Game instance = null;
        instance.endRound();
        fail("The test case is a prototype.");
    }

    @Test
    public void testEndGame() {
        System.out.println("endGame");
        Game instance = null;
        instance.endGame();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDisplayFinalScores() {
        System.out.println("displayFinalScores");
        Game instance = null;
        instance.displayFinalScores();
        fail("The test case is a prototype.");
    }
    
}
