package package2;
import java.util.Scanner;
public class Assignment23Scanner {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the value of l:");
		int l=s1.nextInt();
		System.out.println("Enter the value of b:");
		int b=s1.nextInt();
		double circumferance_of_rectangle=2*(l+b);
		System.out.println("CIRCUMFERANCE OF RECTANGLE:"+circumferance_of_rectangle);

	}

}
