package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 numeros inteiros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.print("O maior é: " + a);
		} 
		
		else if (b > a && b > c) {
			System.out.print("O maior é: " + b);
		}

		else {
			System.out.print("O maior é: " + c);
		}

		sc.close();
	}

}
