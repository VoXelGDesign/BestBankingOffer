/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.controller;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.util.ArrayList;
import pl.polsl.student.jakunow552.bestbankingoffer.model.BankingOffer;
import pl.polsl.student.jakunow552.bestbankingoffer.model.CreditOffer;
import pl.polsl.student.jakunow552.bestbankingoffer.model.PersonalAccountOffer;
import pl.polsl.student.jakunow552.bestbankingoffer.view.GraphicalUserInterface;
import pl.polsl.student.jakunow552.bestbankingoffer.view.TextUserInterface;


/**
 * Controller class, this class controls application logic.
 * <p>
 * {@link Controller#params} - list of params passed by program entry point. <p>
 * {@link Controller#tui} - object of text user interface.<p>
 * {@link Controller#offersList} - list of offers to operate and display them.<p>
 * @version 1.0-FINAL
 * @author Jakub Nowakowski
 */
public class Controller {
    //List of parameters provided in the entry point.
    private ArrayList<String> params = new ArrayList<>();
    // Text user interafce object
    private TextUserInterface tui = new TextUserInterface();
    // List of offers that are stored.
    private ArrayList<BankingOffer> offersList = new ArrayList<>();
    
    /**
 * Controller constructor - parses aruments to ArrayList object of Strings.
 * @param args string array with arguments recived from entry point.
 */
     public Controller(String[] args)
    {        
        for (String arg : args) {
            params.add(arg);
        }
    }
    
     /**
 * Start method take care of inicializing controler,
 * handling exepctions, initializes graphical user interface, sends and control data.<p>
 * To achive dark swing theme it utilize {@link com.formdev.flatlaf.FlatDarculaLaf} setup method.
 */
    public void start()
    {
        
        //Hardwired objects added to list to show app functionality
        
        offersList.add(new CreditOffer("Mbank","Kredyt na dom",1.5f,100.27f));
        offersList.add(new CreditOffer("Santander","Kup teraz a zapłać za miesiąc",1.6f,1.27f));
        offersList.add(new PersonalAccountOffer("Milenium","Konto dla młodych",1.5f,10f));
        offersList.get(0).setDescription("\"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?\"");
        offersList.get(1).setDescription("\"But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?\"");     
        
        
        //Example of user exeption handling
        
        try{
        offersList.get(2).compareOffers(offersList.get(1));
        }
        catch(Exception e){
            tui.displayException(e);
        }
        
        
        //Main initialization in respect to provided arguments 
         
        if(params.isEmpty()){
            
             //FlatDraculaLaf object initialization for dark theme of graphical user interface
                                       
            FlatDarculaLaf.setup();
            
            //Main initialization of Swing graphical interface with data upload.
             
            var window = new GraphicalUserInterface();
            window.uploadOffersList(this.offersList);
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
