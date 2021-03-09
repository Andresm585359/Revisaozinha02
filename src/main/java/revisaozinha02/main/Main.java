package revisaozinha02.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private void start() {

		double valor=1110;
		while(valor >100) {
		System.out.println("Digita o valor do produto seu animal(0~100):");
		
		Scanner scan = new Scanner(System.in);
		valor = scan.nextDouble();
		
		}
		int valorint = (int) valor;
		System.out.println("O valor digitado é: "+valor+" Convertido para int é: "+ valorint);
	}

}