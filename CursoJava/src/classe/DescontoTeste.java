package classe;

public class DescontoTeste {

	public static void main(String[] args) {
		
		Desconto d1 = new Desconto("Notebook", 10);
		
		
		var d2 = new Desconto();
		d2.nome = "Caneta Preta";
		d2.preco = 10.00;		
		
		
		System.out.println(d1.nome + " " + d1.precoComDesconto());
		System.out.println(d2.nome + " " + d2.precoComDesconto()); 
		
		
		Desconto.desconto = 0.5;
		
		double precoFinal = d1.precoComDesconto();
		double precoFinal2 = d2.precoComDesconto();
		double mediaCarrinho = ((precoFinal + precoFinal2) / 2 );
		
		System.out.printf("Média do carrinho = R$%.2f",mediaCarrinho);
	}
}
