package exercicios;

import java.util.Scanner;

public class URI1132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int contador = 0;
		
		if (x > y) {
			for (int i = y; i <= x; i++) {
				if (i % 13 != 0) contador += i;
			}
		} else {
			for (int i = x; i <= y; i++) {
				if (i % 13 != 0) contador += i;
			}
		}
		System.out.println(contador);
		sc.close();
	}
}
