package exercicios;

import java.util.Scanner;

public class URI1759 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		while(i <= N) {
			if (i == N) {
				System.out.println("Ho!");
				i++;
			} else {
				System.out.println("Ho ");
				i++;
			}
		}
		sc.close();
	}

}
