import java.util.Scanner;
public class exercise31 {
	public static void main(String[] args)
		throws java.io.IOException{
		
		int test=1;
		
		System.out.println("Enter Your Age");
		Scanner input = new Scanner(System.in);
		
		if(input.hasNextInt()==true)
		{		
			test = input.nextInt();
		}
		
		System.out.println("You are now " + test + " years old");
		
		test= test+14;
		
		System.out.println("In 14 years you will be " + test + " years old");
	}
}
