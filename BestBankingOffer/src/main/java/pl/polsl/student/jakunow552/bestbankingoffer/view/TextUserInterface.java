/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.view;

import java.util.Scanner;

/**
 *
 * @author Student ETO-A 15
 */
public class TextUserInterface {
    
    public String displayAndGet(String Message){
        System.out.println(Message);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        return userInput;
    }
    
    public void textHelp(){
        System.out.println("Parameters:");
        System.out.println("-help <Display help>");
        System.out.println("-info <Display info about application>");
        System.out.println("Lack of arguments displays graphical user interface");
    }
    
    public void info()
    {
        System.out.println("Info: ");
        System.out.println("Written in JAVA ");
        System.out.println("by Jakub Nowakowski ver 1.0");
        System.out.println("Application compares banking offers.");
    }
    
    public void invalidParams(){
        System.out.println("Invalid params!");
    }
}
