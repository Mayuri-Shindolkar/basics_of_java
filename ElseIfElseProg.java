package package2;

public class ElseIfElseProg {

	public static void main(String[] args) {
		String gender1="Femele";
		String gender2="Male";
		int  age=13;
		if(gender1=="Female")
		{
			System.out.println("Travelling is free");
		}
		else if(age <= 12)
		{
			System.out.println("Travelling ticket is half");
		}
		else if(age>12 && age<=59)
		{
			System.out.println("Ticket is full");
		}
		else if(age > 60)
		{
			System.out.println("Senior citizen ticket");
		}

		else
		{
			if(gender2=="Male")
			System.out.println("Travelling is not free");
		}

	}

}
