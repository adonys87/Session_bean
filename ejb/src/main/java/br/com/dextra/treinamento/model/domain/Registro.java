package br.com.dextra.treinamento.model.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registro implements Serializable{
	

	private static final long serialVersionUID = 1326368167986981068L;
	
	private Long id;
	private Integer valor1;
	private Integer valor2;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getValor1() {
		return valor1;
	}
	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}
	public Integer getValor2() {
		return valor2;
	}
	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Valor1 = "+ valor1 + "\nValor2 = "+valor2;
	}
	
	
	
}
