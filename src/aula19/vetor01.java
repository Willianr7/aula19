package aula19;

import java.util.Scanner;

public class vetor01 {

	public static void main(String[] args) {
		// 
		  Scanner scan = new Scanner (System.in);
			
			int[] primeiroVetor = new int [5];
			int[] segundoVetor = new int [5];
			
			for (int i=0; i<5; i++) {
				System.out.println("Insira um numero: " + i);
				primeiroVetor[i] = scan.nextInt();
				
				segundoVetor[i] = primeiroVetor[i];
				
		
			}
			System.out.print("Primeiro Vetor inserido: ");
			for (int i=0; i<5; i++) {
				System.out.print(primeiroVetor[i] + " ");
				
			}
			System.out.print("Segundo Vetor inserido: ");
			for (int i=0; i<5; i++) {
				System.out.print(segundoVetor[i] + " ");
			}	
      	
	}
}	

