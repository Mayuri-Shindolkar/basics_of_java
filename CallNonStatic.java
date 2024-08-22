package package2;

public class CallNonStatic 
{
	static void add() 
	{
	int a=10;
	int b=5;
			System.out.println(a+b);
	}
	
      static void sub()
      {
    	  int a=10;
    	  int b=5;
    	  System.out.println(a-b);
      }
      static void multiply()
      {
    	  int a=10;
    	  int b=5;
    	  System.out.println(a*b);
      }
	public static void main(String[] args)
	{
           add();
           sub();
           multiply();
	}

}
