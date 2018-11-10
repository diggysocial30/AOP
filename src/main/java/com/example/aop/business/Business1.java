package com.example.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aop.DAO1;

@Service
public class Business1 {

	@Autowired
	private DAO1 dao;

	public String doSomething() {

		return getDao().retrieve();

	}

	public DAO1 getDao() {
		return dao;
	}

	public void setDao(DAO1 dao) {
		this.dao = dao;
	}
}
