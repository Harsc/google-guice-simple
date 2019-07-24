package com.example;

import java.io.PrintStream;

import com.example.helloworddemo.MyDestination;
import com.example.helloworddemo.PrintStreamWriter;
import com.example.helloworddemo.StringWritingApplet;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * @author jone
 * guice config
 * guice config
 */
public class MainModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(MyApplet.class).to(StringWritingApplet.class);
		bind(MyDestination.class).to(PrintStreamWriter.class);
		bind(PrintStream.class).toInstance(System.out);
	}

	@Provides
	private String getString() {
		return "hua wei";
	}
}
