package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Inicializaçao das variaveis
		Scanner sc = new Scanner(System.in);
		double num1, num2, res;
		String op;
		
		System.out.println("Este programa recebe dois numeros e oferece uma adiçao ou multiplicaçao dos dois.\n");
		
		//Input dos numeros
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextDouble();
		
		//Input da opçao de calculo
		do {
			
			System.out.print("Digite a operaçao desejada (+ para adiçao, * para multiplicaçao): ");
			op = sc.next();
			
		}while (!op.equals("+") && !op.equals("*"));
		
		//Chamada do metodo e output deste
		res = calculo(num1, num2, op);
		System.out.println("\nResultado da operaçao: " + res);
		
		System.out.print("\nFim de programa.");
		sc.close();
		
	}

	
	//Metodo para o calculo
	public static double calculo(double num1, double num2, String op) {
		
		double result;
		
		if (op.equals("+")) 	
			result = num1 + num2;
		else
			result = num1 * num2;
		
		return result;
	}
	
}
