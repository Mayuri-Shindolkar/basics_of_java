package package2;

public class LocalVar
{
     static void add()
     {
    	 double c=3.14;
    	 System.out.println("This is local variable");
     }
     void sub()
     {
    	int a=30;
    	System.out.println("This is 2nd local variable");
     }
	public static void main(String[] args)
	{
		add();
		LocalVar b=new LocalVar();
		b.sub();
	}

}
