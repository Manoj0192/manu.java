import java.io.IOException;
import java.util.*;
public class bigno1 
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a>b&&b>c)
        {
            if(a>b)
            System.out.println("the biggest number is:"+a);
            else
            System.out.println("the biggest number is:"+b);          
        }
        if(b>a&&a>c)
        {
            if(b>a)
            System.out.println("the biggest number is:"+b);
            else
            System.out.println("the biggest number is:"+a);
        }
        if(c>a&&a>b)
        {
            if(c>a)
            System.out.println("the biggest number is:"+c);
            else
            System.out.println("the biggest number is:"+a);
        }
        if(d>a&&a>b)
        {
            if(d>a)
            System.out.println("the biggest number is:"+d);
            else
            System.out.println("the biggest number is:"+a);
        }
    }
}
