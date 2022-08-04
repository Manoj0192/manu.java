
import java.util.*;
 class A 
 {
     int sno;
     String sname;
     Scanner sc = new Scanner(System.in);
     void in()
     {
        System.out.println("Enter sno:");
        sno=sc.nextInt();
        System.out.println("Enter sname:");
        sname=sc.next();
     }
    void out()
    {
         System.out.println("The sno is:"+sno);
         System.out.println("The sname is:"+sname);
    }
 }  
  class B extends A
{
     int s1,s2,s3,total;
     float Per;
     void put()
     {
        in();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the s1 marks:");
        s1 = sc.nextInt();
        System.out.println("Enter the s2 marks:");
        s2 = sc.nextInt();
        System.out.println("Enter the s3 marks:");
        s3 = sc.nextInt();
        total=s1+s2+s3;
        Per=total/3.0f;
     }
     
    void get()
     {
         out();
         System.out.println("The maths marks are:"+s1);
         System.out.println("The stat marks are:"+s2);
         System.out.println("The comp marks are:"+s3);
         System.out.println("The total marks are:"+total);
         System.out.println("The percentage marks are:"+Per);
     }
} 
public class simpleinh
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.put();
        obj.get();
    }
}

