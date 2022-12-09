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
 * {@link Controller#params} - list of params passed by program entry point.
 * <p>
 * {@link Controller#tui} - object of text user interface.<p>
 * {@link Controller#offersList} - list of offers to operate and display
 * them.<p>
 * @version 2.0-FINAL
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
     *
     * @param args string array with arguments recived from entry point.
     */
    public Controller(String[] args) {
        for (String arg : args) {
            params.add(arg);
        }
    }

    /**
     * Start method take care of inicializing controler,
     * handling exepctions, initializes graphical user interface, sends and
     * control data.<p>
     * To achive dark swing theme it utilize
     * {@link com.formdev.flatlaf.FlatDarculaLaf} setup method.
     */
    public void start() {

        //Hardwired objects added to list to show app functionality
        String descriptionKontoDlaMlodych = "\"Oferty bankowe kont dla młodych są to specjalne produkty bankowe skierowane do młodych ludzi, którzy dopiero rozpoczynają swoją przygodę z bankowością. Taka oferta może obejmować konto osobiste, kartę debetową, a także dodatkowe usługi i udogodnienia dostosowane do potrzeb i oczekiwań młodych klientów.\"";
        String descriptionZwykleKonto = "\"Oferty zwykłych kont osobistych to produkty bankowe, które umożliwiają klientom przechowywanie i zarządzanie swoimi pieniędzmi. Zwykłe konto osobiste pozwala na dokonywanie wpłat i wypłat gotówki, płacenie rachunków, a także korzystanie z różnego rodzaju usług bankowych, takich jak przelewy, czy też wymiana walut.\"";
        String descriptionKupTeraz = "\"Oferta \"kup teraz, zapłać za miesiąc\" to specjalna propozycja skierowana do klientów, którzy chcą nabyć określony produkt, ale nie dysponują od razu wystarczającymi środkami na jego zakup. Dzięki tej ofercie klient może zakupić wybrany produkt natychmiast, a zapłacić za niego dopiero po upływie określonego czasu - zazwyczaj jednego miesiąca.\"";
        String descriptionNaToCoLubisz = "\"Oferta chwilówki to propozycja pożyczki krótkoterminowej, która umożliwia klientowi szybkie uzyskanie potrzebnych środków finansowych na krótki okres czasu - zazwyczaj od kilku dni do kilku tygodni. Chwilówka jest często stosowana jako szybkie i proste rozwiązanie dla osób, które potrzebują pilnej gotówki, ale nie mogą lub nie chcą skorzystać z tradycyjnych form pożyczania.\"";
        String descriptionKredytNaDom = "\"Oferta kredytu na dom to propozycja finansowania zakupu nieruchomości mieszkaniowej. Kredyt na dom umożliwia klientowi uzyskanie potrzebnych środków finansowych na sfinansowanie zakupu wybranej nieruchomości. Zazwyczaj oferta kredytu na dom obejmuje różnego rodzaju kredyty hipoteczne, które pozwalają na sfinansowanie zakupu nieruchomości w całości lub części.\"";

        offersList.add(new CreditOffer("Mbank", "Kredyt na dom", 1.5f, 100.27f,descriptionKredytNaDom));
        offersList.add(new CreditOffer("Milenium", "Na to co lubisz", 1.4f, 100.27f, descriptionNaToCoLubisz));
        offersList.add(new CreditOffer("Santander", "Kup teraz a zapłać za miesiąc", 1.6f, 1.27f, descriptionKupTeraz));
        offersList.add(new PersonalAccountOffer("Milenium", "Konto dla młodych", 1.5f, 10f,descriptionKontoDlaMlodych));
        offersList.add(new PersonalAccountOffer("Revolut", "Zwykle konto", 1.6f, 10f,descriptionZwykleKonto));
        //*********************************************************
        

        //Example of user exeption handling
        try {
            offersList.get(2).compareOffers(offersList.get(1));
        } catch (Exception e) {
            tui.displayException(e);
        }

        try {
            offersList.get(1).setProperty("Rate of Interest", -1);
        } catch (Exception e) {
            tui.displayException(e);
        }

        //Main initialization in respect to provided arguments 
        if (params.isEmpty()) {

            //FlatDraculaLaf object initialization for dark theme of graphical user interface
            FlatDarculaLaf.setup();

            //Main initialization of Swing graphical interface with data upload.
            var window = new GraphicalUserInterface();
            window.uploadOffersList(this.offersList);
            window.setVisible(true);

        } else if (params.contains("-help")) {
            tui.textHelp();
        } else if (params.contains("-info")) {
            tui.info();
        } else {
            tui.invalidParams();
            tui.textHelp();
        }

    }

}
