package exercicios;

import java.util.Scanner;

public class URI3055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota1 = sc.nextInt();
		int media = sc.nextInt();
		System.out.printf("%d\n", media * 2 - nota1);
	}
}
