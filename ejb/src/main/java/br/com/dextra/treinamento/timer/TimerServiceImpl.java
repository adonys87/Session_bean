package br.com.dextra.treinamento.timer;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

import br.com.dextra.treinamento.model.domain.Registro;
@Stateless
public class TimerServiceImpl implements TimerServiceLocal{
	@Resource
	private SessionContext ctx; //Contexto
	
	
	@Override
	public void agendarExecucao(Date timeout, Serializable parametro) {
		TimerService timerService = ctx.getTimerService();
		//Parametro pode ser qualquer classe Serealizavel
		timerService.createTimer(timeout, parametro);		
	}
	//Anotação usada no metodo que sera chamado quando terminar o tempo
	@Timeout
	public void executarTimer(Timer timer){
		System.out.println("Mensagem de Timer: "+ (Registro) timer.getInfo());
		timer.cancel();
	}

}
