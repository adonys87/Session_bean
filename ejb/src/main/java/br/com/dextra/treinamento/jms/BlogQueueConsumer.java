package br.com.dextra.treinamento.jms;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(
		activationConfig = {
			@ActivationConfigProperty(propertyName="destinationType",
					propertyValue="javax.jms.Queue"),
			
			@ActivationConfigProperty(propertyName="destination",
					propertyValue="queue/BlogQueue")
		}
)
public class BlogQueueConsumer implements MessageListener {

	@Override
	public void onMessage(Message message) {
		
		TextMessage mensagem = (TextMessage) message;
		
		try {
			System.out.println("Mensagem recebida: " 
			+ mensagem.getText());

		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}

}
