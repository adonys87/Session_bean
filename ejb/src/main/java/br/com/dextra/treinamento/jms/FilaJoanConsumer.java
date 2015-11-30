package br.com.dextra.treinamento.jms;

import java.util.Date;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(
		activationConfig = {
			@ActivationConfigProperty(propertyName="destinationType",
					propertyValue="javax.jms.Queue"),
			
			@ActivationConfigProperty(propertyName="destination",
					propertyValue="queue/FilaJoan")
		}
)
public class FilaJoanConsumer implements MessageListener{

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		TextMessage mensagem = (TextMessage) message;
		
		try {
			System.out.println("[Fila do JOan]Mensagem recebida: " 
			+ mensagem.getText());

		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}
	@AroundInvoke
	public Object  verificarMensagem(InvocationContext ctx) throws Exception{
		System.out.println("Interceptando....");
		//Object flow = ctx.proceed();//Metodo que manda processar a fila de mensagem.
		long start=new Date().getTime();
		  Object flow=ctx.proceed();
		long end=new Date().getTime();
		
		System.out.println("Metodo: "+ ctx.getMethod().getName()+" demorou "+ (end - start) +" milisegundos");
		return flow;
	}

}
