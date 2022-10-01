package exercicios;

import java.util.Scanner;


public class URI1173 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		int vetor [] = new int[10];
		vetor [0] = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			vetor [i] = vetor[i -1] *2;
		}
		for (int i=0; i <10; i++) {
            System.out.println("N["+ i +"] = " + vetor[i]);
        }
		sc.close();
	}
}
