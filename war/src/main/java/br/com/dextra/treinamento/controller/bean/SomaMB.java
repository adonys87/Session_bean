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
	//Valores definidos na JSF também, ele converte para nos precisando somente dos get and set
	private int valor1;
	private int valor2;
	private int resultado;
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public int getValor1() {
		return valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	
	public SomaMB() {
		try{
			InitialContext ctx = new InitialContext();
			service = (SomaLocal) ctx.lookup("blog/SomaImpl/local");			
			
		}catch (NamingException e){
			System.out.println("Erro no SomaMB ao carregar o service");
		}
	}
	
	
	public void chamada(){
		System.out.println("Metodos chamado no somaMB "+service.soma(valor1, valor2));
		resultado = service.soma(valor1, valor2);
	}
}
