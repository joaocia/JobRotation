import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = input.nextInt();

		ArrayList<Integer> fibonacciSequence = getFibonacciSequence(num);
		if (fibonacciSequence.contains(num)) {
			System.out.println(num + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println(num + " não pertence à sequência de Fibonacci.");
		}
		input.close();

	}

	public static ArrayList<Integer> getFibonacciSequence(int num) {
		ArrayList<Integer> fibonacci = new ArrayList<>();
		int a = 0, b = 1;

		while (b <= num) {
			fibonacci.add(b);
			int temp = b;
			b += a;
			a = temp;
		}

		return fibonacci;
	}
}
