package com.example.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.aop.business.Business;
import com.example.aop.business.Business1;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Business business;
	@Autowired
	private Business1 business1;

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(AopApplication.class, args);
		System.out.println("******** YODA *****");
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info(business.doSomething());
		LOGGER.info(business1.doSomething());

	}
}
