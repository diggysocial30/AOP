package com.example.aop.business;

import org.springframework.stereotype.Component;

@FunctionalInterface
@Component
public interface IDemoFunctional {

	public abstract String check(int a);

}
