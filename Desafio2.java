package aulaCondicional;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner ler = new Scanner(System.in);
         int resposta;
         
         System.out.println("digite o número do dia da semana");
         resposta= ler.nextInt();
         
         if (resposta == 1) {
           System.out.println("domingo");
           
         } else if (resposta == 2) {
		  System.out.println("segunda");
		  
         } else if (resposta == 3 ) {
        	 System.out.println("terça");
         
         } else if (resposta == 4 )	 {
        	 System.out.println("quarta");
        	 
         } else if (resposta == 5 ) {
        	 System.out.println("quinta");
        	 
         } else if (resposta == 6) {
             System.out.println("sexta") ;
             
	     } else if (resposta == 7) {
        	System.out.println("sabado");
	} 
  ler.close();
	} 
}
