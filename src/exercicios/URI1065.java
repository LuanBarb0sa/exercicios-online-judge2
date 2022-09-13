package exercicios;

import java.util.Scanner;

public class URI1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int total = 0;
		
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				total ++;
			}
		}
		System.out.println(total + " valores pares");
		sc.close();
	}
		
	}
