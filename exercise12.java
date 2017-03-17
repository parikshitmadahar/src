
public class exercise12 {
	public static void main(String[] args)
	throws java.io.IOException{
		
		System.out.println("I am thinking a letter between A to Z. \n Guess my Letter:");
		
		char input;
		
		input= (char) System.in.read();
		
		if ((input =='W') || (input =='w') ) System.out.println("Correct");
		if ((input !='W') && (input !='w') ) System.out.println("Nope, Not Correct");
			
		
	}
}
