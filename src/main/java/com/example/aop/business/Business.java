package com.example.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aop.DAO;

@Service
public class Business {

	@Autowired
	private DAO dao;

	public String doSomething() {

		return getDao().retrieve();

	}

	public String upperC(IDemoFunctional demoFunctional) {
		return demoFunctional.check(2);
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}
}
