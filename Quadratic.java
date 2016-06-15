import java.util.Scanner;
public class Quadratic
{
	public static void main(String[] args) 
	{
		int a, b, c; 
		double root1, root2, real1, imag1, d; 
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter a:");
		a = s.nextInt(); //take first input a
		System.out.print("Enter b:");
		b = s.nextInt(); //take second input b
		System.out.print("Enter c:");
		c = s.nextInt(); //take third input c
		System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
		d = b * b - 4 * a * c; //calculate discriminant

		if(a == 0) //if a=0 : then one real solution
		{
		System.out.println("One real solution");
		root1 = (-c)/(b); //root is -c/b
		System.out.println("Root is: "+root1);
		}
		else if(d > 0) //when discriminant is positive : real and unique roots
		{
			System.out.println("Roots are real and unique");
			root1 = ( - b + Math.sqrt(d))/(2*a);
			root2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("First root is: "+root1);
			System.out.println("Second root is: "+root2);
		}
		else if(d < 0) //when discriminant is negative : imaginary roots
		{
			System.out.println("Roots are imaginary");
			real1 = (- b)/(2*a);
			imag1 = (Math.sqrt(-d))/(2*a);
			System.out.println("First root is: "+real1+"+"+imag1+"i");
			System.out.println("Second root is: "+real1+"-"+imag1+"i");
		}		
		else if(d == 0) //when discriminant is 0 : real and equal roots
		{	
			System.out.println("Roots are real and equal");
			root1 = (-b+Math.sqrt(d))/(2*a);
			System.out.println("Root:"+root1);
		}
	}
}
