package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	final public static UnaryOperator<String> maiuscula =
			n -> n.toUpperCase();
			
	final public static UnaryOperator<String> primeiraLetra = 
			n -> n.charAt(0) + "";
			
	final public static String grito(String n) {
		return  n + "!!! ";
	}
}