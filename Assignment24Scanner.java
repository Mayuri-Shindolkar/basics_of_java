package package2;
import java.util.Scanner;
public class Assignment24Scanner {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s1.nextInt();
		System.out.println("Enter the value of b:");
		int b=s1.nextInt();
		System.out.println("Enter the value of h:");
		int h=s1.nextInt();
		double area_of_trapezium=0.5*(a+b)*h;
		System.out.println("AREA OF TRIPEZIOM IS:"+area_of_trapezium);

	}

}
