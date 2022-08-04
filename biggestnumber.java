import java.io.IOException;
import java.util.*;
public class biggestnumber 
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if(a>b)
        {
            if(a>c)
            System.out.println("the biggest number is:"+a);
            else
            System.out.println("the biggest number is:"+c);
        }
        else
        {
            if(b>c)
            System.out.println("the biggest number is:"+b);
            else
            System.out.println("the biggest number is:"+c);
        }

    }
}
