package aulaCondicional;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner ler = new Scanner(System.in);
	         int resposta;
	         
	         System.out.println("digite o número do dia da semana");
	         resposta= ler.nextInt();
	         
	         if (resposta == 1) {
	           System.out.println("janeiro");
	           
	         } else if (resposta == 2) {
			  System.out.println("fevereiro");
			  
	         } else if (resposta == 3 ) {
	        	 System.out.println("março");
	         
	         } else if (resposta == 4 )	 {
	        	 System.out.println("abril");
	        	 
	         } else if (resposta == 5) {
	             System.out.println("maio") ;
	             
		     } else if (resposta == 6) {
	        	System.out.println("junho");
	        	
		     } else if (resposta == 7) {
	             System.out.println("julho") ;
	             
		     } else if (resposta == 8) {
	             System.out.println("agosto") ;
	             
		     } else if (resposta == 9) {
	             System.out.println("setembro") ;
	             
		     } else if (resposta == 10) {
	             System.out.println("outubro") ;
	             
		     } else if (resposta == 11) {
	             System.out.println("novembro") ;
	             
		     } else if (resposta == 12) {
	             System.out.println("dezembro") ;
	}
ler.close();
	}
}
