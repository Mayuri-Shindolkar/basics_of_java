package package2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner d1=new Scanner (System.in);
		System.out.println("Press 1 for chrome:");
		System.out.println("Press 2 for Firefox:");
		System.out.println("Press 3 for Edge:");
		int brouser_selection=d1.nextInt();
		switch(brouser_selection)
		{
		case 1:System.out.println("Launch chrome brouser");
		break;
		case 2:System.out.println("Launch firefox brouser");
		break;
		case 3:System.out.println("Launch Edge brouser");
		break;
		default:
			System.out.println("Your selection is wrong");
		}

	}

}
