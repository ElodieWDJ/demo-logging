package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {
	private static final Logger LOG = LoggerFactory.getLogger(AppService.class);
	
	public static void main(String[] args) {
		LOG.info("Bonjour Slf4j");
		LOG.info("implementation LogBack");
		
		AppService.executer("test");
	}
	public static void executer(String param) {
		LOG.debug("Traitement 1 : param = {}", param );
		LOG.info("Hellooooooooo");
	}
}
