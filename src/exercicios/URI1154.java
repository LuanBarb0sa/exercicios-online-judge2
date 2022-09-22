package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class URI1154 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = 0;
		double total = 0, count = 0;

		while (idade >= 0) {
			idade = sc.nextInt();
			if (idade >= 0) {
				total += idade;
				count++;
			}
		}
		double med = total / count;
		System.out.printf("%.2f\n", med);
		sc.close();
	}

}
