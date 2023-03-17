package padroes.observer;

public class Namorada implements ObervadorChegadaAniversariante {
	
	
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados....");
		System.out.println("Apagar as luzes....");
		System.out.println("Esperar um pouco....");
		System.out.println("E... Superpresa!!!");
		
	}
}
