package streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter02 {
	public static void main(String[] args) {
		Produto02 p1 = new Produto02("Geladeira", 899.00, true, 0.30);
		Produto02 p2 = new Produto02("Cama Box", 1500.00, false, 0.15);
		Produto02 p3 = new Produto02("Cafeteira", 1200.00, true, 0.50);
		Produto02 p4 = new Produto02("PS5", 5000.00, true, 0.29);
		
		List<Produto02> produtos = Arrays.asList(p1, p2, p3, p4);
		
		Predicate<Produto02> desconto =
				p -> p.desconto>= 0.30;
		
		Predicate<Produto02> freteGratis =
				f -> f.freteGratis;
		Function<Produto02, String> caroCfreteGratis =
				a -> "O produto: "+a.nome+" custa R$"+a.preco+" possuí frete grátis, E ESTÁ EM PROMOÇÃO!!";
				
		produtos.stream()
			.filter(desconto)
			.filter(freteGratis)
			.map(caroCfreteGratis)
			.forEach(System.out::println);	
	}
		
}