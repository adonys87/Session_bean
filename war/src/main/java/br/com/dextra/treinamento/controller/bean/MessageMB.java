package br.com.dextra.treinamento.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.dextra.treinamento.jms.BlogQueueLocal;
import br.com.dextra.treinamento.model.service.SomaLocal;

@ManagedBean(name = "messageMB")
@RequestScoped
public class MessageMB {
	private BlogQueueLocal service;

	public MessageMB() {
		try {
			InitialContext ctx = new InitialContext();
			service = (BlogQueueLocal) ctx.lookup("blog/BlogQueueImpl/local");

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enviarMessagem() {
		service.enviarMensagem("Testando JMS");
	}

}
