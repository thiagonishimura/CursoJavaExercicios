package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer value: ");
		int n = sc.nextInt();
		while (n != 0) {
			int square = n * n;
			System.out.println(square);
			System.out.print("Enter an integer value: ");
			n = sc.nextInt();
		}

		sc.close();
	}

}
