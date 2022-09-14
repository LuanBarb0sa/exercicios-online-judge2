package exercicios;

import java.util.Scanner;

public class URI1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int valor = 0;
		int x = sc.nextInt();
		
		while (valor < 6) {
			if (x % 2 == 1) {
				System.out.println(x);
				valor++;
			} 
			x++;
		}
		sc.close();
	}
}
