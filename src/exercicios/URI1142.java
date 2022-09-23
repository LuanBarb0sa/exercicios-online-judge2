package exercicios;

import java.util.Scanner;

public class URI1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			num1++;
			System.out.print(num1);
			System.out.print(" ");
			num1++;
			System.out.print(num1);
			System.out.print(" ");
			num1++;
			System.out.print(num1);
			System.out.print(" ");
			System.out.println("PUM");
			num1++;
		}
		sc.close();
	}
}
