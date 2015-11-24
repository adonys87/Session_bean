package br.com.dextra.treinamento.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registro {
	
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
	
	
	
	
}
