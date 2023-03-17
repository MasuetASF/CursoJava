package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		Porteiro porteiro = new Porteiro();
		
		Namorada namorada = new Namorada();
		porteiro.regristrarObservador(namorada);
		
		porteiro.regristrarObservador(e -> {
			System.out.println("Surpresa via lambda");
			System.out.println("Ocorreu em " + e.getMomento());
		});
		
		porteiro.monitorar();
		

	}

}
