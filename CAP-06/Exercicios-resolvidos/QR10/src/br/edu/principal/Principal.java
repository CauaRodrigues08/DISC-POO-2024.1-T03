package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esse programa corrige uma prova de 8 questões, cada questão da prova vale 1 ponto");
		
		boolean gabarito[] = new boolean[8];
		boolean resposta[] = new boolean[8];
		int num , pontos , totalAp , percAp , i , j = 0;
		
		for (i = 0; i <= 7 ; i++) {
			System.out.println("Digite a resposta da questão " + i);
			gabarito[i] = sc.nextBoolean();
		}
		
		totalAp = 0;	
		for(i = 0; i <= 9; i++) {
			System.out.println("Digite o número do " + i + "º aluno");
			num = sc.nextInt();
			pontos = 0;
			for(j = 0; j <= 7; j++) {
				System.out.println("Digite a resposta dada pelo aluno " + num + " à " + j + "º questão");
				resposta[j] = sc.nextBoolean();
				if (resposta[j] == gabarito[j]){
					pontos = pontos + 1;
				}
				if (pontos >= 6) {
					totalAp = totalAp + 1;
				}
			}	
			
			System.out.println("A nota do aluno " + num + " foi " + pontos);
			
		}
		
		percAp = totalAp * (100/10);
		System.out.println("O percentual de alunos que foram aprovados é de: " + percAp + "%");
	}

}

