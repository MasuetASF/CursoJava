package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook",4356.89, 0.25);
		
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal + precoFinal2) / 2;
		
		System.out.printf("M�dia do carrinho = R$%.2f.", mediaCarrinho);
		
	}
}
