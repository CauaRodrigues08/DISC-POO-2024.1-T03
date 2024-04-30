package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Esse programa atribui valores inteiros a um vetor com 8 espaços e os coloca em ordem crescente");
		
		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int[8];
		int i,z,j, aux = 0;
		
		for( i = 0; i <= 7 ;  i++) {
			System.out.println("Digite um valor");
			 vet[i] = sc.nextInt();		
		
			 for(j = 0 ; j < i && vet[j] < aux; j++) {
				 j = j+1;
				 for( z = i; z >= j+1; z++) {
				 vet[z] = vet[z-1];
				 z = z-1;
				 }
				 vet[j] = aux;
				 i = i+1;
		}
				 
		}
		for(i = 0; i <= 7; i++) {
			System.out.print( "|" +vet[i] );
		}
		System.out.print("|");
		

	}

}
