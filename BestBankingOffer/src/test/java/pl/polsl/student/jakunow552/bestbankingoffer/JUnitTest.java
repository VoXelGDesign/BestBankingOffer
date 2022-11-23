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
import pl.polsl.student.jakunow552.bestbankingoffer.model.NegativePropertyException;
import pl.polsl.student.jakunow552.bestbankingoffer.model.PersonalAccountOffer;
import pl.polsl.student.jakunow552.bestbankingoffer.model.TypeException;

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
    public void negativeCreditPropertiesTest(){
          Exception exception1 = assertThrows(NegativePropertyException.class, () -> {
        var offer = new CreditOffer("Mbank", -1, 2);
    });
          Exception exception2 = assertThrows(NegativePropertyException.class, () -> {
        var offer = new CreditOffer("Mbank", 1, 2);
        offer.setRateOfInterest(-1);
    });
          Exception exception3 = assertThrows(NegativePropertyException.class, () -> {
        var offer = new CreditOffer("Mbank", 1, 2);
        offer.setServiceCharge(-1);
    });
           Exception exception4 = assertThrows(NegativePropertyException.class, () -> {
        var offer = new CreditOffer("Mbank", 1, -1);
    });
          
    }
    
    @Test
    public void negativePersonalAccountPropertiesTest(){
        Exception exception1 = assertThrows(NegativePropertyException.class, () -> {
        var offer = new PersonalAccountOffer("Mbank", -1, 2);
    });
        Exception exception2 = assertThrows(NegativePropertyException.class, () -> {
        var offer = new PersonalAccountOffer("Mbank", 1, -2);
    });
        Exception exception3 = assertThrows(NegativePropertyException.class, () -> {
        var offer = new PersonalAccountOffer("Mbank", 1, 2);
        offer.setMonthlyFee(-1);
    });
        Exception exception4 = assertThrows(NegativePropertyException.class, () -> {
        var offer = new PersonalAccountOffer("Mbank", 1, 2);
        offer.setInterest(-1);
    });
    }
    
    @Test
    public void compareTestCredit() {
        var testObject1 = new CreditOffer("Mbank",1,1);
        var testObject2 = new CreditOffer("Mbank",1,2);
        assertEquals(testObject1,testObject2.compareOffers(testObject1));
    }
    @Test
    public void compareTestPersonal() {
        var testObject1 = new PersonalAccountOffer("Mbank",1,50);
        var testObject2 = new PersonalAccountOffer("Mbank",1,2);
        assertEquals(testObject2,testObject2.compareOffers(testObject1));
    }
    
    @Test
    public void compareTestTypeException() {
        var testObject1 = new PersonalAccountOffer("Mbank",1,50);
        var testObject2 = new CreditOffer("Mbank",1,2);
        Exception exception = assertThrows(TypeException.class, () -> {
        testObject2.compareOffers(testObject1);
    });
    }
    
}
