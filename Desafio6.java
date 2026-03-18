package aulaCondicional;

import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		double medida1, medida2, medida3;
		System.out.println("Informe a medida do primeiro lado: ");
		medida1 = ler.nextDouble();
		System.out.println("Informe a medida do segundo lado: ");
		medida2 = ler.nextDouble();
		System.out.println("Informe a medida do terceiro lado: ");
		medida3 = ler.nextDouble();
		if (medida1 == medida2 && medida2 == medida3) {
		System.out.println("Equilátero");
		} else if (medida1 == medida2 || medida2 == medida3 || medida1 == medida3) {
		System.out.println("Isósceles");
		} else {
		System.out.println("Escaleno");
		}
		ler.close();
} 
}
