package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas terá ? ");
		int qtdNotas = entrada.nextInt();
		double[] notas = new double[qtdNotas];
		
		
		for (int i = 0; i < (notas.length); i++) {
			System.out.println("Informe a " + (i+1) +"º nota: " );
			notas[i] = entrada.nextDouble();
			
		}
		
		
		double totalNotas=0;
		for (double nota : notas) {
			totalNotas += nota ;
		}
		
		System.out.println("Soma das notas: "+totalNotas);
		System.out.print("notas: ");
		System.out.println(Arrays.toString(notas));
		
		double media = totalNotas / notas.length;
		System.out.println("\nMédia das notas: " + media);
		entrada.close();
	}
}
