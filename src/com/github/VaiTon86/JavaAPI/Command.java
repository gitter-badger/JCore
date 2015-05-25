package com.github.VaiTon86.JavaAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @author VaiTon86
 */
public class Command {

    /**
     * @throws IOException
     *             If an I/O exception occurs
     * @throws InterruptedException
     *             If the stream è interrotto
     */
    public static void check() throws IOException, InterruptedException {
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	System.out.print(">> ");
	String command = sc.readLine();
	/*
	 * Controlling the command
	 */
	if (command.equals("version") || command.equals("v")) {
	    version();
	} else if (command.equals("easteregg")) {
	    easterEgg();
	} else {
	    System.err.println(Loader.errore + "Invalid command");

	}
	Thread.sleep(1);
	check();
    }

    /**
     * Watch an Easter Egg!!
     */
    private static void easterEgg() {
	Random random = new Random();
	int x = random.nextInt(7);
	System.out.println(x);
	switch (x) {
	case 1:

	    break;
	case 2:

	    break;
	case 3:

	    break;
	case 4:

	    break;
	case 5:

	    break;
	case 6:

	    break;
	case 7:

	    break;
	}
    }

    /**
     * Show the current version
     */
    private static void version() {
	System.out.println(Loader.info + "Currently running version "
		+ Version.showVersion());

    }
}
