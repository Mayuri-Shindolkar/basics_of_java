package package2;

public class Method_Overloading {
	static void add()
	{
		System.out.println("1");
	}
	static void add(int a)
	{
		System.out.println("2");
	}
	 void add(String a,char b,double c)
	{
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		add();
		add(100);
		 Method_Overloading d=new  Method_Overloading();
	    d.add("abc",'m',2.4);
	}

}
