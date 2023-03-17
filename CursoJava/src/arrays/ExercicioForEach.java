package arrays;

import java.util.Arrays;

public class ExercicioForEach {

	public static void main(String[] args) {
		
		//Aluno A
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		double totalALunoA = 0;
		for(double notaA : notasAlunoA) {
			
			 System.out.println(notaA + " ");
			 totalALunoA += notaA;
		}

		System.out.println(totalALunoA / notasAlunoA.length);
		
		//Aluno B
		
		double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 9.8, notaArmazenada, 10 };
		
		double totalAlunoB = 0;
		for (double notaB : notasAlunoB) {
			totalAlunoB += notaB;
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
