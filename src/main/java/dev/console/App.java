package dev.console;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import dev.service.AppService;

public class App {
	 
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		LOG.info("Bonjour Slf4j");
		LOG.info("implementation LogBack");
		
		AppService.executer("test");
	}

}
