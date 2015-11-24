package br.com.dextra.treinamento.model.service;

import javax.ejb.Local;
import javax.persistence.EntityManager;

@Local
public interface PersistenceServiceLocal {
	public EntityManager getEntityManager();
}
