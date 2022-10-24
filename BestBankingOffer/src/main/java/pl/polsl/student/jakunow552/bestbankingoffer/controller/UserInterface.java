/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.controller;

import java.util.ArrayList;
import pl.polsl.student.jakunow552.bestbankingoffer.view.TextUserInterface;

/**
 *
 * @author Student ETO-A 15
 */
public class UserInterface {
    private ArrayList<String> params = new ArrayList<>();
    private TextUserInterface tui = new TextUserInterface();
    
    public void getArgs(String[] args){
        
        if(args.length == 0){
            tui.DisplayAndGet("Arguments not found! Please prvoide them:");
        }
        else{
            for (int i = 0; i < args.length; i++) {
            params.add(args[i]);
        }
        }
    }
    public void start(){
        
    }
}
