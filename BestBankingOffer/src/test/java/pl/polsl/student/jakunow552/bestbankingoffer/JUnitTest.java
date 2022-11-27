/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pl.polsl.student.jakunow552.bestbankingoffer.model.CreditOffer;
import pl.polsl.student.jakunow552.bestbankingoffer.model.NegativePropertyException;
import pl.polsl.student.jakunow552.bestbankingoffer.model.PersonalAccountOffer;
import pl.polsl.student.jakunow552.bestbankingoffer.model.TypeException;

/**
 * JUnit Test Class
 *
 * @version 2.0-FINAL
 * @author Jakub Nowakowski
 */
public class JUnitTest {

    /*
     *   Test checks if negative value of any credit offer property, set by constructor 
     *   or method is going to throw an exception
     */
    @ParameterizedTest
    @ValueSource(floats = {-1, -0.01f, -700, -2000})
    public void checkIfnegativeCreditPropertiesThrowsExceptionTest(float value) {
        assertThrows(NegativePropertyException.class, () -> {
            var offer = new CreditOffer("Mbank", value, 2);
        });
        assertThrows(NegativePropertyException.class, () -> {
            var offer = new CreditOffer("Mbank", 1, 2);
            offer.setRateOfInterest(value);
        });
        assertThrows(NegativePropertyException.class, () -> {
            var offer = new CreditOffer("Mbank", 1, 2);
            offer.setServiceCharge(value);
        });
        assertThrows(NegativePropertyException.class, () -> {
            var offer = new CreditOffer("Mbank", 1, value);
        });
    }

    /*
     *   Test checks if negative value of any personal account offer property, set by constructor 
     *   or method is going to throw an exception
     */
    @ParameterizedTest
    @ValueSource(floats = {-1, -0.01f, -700, -2000})
    public void checkIfNegativePersonalAccountPropertiesThrowsExceptionTest(float value) {
        assertThrows(NegativePropertyException.class, () -> {
            var offer = new PersonalAccountOffer("Mbank", value, 2);
        });
        assertThrows(NegativePropertyException.class, () -> {
            var offer = new PersonalAccountOffer("Mbank", 1, value);
        });
        assertThrows(NegativePropertyException.class, () -> {
            var offer = new PersonalAccountOffer("Mbank", 1, 2);
            offer.setMonthlyFee(value);
        });
        assertThrows(NegativePropertyException.class, () -> {
            var offer = new PersonalAccountOffer("Mbank", 1, 2);
            offer.setInterest(value);
        });
    }

    /*
     *   Test checks if normal value of any credit offer property, set by constructor 
     *   or method is not going to throw an exception
     */
    @ParameterizedTest
    @ValueSource(floats = {0, 1, 0.01f, 700, 2000})
    public void checkIfNormalCreditPropertiesDoesNotThrowExceptionTest(float value) {
        assertDoesNotThrow(() -> {
            var offer = new CreditOffer("Mbank", value, 2);
        });
        assertDoesNotThrow(() -> {
            var offer = new CreditOffer("Mbank", 1, 2);
            offer.setRateOfInterest(value);
        });
        assertDoesNotThrow(() -> {
            var offer = new CreditOffer("Mbank", 1, 2);
            offer.setServiceCharge(value);
        });
        assertDoesNotThrow(() -> {
            var offer = new CreditOffer("Mbank", 1, value);
        });
    }

    /*
     *   Test checks if normal value of any personal account offer property, set by constructor 
     *   or method is not going to throw an exception
     */
    @ParameterizedTest
    @ValueSource(floats = {0, 1, 0.01f, 700, 2000})
    public void checkIfNormalPersonalAccountPropertiesDoesNotThrowExceptionTest(float value) {
        assertDoesNotThrow(() -> {
            var offer = new PersonalAccountOffer("Mbank", value, 2);
        });
        assertDoesNotThrow(() -> {
            var offer = new PersonalAccountOffer("Mbank", 1, value);
        });
        assertDoesNotThrow(() -> {
            var offer = new PersonalAccountOffer("Mbank", 1, 2);
            offer.setMonthlyFee(value);
        });
        assertDoesNotThrow(() -> {
            var offer = new PersonalAccountOffer("Mbank", 1, 2);
            offer.setInterest(value);
        });
    }

    /*
    *   Test checks if comparing credit offers with same value returns null
     */
    @ParameterizedTest
    @ValueSource(floats = {3, 4, 5})
    public void creditOfferClassCompareMethodTestIfEquals(float value) {
        var testObject1 = new CreditOffer("Mbank", value, value);
        var testObject2 = new CreditOffer("Mbank", value, value);
        assertEquals(null, testObject2.compareOffers(testObject1));
    }

    /*
    *   Test checks if comparing personal account offers with same value returns null
     */
    @ParameterizedTest
    @ValueSource(floats = {3, 4, 5})
    public void personalOfferClassCompareMethodTestIfEquals(float value) {
        var testObject1 = new PersonalAccountOffer("Mbank", value, value);
        var testObject2 = new PersonalAccountOffer("Mbank", value, value);
        assertEquals(null, testObject2.compareOffers(testObject1));
    }

    /*
    *   Test checks if comparing different credit offers returns better offer
     */
    @ParameterizedTest
    @ValueSource(floats = {3, 4, 5})
    public void creditOfferClassCompareMethodTest(float value) {
        var testObject1 = new CreditOffer("Mbank", 1, 1);
        var testObject2 = new CreditOffer("Mbank", 1, value);
        assertEquals(testObject1, testObject2.compareOffers(testObject1));
    }

    /*
    *   Test checks if comparing different personal account offers returns better offer
     */
    @ParameterizedTest
    @ValueSource(floats = {3, 4, 5})
    public void personalOfferClassCompareMethodTest(float value) {
        var testObject1 = new PersonalAccountOffer("Mbank", 1, value);
        var testObject2 = new PersonalAccountOffer("Mbank", 1, 2);
        assertEquals(testObject2, testObject2.compareOffers(testObject1));
    }

    /*
    *   Test checks if comparing different type of banking offers throws an exception
     */
    @ParameterizedTest
    @ValueSource(floats = {1, 2, 3})
    public void checkIfComapringDifferentTypeOffersThrowsException(float value) {
        var testObject1 = new PersonalAccountOffer("Mbank", value, value);
        var testObject2 = new CreditOffer("Mbank", value, value);
        assertThrows(TypeException.class, () -> {
            testObject2.compareOffers(testObject1);
        });
    }

}
