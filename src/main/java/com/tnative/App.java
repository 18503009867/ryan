package com.tnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		//CATALINA_OPTS='-Djava.nio.channels.spi.SelectorProvider=sun.nio.ch.EPollSelectorProvider'
	}
}
