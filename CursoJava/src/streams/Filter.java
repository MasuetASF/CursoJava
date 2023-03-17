package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		Consumer<Integer> print = System.out::println;
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,26);
		
		Predicate<Integer> verificaSeEPar = numero -> numero%2 == 0;
		
		numeros.stream()
		.filter(verificaSeEPar).forEach(print);
	}
}
