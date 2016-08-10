# priyakarth
import java.util.Scanner;

public class Swap
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the a values:");
	int a=s.nextInt();
	System.out.println("enter the values of b:");
	int b=s.nextInt();
	System.out.println("Before swapping a and b:"+a+b);
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("after swaping a and b:"+a+b);
	
}
}
