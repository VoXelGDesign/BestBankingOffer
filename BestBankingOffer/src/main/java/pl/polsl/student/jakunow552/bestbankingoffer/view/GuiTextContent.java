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
            as a bank customer
            """;
    //Text content of the "Usage" tab
    private String usage;
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
