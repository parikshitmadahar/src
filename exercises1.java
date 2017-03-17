
public class exercises1 {
		
	public static void main(String[] args)
		throws java.io.IOException{
		
		System.out.println("The capital of United states is Washington, DC? (Answer T or F)");
		
		char input;
		
		input= (char) System.in.read();
		
		if (input == 'T') 
			System.out.println("Correct");
		if (input == 'F')		
				System.out.println("Incorrect");
		
	}

}
