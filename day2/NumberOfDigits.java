import java.util.*;

public class NumberOfDigits {

	public static void main(String[] args) {
		System.out.println("============PROGRAM TO CHECK NUMBER OF DIGITS IN A NUMBER ==========");
		System.out.print("Please input a number :: ");
		Scanner sc = new Scanner(System.in);
		int number = Math.abs(sc.nextInt());
		int original = number;
		int counter = 0;
		while (number != 0) {
			number /= 10;
			counter++;
		}
		if(original == 0) {
			counter = 1;
		}
		System.out.println("Total Number of digits in " + original + " :: " + counter);
		sc.close();
	}
}
