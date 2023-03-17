package lambdas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio2 {

	public static void main(String[] args) {
		
		Produto p = new Produto ("Notebook", 3000.00, 0.15);
		
		BinaryOperator<Double> precoComDesconto = (preco,desconto) ->
			preco + (1- desconto);
		
		UnaryOperator<Double> imposto = (preco) ->
			preco >= 2500.00 ? preco + (1-0.085) : preco;
		
		UnaryOperator<Double> frete = (preco) ->
			preco >= 3000.00 ? preco + 100.00 : preco + 50; 
		
		Function<Double, String> precoFinal = preco -> {
			NumberFormat formatado = NumberFormat.getCurrencyInstance(Locale.getDefault());
			String precoFormatado = formatado.format(preco);
			return precoFormatado;
		};
		
		System.out.println(
				"Preço Final do Produto:\n" + precoComDesconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(precoFinal)
				.apply(p.preco, p.desconto)
				);
					
	}
}
