/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pl.polsl.student.jakunow552.bestbankingoffer.model.CreditOffer;

/**
 *
 * @author tryne
 */
public class JUnitTest {

    public JUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void typeCoheranceTest() {
        assertEquals(1,1);                 
    }
    @Test
    public void compareTest() {
        assertEquals(new CreditOffer("Mbank",1,1),new CreditOffer("Mbank",1,1).compareOffers(new CreditOffer("Mbank",1,1)));                 
    }
}
