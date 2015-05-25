package com.github.VaiTon86.JavaAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author VaiTon86
 */
public class Version {
    /**
     * @return The current version
     */
    public static String showVersion() {
	return "0.0.1.1";

    }

    /**
     * @throws IOException
     *             If the method can't retrive the data
     */
    private static String checkForUpdate() throws IOException {
	BufferedReader s = new BufferedReader(
		new InputStreamReader(
			(new URL(
				"https://raw.githubusercontent.com/VaiTon86/JCore/master/src/com/github/VaiTon86/JavaAPI/version.txt")
				.openStream())));
	String line = s.readLine();
	s.close();
	return line;

    }

    /**
     * @throws IOException
     *             If an I/O exception occurs
     */
    public static void check() throws IOException {
	if (!checkForUpdate().equals(showVersion())) {

	    System.out.println(Loader.attenzione
		    + "An update was found. Version " + checkForUpdate());
	} else {
	    System.out.println(Loader.stato + "No updates found");

	}

    }
}
