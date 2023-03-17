package arrays;

import java.util.Arrays;

public class exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length -1]);
		
		double totalAlunoA = 0;
		for(int i = 0; i  < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
	
		final double notaArmazendada = 5.9;	
		double[] notaAlunoB = {6.9, 8.9, notaArmazendada ,10 };
		
		double totalAlunoB = 0;
		for (int i = 0; i < notaAlunoB.length; i++) {
			totalAlunoB += notaAlunoB[i];
		}
		System.out.println(totalAlunoB / notaAlunoB.length );
	}
}
