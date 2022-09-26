package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class URI1985 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int entrada = sc.nextInt();
		double total = 0;
		
		while(contador < entrada) {
			
			int produto = sc.nextInt();
			int quantidade = sc.nextInt();
			
			if (produto == 1001) {
				total = total + quantidade * 1.50;
			} else if (produto == 1002) {
				total = total + quantidade * 2.50;
			} else if (produto == 1003) {
				total = total + quantidade * 3.50;
			} else if (produto == 1004) {
				total = total + quantidade * 4.50;
			} else if (produto == 1005) {
				total = total +quantidade * 5.50;
			}
			contador ++;
		}
		System.out.printf("%.2f\n",total);
		sc.close();
	}

}
