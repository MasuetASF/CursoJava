package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;



public class DesafioFilter {
	public static void main(String[] args) {
		Produto p1 = new Produto("Geladeira", 899.00, true);
		Produto p2 = new Produto("Cama Box", 1500.00, false);
		Produto p3 = new Produto("Cafeteira", 1200.00, true);
		Produto p4 = new Produto("PS5", 5000.00, true);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		Predicate<Produto> isCaro =
				p -> p.preco >= 1000.00;
		
		Predicate<Produto> freteGratis =
				f -> f.freteGratis;
		Function<Produto, String> caroCfreteGratis =
				a -> "O produto: "+a.nome+" custa R$"+a.preco+" e possuí frete grátis!!";
				
				
		produtos.stream()
			.filter(isCaro)
			.filter(freteGratis)
			.map(caroCfreteGratis)
			.forEach(System.out::println);	
	}
		
}
