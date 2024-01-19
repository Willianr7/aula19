package aula19;

import java.util.Scanner;

public class vetor10 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
		
		int[] primeiroVetor = new int [10];
		int[] segundoVetor = new int [10];
		
		for (int i = 0; i<10; i++) {
			System.out.println("Digite um numero: " + i);
			primeiroVetor[i] = scan.nextInt();
			
			segundoVetor[i] = primeiroVetor[i] % 2;
		} 
			System.out.print("Primeiro vetor: " );
			for(int i = 0; i<10; i++) {
				System.out.print(primeiroVetor[i] + " ");
			}
			System.out.print("Segundo vetor: ");
			for(int i = 0; i<10; i++) {
				System.out.print(segundoVetor[i] + " ");
			}
	}
}