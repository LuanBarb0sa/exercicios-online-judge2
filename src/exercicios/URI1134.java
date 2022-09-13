package exercicios;

import java.util.Scanner;

public class URI1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int fim = 4;
		
		int numero = sc.nextInt();
		
		switch(numero) {
		case 1:
			alcool += 1;
		
		case 2:
			gasolina += 1;
			
		case 3:
			diesel += 1;
		case 4:
			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel);
			
		}
		
		
	}

}
