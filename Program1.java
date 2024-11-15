package basics;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Enter 1st value:");
		a=s1.nextInt();		
		System.out.println("Enter 2nd value:");
		b=s1.nextInt();
		int sum =a+b;
		System.out.println("Sum of two numbers:"+sum);
		int sub =a-b;
		System.out.println("substraction of two numbers:"+sub);
		int multiply =a*b;
		System.out.println("multiplication of two numbers:"+multiply);
		int division =a/b;
		System.out.println("division of two numbers:"+division);
	}

}