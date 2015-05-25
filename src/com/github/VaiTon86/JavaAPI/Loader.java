/**
 * 
 */
package com.github.VaiTon86.JavaAPI;

import java.io.IOException;

/**
 * The class that load the API
 * 
 * @author VaiTon86
 */
public class Loader {

    /**
     * Show the current status of JCore
     */
    public static String stato = "";
    /**
     * Show the info message prefix
     */
    public static String info = "Info >> ";
    /**
     * Show the attention message prefix
     */
    public static String attenzione = "Attention >> ";
    /**
     * Show the error message prefix
     */
    public static String errore = "Error >> ";

    /**
     * The main method
     * 
     * @param args
     *            //Unusued//
     * @throws IOException
     *             If an I/O exception occours
     * @throws InterruptedException
     *             If a stream exeption occurs
     */
    public static void main(String[] args) throws IOException,
	    InterruptedException {
	stato = "Starting >> ";
	System.out.println(stato + "Initializing...");
	System.out.println(stato + "Running JCore version "
		+ Version.showVersion());
	Version.check();
	Command.check();
    }
}
