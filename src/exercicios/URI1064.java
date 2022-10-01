package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class URI1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double total = 0;
		int positivos = 0;
		int count = 0;
		double media;
		while (count < 6) {
			double valor = sc.nextDouble();
			if (valor >= 0) {
				total += valor;
				positivos++;
			}
			count++;
		}
		media = total/positivos;
		System.out.println(positivos + " valores positivos");
		System.out.println(String.format("%.1f", media));
		sc.close();
	}
}
