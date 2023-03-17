package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		/*
		 * Offer e add -> adiciona elementos na fila
		 * Diferen�a � o comportamento ocorre quando a fila
		 * est� cheia
		 */
		
		
		fila.add("Ana"); //retorna false
		fila.offer("Bia"); //lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		//peek e Element -> Obter o pr�ximo elemento 
		//da fila (sem remover)
		
		
		/*Diferen�a entre eles: Comportamento ocorre quando a fila
		 * est� cheia
		 */
		System.out.println(fila.peek()); // retorna Null
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); // lan�a uma excess�p
		System.out.println(fila.element());
	
		
		
		//Poll e Remove -> obter o pr�ximo elemento
		//da fila e remove
		
		//Diferem�a � o comportamento ocorre
		//quando a fila est� vazia
		System.out.println(fila.poll());// reotrna Null
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // lan�a uma excess�p
		
		//fila.size(); tamanho da fila
		//fila.clear(); limpar fila
		//fila.isEmpty(); saber s;e a fila est� ou n�o vazia
		//fila.contains(...) saber se um objeto est� ou n�o contido
		
	
	}

}
