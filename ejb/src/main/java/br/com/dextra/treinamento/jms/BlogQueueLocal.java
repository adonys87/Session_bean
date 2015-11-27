package br.com.dextra.treinamento.jms;

import javax.ejb.Local;

@Local
public interface BlogQueueLocal {
	
	public void enviarMensagem(String msg);

}
