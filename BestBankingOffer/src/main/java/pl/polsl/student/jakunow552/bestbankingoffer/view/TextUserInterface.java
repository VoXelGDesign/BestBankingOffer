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
    
    public void DisplayAndGet(String Message){
        System.out.println(Message);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
    }
}
