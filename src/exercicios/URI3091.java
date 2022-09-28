package exercicios;

import java.util.Scanner;

public class URI3091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,C;
		A = sc.nextInt();
		B = sc.nextInt();
		
		C = A % B;
		System.out.println(C);
		
		sc.close();
	}

}
