import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		int input = sc.nextInt();
		
		if(input%4 ==0 && input%100!=0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
		sc.close();
	}
}