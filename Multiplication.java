# priyakarth
import java.util.Scanner;

public class Multiplication
{
	public static void main(String[] args) {
		int a,b;
		Scanner s =new Scanner(System.in);
		System.out.println("enter the number");
		a=s.nextInt();
		 System.out.println("Multiplication table of "+a+" is :-");
		 
	      for ( b = 1 ; b <= 10 ; b++ )
	  System.out.println(a+"*"+b+" = "+(a*b));
		
	
	}
}
