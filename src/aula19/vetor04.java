package aula19;

import java.util.Scanner;

public class vetor04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int[] primeiroVetor = new int [15];
	    double[] segundoVetor = new double [15];
	    
	    for (int i = 0; i<15; i++) {
	    	System.out.println("Insira um vetor:: " + i);
	    	primeiroVetor[i] = scan.nextInt();
	    	
	    	segundoVetor[i] = Math.sqrt (primeiroVetor[i]);
	    }
		System.out.println("Os vetores sao: ");
		for(int i = 0; i<15; i++) {
			System.out.println(primeiroVetor[i] + "");
		}
		System.out.println("Os vetores sao: ");
		for(int i = 0; i<15; i++) {
			System.out.println(segundoVetor[i] + "");
		}
	}

}
