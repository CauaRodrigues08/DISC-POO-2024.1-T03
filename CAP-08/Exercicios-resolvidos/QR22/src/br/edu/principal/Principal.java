package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Inicializacao das variaveis
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double vet1[] = new double[8], vet2[] = new double[8], vet3[]= new double[8], cont1, cont2;
		int i;
		
		System.out.println("Este programa recebe oito numeros e os divide entre numeros pares e impares.\n");
		
		//Input dos dados
		for (i = 0; i < 8; i++) {
			
			System.out.print("Digite o " + (i + 1) + "° numero: ");
			vet1[i] = sc.nextDouble();
		}
		
		System.out.print("\n");
		
		//Verificaçao dos dados (pares)
		cont1 = pares(vet1, vet2);
		if (cont1 == 0) 		
			System.out.println("Nenhum numero par foi digitado.");
		
		else {
			
			//Loop para mostrar os pares
			for (i = 0; i < cont1; i++) {
				
				System.out.println((i + 1) + "° numero par: " + vet2[i]);
			}
		}
		
		System.out.print("\n");
		
		//Verificaçao dos dados (impares)
		cont2 = impares(vet1, vet3);
		if (cont2 == 0) 		
			System.out.println("Nenhum numero impar foi digitado.");
		
		else {
			
			//Loop para mostrar os impares
			for (i = 0; i < cont2; i++) {
				
				System.out.println((i+1) + "° numero impar: " + vet3[i]);
			}
		}
			
		System.out.println("\nFim de programa.");
		
	}

	//Metodo para verificar os pares, armazena-los e conta-los
	public static double pares(double vet1[], double vet2[]) {
		int i, cont = 0;
		
		for (i = 0; i < 8; i++) {
			
			if (vet1[i] % 2 == 0) {
				
				vet2[cont] = vet1[i];
				cont++;
			}
		}
		
		return cont;
	}
	
	//Metodo para verificar os impares, armazena-los e conta-los.
	public static double impares(double vet1[], double vet3[]) {
		int i, cont = 0;
		
		for (i = 0; i < 8; i++) {
			
			if (vet1[i] % 2 == 1) {
				
				vet3[cont] = vet1[i];
				cont++;
			}
		}
		
		return cont;
	}
	
}
