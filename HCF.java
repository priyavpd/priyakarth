# priyakarth
import java.util.*;
public class HCF
{
    public static void main(String args[])
    {
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int h=1;
        int p=a*b;
        for(int i=2;i<p;i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                h=i;
            }
        }
        System.out.println("HCF="+h);
    }
}

