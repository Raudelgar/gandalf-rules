package com.garloinvest.rules;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class RulesApp {
	private static final Logger LOG = LoggerFactory.getLogger(RulesApp.class);

	public static void main(String[] args) {
		 LOG.info("*******   Starting GANDALF-RULES APP  *******");
		SpringApplication.run(RulesApp.class, args);

	}

}
