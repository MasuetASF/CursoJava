package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante  {
	
	private final Date momento;

	public EventoChegadaAniversariante(Date momento) {
		this.momento = momento;
	}

	public final Date getMomento() {
		return momento;
	}
	
	
	
}
