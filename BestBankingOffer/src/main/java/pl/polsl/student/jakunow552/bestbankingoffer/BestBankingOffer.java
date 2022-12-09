/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pl.polsl.student.jakunow552.bestbankingoffer;

import pl.polsl.student.jakunow552.bestbankingoffer.controller.Controller;

/**
 *
 * Class contains program entry point(main),
 * creates controller with args passed to the constructor.
 * Uses method "start" to initialize controller.
 *
 * @version 3.0-FINAL
 * @author Jakub Nowakowski
 */
public class BestBankingOffer {

    /**
     * Program entry point
     *
     * @param args lunch parameters respects three arguments:
     * "-help", "-info" and no arguments, that result in
     * launching graphical user interface. If argumnts are invalid
     * console displays information that arguments are invalid and help
     * with list of valid arguments. Arguments has no parameters.
     */
    public static void main(String[] args) {
        Controller program = new Controller(args);
        program.start();
    }
}
