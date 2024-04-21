package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Inicializacao das variaveis
		Scanner sc = new Scanner(System.in);
		int x, y, soma;
		
		System.out.println("Este programa recebe um par de numeros X e Y, com X>Y, e mostra a soma de todos os numeros primos entre eles (o par incluso).\n");
		
		//Input dos dados
		System.out.println("De o valor de X e Y como iguais para encerrar o programa.");
		System.out.print("Digite Y (X>Y): ");
		y = sc.nextInt();
		System.out.print("Digite X (X>Y): ");
		x = sc.nextInt();
		
		//Loop da soma e input
		while (x != y) {
			
			soma = primos(x,y);
			System.out.println("A soma dos primos no intervalo de " + y + " - " + x + " e " + soma);
			
			System.out.println("\nDe o valor de X e Y como iguais para encerrar o programa.");
			System.out.print("Digite Y (X>Y): ");
			y = sc.nextInt();
			System.out.print("Digite X (X>Y): ");
			x = sc.nextInt();
			
		}
		
		System.out.print("\nFim de programa.");
		sc.close();
	}

	//Metodo da soma
	public static int primos(int x, int y) {
	
		int i, j, cont, somatorio = 0;
		
		for (i = y; i <= x; i++) {
			cont = 0;
			
			for (j = 1; j <= i; j++) {
				
				if (i % j == 0) 
					cont++;
			}
				
				if (cont == 2) 
					somatorio = somatorio + i;
				
		}
		
		return somatorio;
	}

}
