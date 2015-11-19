package br.com.dextra.treinamento.model.service;

import javax.ejb.Local;

@Local //Anotação do EJB 
public interface HelloWorldLocal {
	
	public String sayHello();
}
