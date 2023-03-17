package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		/*
		 * Offer e add -> adiciona elementos na fila
		 * Diferença é o comportamento ocorre quando a fila
		 * está cheia
		 */
		
		
		fila.add("Ana"); //retorna false
		fila.offer("Bia"); //lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		//peek e Element -> Obter o próximo elemento 
		//da fila (sem remover)
		
		
		/*Diferença entre eles: Comportamento ocorre quando a fila
		 * está cheia
		 */
		System.out.println(fila.peek()); // retorna Null
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); // lança uma excessãp
		System.out.println(fila.element());
	
		
		
		//Poll e Remove -> obter o próximo elemento
		//da fila e remove
		
		//Diferemça é o comportamento ocorre
		//quando a fila está vazia
		System.out.println(fila.poll());// reotrna Null
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // lança uma excessãp
		
		//fila.size(); tamanho da fila
		//fila.clear(); limpar fila
		//fila.isEmpty(); saber s;e a fila está ou não vazia
		//fila.contains(...) saber se um objeto está ou não contido
		
	
	}

}
