package package2;
import java.util.Scanner;
public class Assignment17 {

	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		double pi=3.14f;
		int r;
		System.out.println("Enter the value of radious:");
		r=s1.nextInt();
		
		double area_of_circle=pi*r*r;
		System.out.println("Area of circle:"+area_of_circle);
		

	}

}
