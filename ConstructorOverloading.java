package package2;

public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
		System.out.println("This is constructor overloading");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("This is constructor overloading with parameter");
	}
	ConstructorOverloading(int a,double b)
	{
		System.out.println("This is constructor overloading with two parameter");
	}
	
	public static void main(String[] args)
	{
		new ConstructorOverloading();
        new ConstructorOverloading (34);
        new ConstructorOverloading(12,3.14);
       
	}

}
