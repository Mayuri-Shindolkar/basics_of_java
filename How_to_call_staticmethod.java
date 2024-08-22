package package2;

public class How_to_call_staticmethod 
{
	void addition()
	{
		int a=30;
		int b=15;
	   System.out.println(a+b);
	}
	 void substraction()
	{
		 int a=30;
			int b=15;
		   System.out.println(a-b);
	}
	 void multiplication()
	 {
		 int a=30;
		 int b=15;
		 System.out.println(a*b);
	 }
	public static void main(String[] args )
	{
		How_to_call_staticmethod d=new How_to_call_staticmethod();
		d.addition();
		d.substraction();
		d.multiplication();
	}

}
