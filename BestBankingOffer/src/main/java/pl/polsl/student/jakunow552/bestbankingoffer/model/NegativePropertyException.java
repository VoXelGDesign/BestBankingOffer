/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.model;

/**
 *
 * @author tryne
 */
public class NegativePropertyException extends RuntimeException {

    NegativePropertyException(String bankName) {
        super("\n" + bankName + " offer has a negative property value");
    }
}
