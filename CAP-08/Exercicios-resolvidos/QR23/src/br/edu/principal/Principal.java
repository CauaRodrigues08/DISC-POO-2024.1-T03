package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Inicializacao das variaveis
		Scanner sc = new Scanner(System.in);
		double mat[][] = new double[3][4], vet[] = new double[12];
		int i, j;
		
		System.out.println("Este programa recebe numeros para uma matriz 3x4 e preenche um vetor de 12 posiçoes com eles.\n");
		
		//Input dos dados
		for (i = 0; i < 3; i++) {
			
			for (j = 0; j < 4; j++) {
				
				System.out.print("Digite o numero da posiçao (" + (i + 1) + "," + (j + 1) + "): ");
				mat[i][j] = sc.nextDouble();
			}
		}
		
		//Chamada do metodo geraVetor12
		geraVetor12(mat, vet);
		
		System.out.println("\n");
		
		//Output dos dados de vet[12]
		for (i = 0; i < 12; i++) {
			
			System.out.println("Numero na posiçao " + (i + 1) + ": " + vet[i]);
		}
		
		System.out.println("\nFim do programa.");
		sc.close();
	}

	
	//Metodo para preencher um vetor de 12 posiçoes com os dados da mat[3][4]
	public static void geraVetor12(double mat[][], double vet[]) {
		
		int i, j, k = 0;
		
		for (i = 0; i < 3; i++) {
			
			for (j = 0; j < 4; j++) {
				
				vet[k] = mat[i][j];
				k++;
			}
		}
		
	}
	
}
