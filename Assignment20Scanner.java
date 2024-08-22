package package2;
import java.util.Scanner;
public class Assignment20Scanner {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of length:");
		int l=s1.nextInt();
		System.out.println("Enter the value of breadth:");
		int b=s1.nextInt();
		double area_of_rectangle=l*b;
		System.out.println("Area of rectangle is:"+area_of_rectangle);
	}

}
