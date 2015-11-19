package br.com.dextra.treinamento.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.dextra.treinamento.model.service.HelloWorldLocal;

@ManagedBean(name = "helloWorldMB")
@RequestScoped
public class HelloWorldMB {
	//variavel que aponta para a interface do Session Beans
	private HelloWorldLocal service;

	public HelloWorldMB() {
		try {
			InitialContext ctx = new InitialContext();
			//Forma de carregar 
			service = (HelloWorldLocal)ctx.lookup("blog/HelloWorldImpl/local");
		} catch (NamingException e) {
			System.out.println("Erro ao carregar EJB!!!");
		}
	}

	public void sayHelloMB() {
		service.sayHello();
		System.out.println("Hello World");
	}
}
