package aulaCondicional;

import java.util.Scanner;

public class Exifcomposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner ler = new Scanner(System.in);
	        int numero;
	        
	        System.out.print("Informe o número: ");
	        numero= ler.nextInt();
	        
	        if (numero > 0) {
	        	System.out.println("O número é positivo");
	        }    
	        else if (numero == 0) {
	        	System.out.println();
	    }
	        else {
	        	System.out.println("O número é negativo");
	        	
	        }
	        ler.close();
		} 
	}

