package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double soma = 0.0;
		int menor16 = 0;
		
		System.out.print("Informe a quantidade de pessoas: ");
		int q = sc.nextInt();
		
		String[] nome = new String[q];
		int[] idade = new int[q];
		Double[] altura = new Double[q];
		
		for(int i = 0; i < nome.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
			soma += altura[i];
			if(idade[i] < 16) {
				menor16++;
			}
		}
		
		Double media = soma/q;
		System.out.println("Altura média: " + media);
		
		Double porcentagem = (menor16 * 100.0) / q;
		System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
		for(int i = 0; i < q; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);;
			}
		}
		
		
		
		sc.close();
	}

}
