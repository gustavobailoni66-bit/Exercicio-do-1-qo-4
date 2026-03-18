package aulaCondicional;

import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
        int numero;
        
        System.out.print("Informe o número: ");
        numero= ler.nextInt();
        
        if (numero > 10) {
        		System.out.println("O número é maior que 10");
        }
	 ler.close();
	} 
}
