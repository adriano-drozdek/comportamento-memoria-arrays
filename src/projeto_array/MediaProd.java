package projeto_array;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class MediaProd {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco);
		}
		
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			soma += vect[i].getPreco();
		}
		double media = soma / n;
		System.out.printf("Média de valor dos produtos:%.2f%n ", media);
		sc.close();

	}

}
