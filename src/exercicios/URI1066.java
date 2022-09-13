package exercicios;

import java.util.Scanner;

public class URI1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int par = 0;
		int imp = 0;
		int pos = 0;
		int neg = 0;
		
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				imp++;
			}
			if (num > 0 && num != 0) {
				pos++;
			} else if (num != 0) {
				neg++;
			}
		}
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(imp + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");

		sc.close();
	}

}
