package package2;
import java.util.Scanner;
public class Assignment19Scanner {
        
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of base:");
		double b =s1.nextDouble();
		System.out.println("Enter the value of height:");
		double h =s1.nextDouble();
		double area_of_triangle=(b*h)/2;
		System.out.println("Area of triangle is:"+area_of_triangle);

	}

}
