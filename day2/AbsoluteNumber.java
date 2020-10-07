import java.util.Scanner;

public class AbsoluteNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number : ");
		double num = sc.nextDouble();

		if (num < 0.0) {
			num = 0 - num;
			System.out.println(num);
		} else {
			System.out.println(num);
		}
		sc.close();
	}

}
