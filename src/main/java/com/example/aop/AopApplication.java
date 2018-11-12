package com.example.aop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.aop.business.Business;
import com.example.aop.business.Business1;
import com.example.aop.business.Employee;
import com.example.aop.business.IDemoFunctional;

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
		
		Employee e1=new Employee("aa", "ccc", 32);
		Employee e2=new Employee("ab", "aabbb", 28);
		Employee e3=new Employee("ab", "aaaab", 28);
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		 
		System.out.println(employees);
		
		
		Collections.sort(employees,(o1,o2) -> o1.getName().compareTo(o2.getName()));
		
		for(Employee emp:employees)
			System.out.println("***"+emp);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*business.upperC(new IDemoFunctional() {
			
			@Override
			public String check(int a) {
				// TODO Auto-generated method stub
				return null;
			}
		});*/
		
		LOGGER.info("***************");
		IDemoFunctional id=(int a) -> "ajkj";
		
		IDemoFunctional id2=(int a) -> {return "ajkj";};
		
		LOGGER.info(business.upperC(id));
		
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
