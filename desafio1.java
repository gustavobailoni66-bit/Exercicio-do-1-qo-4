package aulaCondicional;

import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int nota1;
		int nota2;
		int nota3;
		int nota4;
		int media;
		System.out.print("Informe a primeira nota: ");
		nota1= ler.nextInt();
		System.out.print("Informe a segunda nota: ");
		nota2= ler.nextInt();
		System.out.print("Informe a terceira nota: ");
		nota3= ler.nextInt();
		System.out.print("Informe a quarta nota: ");
		nota4= ler.nextInt();
		media= (nota1 + nota2 + nota3 + nota4) /4;
		if (media > 6) {
		System.out.println("Aprovado, média = " + media);
		}
		else {
		System.out.println("Reprovado, média = " + media);

		}
		ler.close();
		}
		}
