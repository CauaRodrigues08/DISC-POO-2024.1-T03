package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Inicializaçao das variaveis
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[25], i;

		System.out.println("Este programa recebe 25 numeros inteiros, os coloca em uma lista e substitui os numeros negativos por zero.\n");
		
		//Input dos dados
		for (i = 0; i < 25; i++) {
			
			System.out.print("Digite o " + (i + 1) + "° numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("\nSubstituindo...\n");
		substituiçao(vet);
		
		//Output dos dados
		for (i = 0; i < 25; i++) {
			
			System.out.println((i + 1) + "° numero: " + vet[i]);
		}
		
		System.out.println("\nFim de programa.");
		
	}

	
	//Metodo para substituir negativos por zero
	public static void substituiçao(int vet[]) {
		
		int z;
		
		for (z = 0; z < 25; z++) {
			
			if (vet[z] < 0)
				vet[z] = 0;
		}
		
	}
	
}
