package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		//Consumer<Integer> println = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "Js\n");
		
		langs.forEach(print);
		
		String[] maisLangs = {"Phyton ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);	
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		//Gerar Stream aleatoria
		//Stream.generate(() -> "a").forEach(print);
		//Stream.iterate(0,n -> n + 1).forEach(println);
		
		
	}
}