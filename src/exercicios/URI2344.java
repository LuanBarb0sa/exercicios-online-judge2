package exercicios;

import java.util.Scanner;

public class URI2344 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();
		
		if (nota < 1) {
			System.out.println("E");
		} else if (nota >= 1 && nota <= 35) {
			System.out.println("D");
		} else if (nota >= 36 && nota <= 60) {
			System.out.println("C");
		} else if (nota >= 61 && nota <= 85) {
			System.out.println("B");
		} else if (nota >= 86) {
			System.out.println("A");
		}

		sc.close();
	}
}