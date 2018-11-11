package com.example.aop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.aop.business.Business;
import com.example.aop.business.Business1;
import com.example.aop.business.Employee;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Business business;
	@Autowired
	private Business1 business1;

	public static void main(String[] args) {
		System.out.println("******** YODA *****");
		
		// Instead use a Lambda function
		
		/*new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("**************Inside com.example.aop.CodeToRun.run()**************");
				
			}
		}).start();*/
		
		Runnable run=() -> System.out.println("**************Inside com.example.aop.CodeToRun.run()**************");
		new Thread(() -> {System.out.println("**************Inside com.example.aop.CodeToRun.run()**************");
		}).start();
		//IDemoFunctional demo = (10) -> System.out.println("**************Inside com.example.aop.CodeToRun.run()**************");
		
		Employee e1=new Employee("aa", "ccc", 32);
		Employee e2=new Employee("ab", "aabbb", 28);
		Employee e3=new Employee("ab", "aaaab", 28);
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		System.out.println(employees);
		
		Collections.sort(employees,new Comparator<Employee>() {

			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		for(Employee emp:employees)
			System.out.println("***"+emp);
		
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info(business.doSomething());
		LOGGER.info(business1.doSomething());

	}
}


class CodeToRun implements Runnable{

	@Override
	public void run() {
		System.out.println("**************Inside com.example.aop.CodeToRun.run()**************");
		
	}
	
}
