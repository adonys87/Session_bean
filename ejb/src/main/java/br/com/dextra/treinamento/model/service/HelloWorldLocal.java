package br.com.dextra.treinamento.model.service;

import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Local //Anotação do EJB 
public interface HelloWorldLocal {
	

	public String sayHello();
}
