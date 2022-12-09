/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.model;

/**
 * User exception class - extends {@link RuntimeException}
 * .<p>
 * If exception is thrown, objects to compare have different types.<p>
 * Program do not allow to comapare different types of offers objects because
 * they have different properties.
 *
 * @version 3.0-FINAL
 * @author Jakub Nowakowski
 */
public class TypeException extends RuntimeException {

    TypeException() {
        super("\n" + "Type of offers differs!");
    }
}
