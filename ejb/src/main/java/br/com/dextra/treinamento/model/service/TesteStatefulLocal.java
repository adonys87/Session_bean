package br.com.dextra.treinamento.model.service;

import javax.ejb.Local;

@Local
public interface TesteStatefulLocal {

	public Integer adicionar();

	public void destruir();
}
