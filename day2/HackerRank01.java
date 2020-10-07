import java.util.Scanner;

public class HackerRank01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		String s = null;
		while (scan.hasNext()) {
			s += scan.next();
		}

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		scan.close();
	}
}