package package2;
import java.util.Scanner;
public class Assignment21Scanner {
      
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		
           System.out.println("Enter the value of radious:");
           int r=s1.nextInt();
           double pi=3.14;
           double circumferance_of_circle=2*pi*r;
           System.out.println("CIRCUMFERANCE OF CIRCLE:"+circumferance_of_circle);
        		   
	}

}
