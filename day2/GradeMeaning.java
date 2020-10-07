import java.util.Scanner;

public class GradeMeaning {

	public static void main(String[] args) {
		System.out.print("Please input a Grade Value : ");
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
//		int input1 = sc.nextInt();
		
		System.out.print("O/P - ");
		switch (input) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Deficient");
			break;
		case 'F':
			System.out.println("Failing");
			break;
		case 'a':
			System.out.println("Excellent");
			break;
		case 'b':
			System.out.println("Good");
			break;
		case 'c':
			System.out.println("Average");
			break;
		case 'd':
			System.out.println("Deficient");
			break;
		case 'f':
			System.out.println("Failing");
			break;
		default:
			System.out.println("Please choose a valid string : A / B /C /D /F");
			
		}
		sc.close();
	}

}
