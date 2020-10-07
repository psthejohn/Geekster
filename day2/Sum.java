import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("Please input number of numebrs : ");
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		int counter = 0;
		int[] a = new int[numbers];
		while (numbers > 0) {
			System.out.println("please enter the" + counter + "numeber : ");
			a[counter] = sc.nextInt();
			counter++;
			numbers--;
		}
		int comparator = 0;
		for (int k : a) {
			if (a[k] > comparator) {
				comparator = a[k];
			}
		}
		System.out.println(comparator + " is the largest");
		sc.close();
	}
}

//int a=0;
//while(numbers>0) {
//	System.out.println("please input : ");
//	a  += sc.nextInt();
//	numbers--;
//}
//System.out.println("The sum is : "+a);
//}