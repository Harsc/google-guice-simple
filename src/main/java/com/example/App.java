package com.example;

import com.google.inject.Guice;

/**
 * @author jone
 */
public class App {
	public static void main(String[] args) {
//		MyApplet main = Configuration.getMainApplet();
//		main.run();


		MyApplet instance = Guice.createInjector(new MainModule()).getInstance(MyApplet.class);
		instance.run();

	}
}