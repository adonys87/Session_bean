package br.com.dextra.treinamento.controller.bean;

import java.net.URL;
import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

import br.com.dextra.treinamento.model.domain.Registro;
import br.com.dextra.treinamento.model.service.HelloWorldLocal;
import br.com.dextra.treinamento.timer.TimerServiceLocal;
import br.com.dextra.treinamento.webservice.WebServiceInterface;

@ManagedBean(name = "helloWorldMB")
@RequestScoped
public class HelloWorldMB {
	// variavel que aponta para a interface do Session Beans
	@EJB
	// usado no lugar do InicialContext para "dar" new no service.
	private HelloWorldLocal service;

	@EJB
	private TimerServiceLocal timer;

	private String valor;
	private Registro registro;
	
	

	public Registro getRegistro() {
		return registro;
	}
	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public HelloWorldMB() {
		// try {
		// InitialContext ctx = new InitialContext();
		// //Forma de carregar
		// service = (HelloWorldLocal)ctx.lookup("blog/HelloWorldImpl/local");
		// } catch (NamingException e) {
		// System.out.println("Erro ao carregar EJB!!!");
		// }
		registro = new Registro();
	}

	public void sayHelloMB() {
		service.sayHello();
		System.out.println("Hello World");
	}

	public void agendar() {

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 1);

		timer.agendarExecucao(cal.getTime(), registro);
	}
	public void invocarWebService(){
//		//URL de acesso ao Web service.
//		String wsdURL = "http://localhost:8080/blog-ejb-1.0-SNAPSHOT/WebServiceImplService/WebServiceImpl?wsdl";
//		String namespace="http://webservice.treinamento.dextra.com.br";
//		String serviceName="WebServiceImplService";
//		String portName = "WebServiceImplPort";
//		
//		QName serviceQName = new QName(namespace, serviceName);
//		
//		try {
//			System.out.println("Criando um Service Factory ...");
//			ServiceFactory factory = ServiceFactory.newInstance();
//			System.out.println("Criando um Service ...");
//			Service webService=factory.createService(new URL(wsdURL), serviceQName);
//			System.out.println("Servico webservice criado com sucesso");
//			
//			webService.getPort(new QName(namespace,portName ), WebServiceInterface.class);
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
	
}
