package br.com.dextra.treinamento.model.service;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import br.com.dextra.treinamento.model.domain.GenericInterceptor;

@Stateless
@Interceptors(value=GenericInterceptor.class)
public class SomaImpl implements SomaLocal{
	
	@Override
	public int soma(int a, int b) {
		return a + b;		 
	}

}
