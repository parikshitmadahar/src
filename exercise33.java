import java.util.Scanner;
public class exercise33 {
	public static void main(String[] args) 
		throws java.io.IOException {
		
		double length= 0, width=0, perimeter, Area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle : ");
		
		if (input.hasNextDouble() ==true)
				length= input.nextDouble();
		
		System.out.println("Enter the width of the rectangle : ");
		
		if (input.hasNextDouble() ==true)
		width= input.nextDouble();
		
		Area = (length * width);
		perimeter= 2 * (length + width);
		
		System.out.println("The Perimeter of the Rectangle is : " + perimeter);
		System.out.println("The Area of the Rectangle is " + Area);
	}
}
