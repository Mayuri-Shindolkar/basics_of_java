package package2;
import java.util.Scanner;
public class Assignment18 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int num;
		System.out.println("Enter the value:");
		num=s1.nextInt();
		if(num % 2==0)
		{
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}

	}

}
