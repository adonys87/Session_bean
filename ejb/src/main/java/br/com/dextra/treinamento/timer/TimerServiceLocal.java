package br.com.dextra.treinamento.timer;

import java.io.Serializable;
import java.util.Date;

public interface TimerServiceLocal {
	public void agendarExecucao(Date timeout, Serializable parametro);
}
