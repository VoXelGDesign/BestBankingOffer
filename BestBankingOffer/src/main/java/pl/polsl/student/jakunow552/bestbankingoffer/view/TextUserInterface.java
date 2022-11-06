/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.view;

import java.util.Scanner;

/**
 * Text user interface class, this class is used for program interaction with console.
 * @version 1.0-FINAL
 * @author Jakub Nowakowski
 */
public class TextUserInterface {
    /**
     * This method gets {@link String} message as a parameter, and ask user for response.
     * @param Message displayed in console.
     * @return {@link String} user input.
     */
    public String displayAndGet(String Message){
        System.out.println(Message);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        return userInput;
    }
    /**
     * Dispalys help content in console.
     */
    public void textHelp(){
        System.out.println("Parameters:");
        System.out.println("-help <Display help>");
        System.out.println("-info <Display info about application>");
        System.out.println("Lack of arguments displays graphical user interface");
    }
    /**
     * Dispalys info content in console.
     */
    public void info()
    {
        System.out.println("Info: ");
        System.out.println("Written in JAVA ");
        System.out.println("by Jakub Nowakowski ver 1.0-FINAL");
        System.out.println("Application compares banking offers.");
    }
    /**
     * Dispalys warning about invalid starting parameters in console.
     */
    public void invalidParams(){
        System.out.println("Invalid params!");
    }
    /**
     * Dispalys exepction that was thrown, in console.
     * @param e exeption that was thrown.
     */
    public void displayException(Exception e){
        System.out.println("Exepction caught: "+e);
    }
}
