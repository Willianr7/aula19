package aula19;

import java.util.Scanner;

public class vetor05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        int[] a = new int[10];

       
        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Vetor Inserido: " + (i + 1) + ": ");
            a[i] = scan.nextInt();
        }

        
        int[] b = new int[10];

        
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * i;
        }

      
        System.out.println("\nVetor A:");
        leituraVetor(a);

        System.out.println("\nVetor B: ");
        leituraVetor(b);
    }

    
    private static void leituraVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
        
    }



