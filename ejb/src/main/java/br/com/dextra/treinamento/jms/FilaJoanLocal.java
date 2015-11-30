package br.com.dextra.treinamento.jms;

import javax.ejb.Local;

@Local
public interface FilaJoanLocal {

	public void hum(String msg);

}
