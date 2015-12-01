package br.com.dextra.treinamento.model.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.dextra.treinamento.model.domain.Registro;

@Stateless
public class SomaImpl implements SomaLocal {

	@EJB
	private PersistenceServiceLocal service;
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public int soma(int a, int b) {
		Registro registro = new Registro();
		registro.setValor1(a);
		registro.setValor2(b);

		service.getEntityManager().persist(registro);
		return a + b;
	}

}
