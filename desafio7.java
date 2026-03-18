package aulaCondicional;

import java.util.Scanner;

public class desafio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
        double numero1, numero2, numero3;
        
        System.out.println("Digite o primeiro valor");
        numero1 = ler.nextDouble();
        System.out.println("Digite o segundo valor");
        numero2 = ler.nextDouble();
        System.out.println("Digite o terceiro valor");
        numero3 = ler.nextDouble();
        
        if (numero1 > numero2 && numero1> numero3) {
        	System.out.println(numero1 + "é o maior número");
        } else if (numero2 > numero1 && numero2 > numero3) {
        		System.out.println(numero2 + "é maior número");
        } else {
        	System.out.println(numero3 + "é o maior número");
        	}
       ler.close();
        }
        
	}

