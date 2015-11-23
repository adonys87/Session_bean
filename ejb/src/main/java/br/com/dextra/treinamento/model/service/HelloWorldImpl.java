package br.com.dextra.treinamento.model.service;

import javax.annotation.PostConstruct;
import javax.ejb.PostActivate;
import javax.ejb.Stateless;

@Stateless
public class HelloWorldImpl implements HelloWorldLocal{
	@PostConstruct //executado dps de criar o EJB 
	public void postConstruct(){
		System.out.println("postConstruct");
	}
	
	
	@Override
	public String sayHello() {
		return "Hello world";
		
	}

	
}
