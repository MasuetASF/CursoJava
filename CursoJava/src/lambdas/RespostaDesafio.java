package lambdas;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class RespostaDesafio {

public static void main(String[] args) {
		
		
		
		Function<Produto, Double>precoFinal =
				produto -> produto.preco * (1 - produto.desconto);
		
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500.00 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000.00 ? preco + 100.00 : preco + 50; 
		
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
		
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto ("Notebook", 3235.89, 0.50);
		String preco = precoFinal
						.andThen(impostoMunicipal)
						.andThen(frete)
						.andThen(arredondar)
						.andThen(formatar)
						.apply(p);
		System.out.println("Preço Final do Produto: "+preco);
							
					
	}
}
