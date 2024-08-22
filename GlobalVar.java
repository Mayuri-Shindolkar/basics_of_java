package package2;

public class GlobalVar 
{
        static double pi=3.14;      //global variable
        static int age;              //default value
            String name="advik";
            static int a=20;
           static int b=10;
      static void multiplication()
      {
    	System.out.println(a*b);
      }
	public static void main(String[] args)
	{
		System.out.println(pi);
        System.out.println(age);
        GlobalVar b=new GlobalVar();
        b.name="mayuri";
        System.out.println(b.name);
        multiplication();
        
	}

}
