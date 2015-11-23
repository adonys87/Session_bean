package br.com.dextra.treinamento.model.service;

import javax.annotation.PostConstruct;
import javax.ejb.PostActivate;
import javax.ejb.Stateless;

@Stateless
public class HelloWorldImpl implements HelloWorldLocal{
	@PostConstruct
	public void postConstruct(){
		System.out.println("postConstruct");
	}
	@PostActivate
	public void postActivate(){
		System.out.println("postActivate");
	}
	
	@Override
	public String sayHello() {
		return "Hello world";
		
	}

	
}
