package streams;

public class Media {

	private double total;
	private int quantidade;
	
	public Media adicionar(double valor) {
		total+=valor;
		quantidade++;
		return this;
	}
	
	public double getValor() {
		return total / quantidade;
	}
	
	static public Media combinar(Media m1, Media m2) {
		Media ressultante = new Media();
		ressultante.total =  m1.total + m2.total;
		ressultante.quantidade =  m1.quantidade + m2.quantidade;
		return ressultante;
	}
}
