package br.com.dextra.treinamento.model.domain;

import javax.annotation.PostConstruct;

//Esse cara serve para ser usado em varias classes. Assim o PostConstruct irá executar para todos os EJB que utiliza-lo
//Vantagem - mesmo processamento paara varios EJB, evitando assim CTRL+C /V futuros
public class GenericInterceptor {
	@PostConstruct
	public void postConstruct(){
		System.out.println("Post Construct fo GenericInterceptor");
	}
}
