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
 * @version 3.0-FINAL
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
     * Start method take care of inicializing controler, handling exepctions,
     * initializes graphical user interface, sends and control data.<p>
     * To achive dark swing theme it utilize
     * {@link com.formdev.flatlaf.FlatDarculaLaf} setup method.
     */
    public void start() {

        //Hardwired objects added to list to show app functionality
        String descriptionKontoDlaMlodych = "\"Oferty bankowe kont dla m??odych s?? to specjalne produkty bankowe skierowane do m??odych ludzi, kt??rzy dopiero rozpoczynaj?? swoj?? przygod?? z bankowo??ci??. Taka oferta mo??e obejmowa?? konto osobiste, kart?? debetow??, a tak??e dodatkowe us??ugi i udogodnienia dostosowane do potrzeb i oczekiwa?? m??odych klient??w.\"";
        String descriptionZwykleKonto = "\"Oferty zwyk??ych kont osobistych to produkty bankowe, kt??re umo??liwiaj?? klientom przechowywanie i zarz??dzanie swoimi pieni??dzmi. Zwyk??e konto osobiste pozwala na dokonywanie wp??at i wyp??at got??wki, p??acenie rachunk??w, a tak??e korzystanie z r????nego rodzaju us??ug bankowych, takich jak przelewy, czy te?? wymiana walut.\"";
        String descriptionKupTeraz = "\"Oferta \"kup teraz, zap??a?? za miesi??c\" to specjalna propozycja skierowana do klient??w, kt??rzy chc?? naby?? okre??lony produkt, ale nie dysponuj?? od razu wystarczaj??cymi ??rodkami na jego zakup. Dzi??ki tej ofercie klient mo??e zakupi?? wybrany produkt natychmiast, a zap??aci?? za niego dopiero po up??ywie okre??lonego czasu - zazwyczaj jednego miesi??ca.\"";
        String descriptionNaToCoLubisz = "\"Oferta chwil??wki to propozycja po??yczki kr??tkoterminowej, kt??ra umo??liwia klientowi szybkie uzyskanie potrzebnych ??rodk??w finansowych na kr??tki okres czasu - zazwyczaj od kilku dni do kilku tygodni. Chwil??wka jest cz??sto stosowana jako szybkie i proste rozwi??zanie dla os??b, kt??re potrzebuj?? pilnej got??wki, ale nie mog?? lub nie chc?? skorzysta?? z tradycyjnych form po??yczania.\"";
        String descriptionKredytNaDom = "\"Oferta kredytu na dom to propozycja finansowania zakupu nieruchomo??ci mieszkaniowej. Kredyt na dom umo??liwia klientowi uzyskanie potrzebnych ??rodk??w finansowych na sfinansowanie zakupu wybranej nieruchomo??ci. Zazwyczaj oferta kredytu na dom obejmuje r????nego rodzaju kredyty hipoteczne, kt??re pozwalaj?? na sfinansowanie zakupu nieruchomo??ci w ca??o??ci lub cz????ci.\"";

        offersList.add(new CreditOffer("Mbank", "Kredyt na dom", 1.5f, 100.27f, descriptionKredytNaDom));
        offersList.add(new CreditOffer("Milenium", "Na to co lubisz", 1.4f, 100.27f, descriptionNaToCoLubisz));
        offersList.add(new CreditOffer("Santander", "Kup teraz a zap??a?? za miesi??c", 1.6f, 1.27f, descriptionKupTeraz));
        offersList.add(new PersonalAccountOffer("Milenium", "Konto dla m??odych", 1.5f, 10f, descriptionKontoDlaMlodych));
        offersList.add(new PersonalAccountOffer("Revolut", "Zwykle konto", 1.6f, 10f, descriptionZwykleKonto));
        //*********************************************************

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
