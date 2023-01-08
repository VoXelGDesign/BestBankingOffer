/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingofferweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.polsl.student.jakunow552.bestbankingofferweb.model.BankingOffer;
import pl.polsl.student.jakunow552.bestbankingofferweb.model.CreditOffer;
import pl.polsl.student.jakunow552.bestbankingofferweb.model.PersonalAccountOffer;

/**
 *
 * @author tryne
 */
@WebServlet(name = "RankingServlet", urlPatterns = {"/RankingServlet"})
public class RankingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     private ArrayList<BankingOffer> offersList = new ArrayList<>();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //Hardwired objects added to list to show app functionality
        String descriptionKontoDlaMlodych = "\"Oferty bankowe kont dla młodych są to specjalne produkty bankowe skierowane do młodych ludzi, którzy dopiero rozpoczynają swoją przygodę z bankowością. Taka oferta może obejmować konto osobiste, kartę debetową, a także dodatkowe usługi i udogodnienia dostosowane do potrzeb i oczekiwań młodych klientów.\"";
        String descriptionZwykleKonto = "\"Oferty zwykłych kont osobistych to produkty bankowe, które umożliwiają klientom przechowywanie i zarządzanie swoimi pieniędzmi. Zwykłe konto osobiste pozwala na dokonywanie wpłat i wypłat gotówki, płacenie rachunków, a także korzystanie z różnego rodzaju usług bankowych, takich jak przelewy, czy też wymiana walut.\"";
        String descriptionKupTeraz = "\"Oferta \"kup teraz, zapłać za miesiąc\" to specjalna propozycja skierowana do klientów, którzy chcą nabyć określony produkt, ale nie dysponują od razu wystarczającymi środkami na jego zakup. Dzięki tej ofercie klient może zakupić wybrany produkt natychmiast, a zapłacić za niego dopiero po upływie określonego czasu - zazwyczaj jednego miesiąca.\"";
        String descriptionNaToCoLubisz = "\"Oferta chwilówki to propozycja pożyczki krótkoterminowej, która umożliwia klientowi szybkie uzyskanie potrzebnych środków finansowych na krótki okres czasu - zazwyczaj od kilku dni do kilku tygodni. Chwilówka jest często stosowana jako szybkie i proste rozwiązanie dla osób, które potrzebują pilnej gotówki, ale nie mogą lub nie chcą skorzystać z tradycyjnych form pożyczania.\"";
        String descriptionKredytNaDom = "\"Oferta kredytu na dom to propozycja finansowania zakupu nieruchomości mieszkaniowej. Kredyt na dom umożliwia klientowi uzyskanie potrzebnych środków finansowych na sfinansowanie zakupu wybranej nieruchomości. Zazwyczaj oferta kredytu na dom obejmuje różnego rodzaju kredyty hipoteczne, które pozwalają na sfinansowanie zakupu nieruchomości w całości lub części.\"";

        offersList.add(new CreditOffer("Mbank", "Kredyt na dom", 1.5f, 100.27f, descriptionKredytNaDom));
        offersList.add(new CreditOffer("Milenium", "Na to co lubisz", 1.4f, 100.27f, descriptionNaToCoLubisz));
        offersList.add(new CreditOffer("Santander", "Kup teraz a zapłać za miesiąc", 1.6f, 1.27f, descriptionKupTeraz));
        offersList.add(new PersonalAccountOffer("Milenium", "Konto dla młodych", 1.5f, 10f, descriptionKontoDlaMlodych));
        offersList.add(new PersonalAccountOffer("Revolut", "Zwykle konto", 1.6f, 10f, descriptionZwykleKonto));
        //*********************************************************
        
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RankingServlet</title>");            
            out.println("</head>");
            out.println("<body>");
           
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
