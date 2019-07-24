package com.example.helloworddemo;

import java.io.PrintStream;

import javax.inject.Inject;

/**
 * @author jone
 */
public class PrintStreamWriter implements MyDestination {

	private PrintStream out;

	@Inject
	public PrintStreamWriter(PrintStream out) {
		this.out = out;
	}

	@Override
	public void write(String s) {
		out.println(s);
	}
}
