import java.util.Scanner;

public class exercise32 {
	public static void main(String[] args) 
		throws java.io.IOException{
		
		System.out.println("Enter the radius of the circle as a Decimal Number : ");
		
		double radius= 1.0, Area;
		final double Pi= 3.14;
		
		Scanner input = new Scanner(System.in);
		if (input.hasNextDouble()== true)
		radius = input.nextDouble();
		
		
		Area= Pi*radius*radius;
		
		System.out.println("The radius of the Circle is " + radius + " meters.");
		System.out.println("The area of the circle is " + Area + " square meters. ");
	}
}
