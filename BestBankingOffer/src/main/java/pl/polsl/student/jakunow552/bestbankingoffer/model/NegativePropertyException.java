/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.model;

/**
 * User exception class - extends {@link RuntimeException}
 * .<p>
 * If exception is thrown, class property has negative value.<p>
 * Program do not allow to input negative properties.
 *
 * @version 3.0-FINAL
 * @author Jakub Nowakowski
 */
public class NegativePropertyException extends RuntimeException {

    NegativePropertyException(String bankName) {
        super("\n" + bankName + " offer has a negative property value");
    }
}
