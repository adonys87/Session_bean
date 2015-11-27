package br.com.dextra.treinamento.controller.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.dextra.treinamento.jms.BlogQueueLocal;

@ManagedBean(name = "messagemMB")
@RequestScoped
public class MessageMB {
	@EJB
	private BlogQueueLocal service;

	public void enviarMensagem() {
		service.enviarMensagem("Testando JMS");
	}
	
}
