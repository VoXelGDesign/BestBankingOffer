/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.view;

/**
 * Graphical user interface text content class, this class store text that is
 * always displayed.
 *
 * @version 2.0-FINAL
 * @author Jakub Nowakowski
 */
public class GuiTextContent {

    //Text content of the "General" tab
    private String general
            = """              
            Best banking offer app allows to directly compare banking offers of specific category:
              
            - CREDIT
            - PERSONAL ACCOUNT
            - SAVINGS ACCOUNT
              
            Each of this categories contains different properties for example credit offer has
            data about rate of intrest and service , personal account gives all fees that you pay
            as a bank customer.
              
            An app compares banking offers is a type of application that allows users to easily compare different banking products, 
            from different financial institutions. This app provide detailed information about the offers, such as interest rates,
            fees, and allow users to compare the offers side by side to help them choose the best one for their needs.
            
            App also provide rankings or ratings of the offers, based on factors such as overall attractiveness, or other criteria.
            This can help users quickly identify the best offers and make an informed decision about which one to choose.
            """;
    //Text content of the "Usage" tab
    private String usage
            ="""
             To use an app that allows you to compare banking offers, you can follow these steps:
             
             1. Select the option to compare banking offers.
             
             2. Choose the type of banking product you are interested in from the available options.
             
             3. Select the offers you want to compare from the list of available options.
             
             4.Once you have  all the offers you want to compare,
             tap on the "Compare" button to see the comparison results.
             
             3. The app will display a comparison of the offers you selected,
             including details such as interest rates and other important conditions.
             
             4. The app may also display a ranking of the offers based on their overall attractiveness, 
             with the best offers at the top of the list.
             You can use the comparison and ranking information to help you choose the best offer for your needs.
             
             5. You can explore the app's features to see what options are available.
             """;
    //Text content of the "Console Arguments" tab
    private String consoleArgs
            = """
        Console Arguments:
             
        -help <Display help>
        -info <Display info about application>
             
        *Lack of arguments displays graphical user interface*
        """;

    /**
     * Returns text content of "General" tab.
     *
     * @return {@link String} general tab content.
     */
    public String getGeneral() {
        return general;
    }

    /**
     * Returns text content of "Usage" tab.
     *
     * @return {@link String} usage tab content.
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Returns text content of "Console Args" tab.
     *
     * @return {@link String} console arguments tab content.
     */
    public String getConsoleArgs() {
        return consoleArgs;
    }
}
