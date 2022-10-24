/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.controller;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.util.ArrayList;


import pl.polsl.student.jakunow552.bestbankingoffer.view.GraphicalUserInterface;
import pl.polsl.student.jakunow552.bestbankingoffer.view.TextUserInterface;

/**
 *
 * @author Student ETO-A 15
 */
public class Controller {
    private ArrayList<String> params = new ArrayList<>();
    private TextUserInterface tui = new TextUserInterface();
    
     public Controller(String[] args)
    {
        
        for(int i =0 ; i < args.length; i++)
        {
            params.add(args[i]);
        }
    }
    
    public void start()
    {
        
        if(params.isEmpty()){
               
        FlatDarculaLaf.setup();
        
    var window = new GraphicalUserInterface();
                window.setVisible(true);
               
        }
        else if(params.contains("-help")){
            tui.textHelp();
        }
        else if (params.contains("-info")){
            tui.info();
        }
        else{
            tui.invalidParams();
            tui.textHelp();
        }
        
        
        
    }
}
