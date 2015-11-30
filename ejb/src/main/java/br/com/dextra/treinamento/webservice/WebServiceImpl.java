package br.com.dextra.treinamento.webservice;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;




//
@Stateless
@WebService (name="WebServiceImpl", 
			 serviceName="WebServiceImplService",
	         targetNamespace ="http://webservice.treinamento.dextra.com.br",
	         portName="WebServiceImplPort")
@SOAPBinding(style= Style.RPC)

public class WebServiceImpl implements WebServiceInterface{
	@WebMethod
	public void invocarServico(){
		System.out.print("Web Service invocado com sucesso");
	}
}
