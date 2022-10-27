/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.controller;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.util.ArrayList;
import java.util.HashMap;
import pl.polsl.student.jakunow552.bestbankingoffer.model.BankingOffer;
import pl.polsl.student.jakunow552.bestbankingoffer.model.CreditOffer;


import pl.polsl.student.jakunow552.bestbankingoffer.view.GraphicalUserInterface;
import pl.polsl.student.jakunow552.bestbankingoffer.view.TextUserInterface;

/**
 *
 * @author Student ETO-A 15
 */
public class Controller {
    private ArrayList<String> params = new ArrayList<>();
    private TextUserInterface tui = new TextUserInterface();
    private ArrayList<BankingOffer> offersList = new ArrayList<>();
    
     public Controller(String[] args)
    {
        
        for(int i =0 ; i < args.length; i++)
        {
            params.add(args[i]);
        }
    }
    
    
    public void start()
    {
        offersList.add(new CreditOffer("Mbank","Konto oszczednosciowe",1.5f,100.27f));
        offersList.add(new CreditOffer("Mbank","Konto jakiestam",1.6f,1.27f));
        if(params.isEmpty()){
               
            FlatDarculaLaf.setup();
        
            var window = new GraphicalUserInterface();
            window.setVisible(true);
            this.populateList(window,0);
            this.populateList(window,1);
            
        
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
    
    public void populateList(GraphicalUserInterface gui, int listIndex){
        if(listIndex == 0){
            for(int i = 0; i < offersList.size(); i++){
                gui.AddToFirstList(offersList.get(i).getOfferName());
            }
        }
        else if (listIndex == 1){
            for(int i = 0; i < offersList.size(); i++){
                gui.AddToSecondList(offersList.get(i).getOfferName());
            }
        }
        }
    
}
