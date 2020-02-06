package com.qa.logging;

import org.apache.log4j.Logger;

public class Runner {

	public static final Logger LOGGER = Logger.getLogger(Runner.class);

	public static void main(String[] args) {
		LOGGER.trace("tracing");
		LOGGER.debug("debugging");
		LOGGER.info("infoing");
		LOGGER.warn("warning");
		LOGGER.error("erroring");
		LOGGER.fatal("fataling");
	}
}
