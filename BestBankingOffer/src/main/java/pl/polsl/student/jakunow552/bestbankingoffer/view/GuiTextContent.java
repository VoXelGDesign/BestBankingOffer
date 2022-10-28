/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer.view;

/**
 *
 * @author tryne
 */
public class GuiTextContent {
    private String general = 
            "Best banking offer app allows to directly compare banking offers of specific category:\n\n"
            + "- CREDIT\n"
            + "- PERSONAL ACCOUNT\n"
            + "- SAVINGS ACCOUNT\n\n"
            + "Each of this categories contains different properties for example credit offer has\n "
            + "data about rate of intrest and service , personal account gives all fees that you pay\n"
            + "as a bank customer";
    private String usage;
    private String consoleArgs;
    
    public String getGeneral()
    {
        return general;
    }
    
    public String getUsage()
    {
        return usage;
    }
    
    public String getConsoleArgs()
    {
        return consoleArgs;
    }
}
