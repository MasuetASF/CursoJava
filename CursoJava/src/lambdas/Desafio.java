package lambdas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		Produto p = new Produto("iPad", 6200.00, 0.10);
	
	BinaryOperator<Double> precoCDesc = (preco, desconto) ->
			preco * (1- desconto);
			
	UnaryOperator<Double> imposto = preco -> 
		preco >= 2500.00 ? preco * (1 + 0.085) : preco;  		
	
	UnaryOperator<Double> frete = preco ->
		preco >= 3000.00 ? preco + 100.00 : preco + 50;
		
	Function<Double, String> precoFinal = preco -> {
		NumberFormat formatado = NumberFormat.getCurrencyInstance(Locale.getDefault());
		String precoFormatado = formatado.format(preco);
		return precoFormatado;
	};
	
	System.out.println(
			"Preço Final:\n" + precoCDesc
			.andThen(imposto)
			.andThen(frete)
			.andThen(precoFinal)
			.apply(p.preco, p.desconto)
			);
	
	}		
}
