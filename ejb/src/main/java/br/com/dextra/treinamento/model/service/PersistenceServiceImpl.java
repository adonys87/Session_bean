package br.com.dextra.treinamento.model.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PersistenceServiceImpl implements PersistenceServiceLocal {
	@PersistenceContext (name ="blog-ds") //Aqui temos acesso ao EntityManager do JPA
	private EntityManager em;
	
	public EntityManager getEntityManager() {		
		return em;
	}

}
