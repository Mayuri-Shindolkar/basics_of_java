package package2;
import java.util.Scanner;
public class Assignment22Scanner {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s1.nextInt();
		System.out.println("Enter the value of b:");
		int b=s1.nextInt();
		System.out.println("Enter the value of c:");
		int c=s1.nextInt();
		double circumferance_of_triangle=(a+b+c);
		System.out.println("CIRCUMFERANCE OF TRIANGLE:"+circumferance_of_triangle);
	}

}
