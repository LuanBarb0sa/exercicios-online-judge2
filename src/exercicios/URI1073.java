package exercicios;

import java.util.Scanner;

public class URI1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				System.out.printf(i + "^2 = " + "%.0f\n", Math.pow(i, 2));
			}
		}
		sc.close();
	}

}
