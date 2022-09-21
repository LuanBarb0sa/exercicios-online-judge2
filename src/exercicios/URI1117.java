package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class URI1117 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float nota1, media = 0, total = 0, total2 =0;
		
		while (total2 != 2) {
			nota1 = sc.nextFloat();
			if (nota1 >= 0.0 && nota1 <= 10.0) {
				total += nota1;
				total2++;
			} else {
				System.out.print("nota invalida\n");
			}
		}
		
		media = (float) total/2;
		System.out.printf("media = %.2f\n", media);
		sc.close();
	}
}
