package Aula3;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Informe o número: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O número %d é par. \n", num);
		}
		
		System.out.println("\nEncerramento do programa...");
		
		sc.close();
	}

}
