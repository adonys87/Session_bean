package br.com.dextra.treinamento.model.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.dextra.treinamento.model.domain.Registro;

@Stateless
public class SomaImpl implements SomaLocal {

	@EJB
	private PersistenceServiceLocal service;

	public int soma(int a, int b) {
		Registro registro = new Registro();
		registro.setValor1(a);
		registro.setValor2(b);

		service.getEntityManager().persist(registro);
		return a + b;
	}

}
