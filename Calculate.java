import java.lang.Math;

public class Calculate {
	public static void main(String[] args) {
		System.out.println("Calculate...");

		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);

		int sum = first + second;
		System.out.println("Sum = " + sum);

		int diff = first - second;
		System.out.println("Diff = " + diff);

		int multiply = first * second;
		System.out.println("Multiply = " + multiply);

		double div = (double)first / (double)second;
		System.out.println("Div = " + div);

		double pow = Math.pow(first, second);
		System.out.println("Pow = " + pow);
	}
}