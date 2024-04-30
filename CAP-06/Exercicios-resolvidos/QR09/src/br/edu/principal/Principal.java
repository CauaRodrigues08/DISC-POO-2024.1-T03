package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esse programa efetua reserva de passagens aéreas");
		
		int voo[] = new int[12];
		int lugares[] = new int[12];
		int destino[] = new int[12];
		int origem[] = new int[12];
		int op, i , op2, local,numVoo = 0;
		
		for (i = 0; i <= 11; i++) {
			System.out.println("Digite o seu voo");
			voo[i] = sc.nextInt();
			System.out.println("Digite a sua origem");
			origem[i] = sc.nextInt();
			System.out.println("Digite o seu destino");
			lugares[i] = sc.nextInt();
			System.out.println("Digite o seu assento");
			destino[i] = sc.nextInt();
		}
		System.out.println("1 - Consultar");
		System.out.println("2 - Realizar");
		System.out.println("3 - Finalizar");
		System.out.println("Escolha uma opção:");
		op = sc.nextInt();
		
		if (op == 1) {
			System.out.println("1 - Consulta por voo");
			System.out.println("2 - Consulta por origem");
			System.out.println("3 - Consulta por destino");
			System.out.println("Escolha uma opção");
			op2 = sc.nextInt();
			if(op2 == 1) {
				System.out.println("Escreva o número do voo");
				numVoo = sc.nextInt();
				for(i = 0; i <= 11 && voo[i] != numVoo; i++) {
					if(i < 11) {
						System.out.println("Voo inexistente");
					}
					else {
						System.out.println("Número do voo = " + voo[i]);
						System.out.println("Local de origem = " + origem[i]);
						System.out.println("Local de destino = " + destino[i]);
						System.out.println("Número de assentos disponíveis = " + lugares[i]);
					}
				}
			}
			
			if(op2 == 2) {
				System.out.println("Escreva o local de origem");
				local = sc.nextInt();
				for(i = 0; i <= 11; i++) {
					if(local == origem[i]) {
						System.out.println("Número do voo = " + voo[i]);
						System.out.println("Local de origem = " + origem[i]);
						System.out.println("Local de destino = " + destino[i]);
						System.out.println("Número de assentos disponíveis = " + lugares[i]);
					}
				}
			}
			
			if(op2 == 3) {
				System.out.println("Digite o local de destino");
				local = sc.nextInt();
				for(i = 0; i <= 11; i++) {
					if(local == destino[i]) {
						System.out.println("Número do voo = " + voo[i]);
						System.out.println("Local de origem = " + origem[i]);
						System.out.println("Local de destino = " + destino[i]);
						System.out.println("Número de assentos disponíveis = " + lugares[i]);
					}
				}
			}
		}
		
		if (op == 2) {
			System.out.println("Digite o número do voo desejado");
			numVoo = sc.nextInt();	
			for(i = 0 ; i <= 11 && voo[i] == numVoo; i++) {
				if(i > 11) {
					System.out.println("Voo não encontrado");
				}
				else {
					if (lugares[i] == 0){
						System.out.println("Voo lotado");
					}
					else {
						lugares[i] = lugares[i] - 1;
						System.out.println("Reserva confirmada!");
					}
				}
			}
			
		}
		
		if(op == 3) {
			System.out.println("Aplicativo encerrado!");
		}
	}
}
