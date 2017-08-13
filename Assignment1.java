// Pragnesh
// 1/22/2016
// Programming Assignment #1
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		int row = 0;
		int[] reminder = new int[16];

		System.out.println("Enter a decimal number");
		Scanner s = new Scanner(System.in);

		int input = s.nextInt();

		if (input <= 0) {
			System.out.println("Enter a value other than Zero or negitive number ");
			input = s.nextInt();
		}
		while (input > 0) {
			reminder[row++] = input % 2;
			input = input / 2;
		}

		for (int i = row - 1; i >= 0; i--) {
			System.out.println(reminder[i]);
		}

		if (input > 65535) {
			System.out.println("The decimal value entered was out of range");
		}
	}
}
