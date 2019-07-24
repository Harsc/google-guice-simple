package com.example.helloworddemo;

import javax.inject.Inject;

import com.example.MyApplet;
import com.google.inject.Provider;

/**
 * @author jone
 */
public class StringWritingApplet implements MyApplet {

	private MyDestination destination;

	private Provider<String> stringProvider;

	@Inject
	public StringWritingApplet(MyDestination destination, Provider<String> stringProvider) {
		this.destination = destination;
		this.stringProvider = stringProvider;
	}

	private void printHelloWorld() {
		destination.write(stringProvider.get());
	}

	@Override
	public void run() {
		printHelloWorld();
	}
}
