package br.com.dextra.treinamento.controller.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.dextra.treinamento.jms.BlogQueueLocal;
import br.com.dextra.treinamento.jms.FilaJoanLocal;

@ManagedBean(name = "messagemMB")
@RequestScoped
public class MessageMB {
	
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@EJB
	private BlogQueueLocal service;
	@EJB
	private FilaJoanLocal service2;
	
	public void enviarMensagem() {
		service.enviarMensagem("Testando JMS");
	}
	
	
	public void usandoFilaJoan(){
		service2.hum(msg);
	}
}
