package package2;

public class FinalVar 
{
	final double pi=3.14;
	FinalVar()
     {
    	final int r=7;
    	double area;
    	area= pi*r*r;	
    	System.out.println(area);
     }
     
	public static void main(String[] args)
	{
		new FinalVar();
		
	}

}
