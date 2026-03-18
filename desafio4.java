package aulaCondicional;

import java.util.Scanner;

public class desafio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite o primeiro valor: ");
		numero1 = ler.nextInt();
		System.out.println("Digite o segundo valor");
		numero2 = ler.nextInt();
		boolean iguais = numero1 == numero2;
		boolean maior = numero1 > numero2;
		if (iguais) {
		System.out.println("Os valores são iguais: " + numero1);
		}else if (maior) {
		System.out.println("Números diferentes, pois " + numero1 + " é maior que " + numero2);
		}else {
		System.out.println("Números diferentes, pois " + numero2 + " é maior que " + numero1);
		}
		ler.close();
	    }
	}
