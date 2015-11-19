package br.com.dextra.treinamento.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.dextra.treinamento.model.service.SomaImpl;
import br.com.dextra.treinamento.model.service.SomaLocal;


@ManagedBean (name ="somaMB")
@RequestScoped
public class SomaMB {
	
	private SomaLocal service;
	
	public SomaMB() {
		try{
			InitialContext ctx = new InitialContext();
			service = (SomaLocal) ctx.lookup("blog/SomaImpl/local");			
			
		}catch (NamingException e){
			System.out.println("Erro no SomaMB ao carregar o service");
		}
	}
	
	
	public void chamada(){
		System.out.println("Metodos chamado no somaMB"+service.soma(3, 4));
		
	}
}
