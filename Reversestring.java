package package2;

public class Reversestring {

	public static void main(String[] args) {
		String input="advik";
		String output="";
		for(int i=4;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
			
		}
		System.out.println(output);
		/*char c1=input.charAt(4);
		char c2=input.charAt(3);
		char c3=input.charAt(2);
		char c4=input.charAt(1);
		char c5=input.charAt(0);*/	        
	}

}
