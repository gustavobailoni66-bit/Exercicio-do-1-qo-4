package aulaCondicional;

import java.util.Scanner;

public class desafio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int numero;
	        Scanner ler = new Scanner(System.in);

	          System.out.println("Informe o valor: ");
	        numero = ler.nextInt();
	        
			   if (numero % 2 ==0)	{        
	            System.out.println("O número é par");
			   }
	           else { 
	            	
	            	System.out.println("O número é impar");     
	            }	            
	            ler.close();
	            
	    }	
	}
