
public class exercises13 {
	public static void main(String[] args)
	throws java.io.IOException{
			
		System.out.println("Write one letter :");
		char input, output;
		
		input = (char) System.in.read();
		
		output= (char) (input-32);
		
		System.out.println("You typed in the letter : " + input);
		System.out.println("The Upper Version is : " + output);
		
	}
}
