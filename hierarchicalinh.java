import java.io.IOException;
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
         sname=sc.nextLine();
        sname+=sc.nextLine();    
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
     void put()
     {
        in();
        System.out.println("Enter the s1 marks:");
        s1 = sc.nextInt();
        System.out.println("Enter the s2 marks:");
        s2 = sc.nextInt();
        System.out.println("Enter the s3 marks:");
        s3 = sc.nextInt();
        total=s1+s2+s3;        
     }
     
    void get()
     {
         out();
         System.out.println("The maths marks are:"+s1);
         System.out.println("The stat marks are:"+s2);
         System.out.println("The comp marks are:"+s3);
         System.out.println("The total marks are:"+total);
    }
} 
class C extends B
{
        int pract1,pract2,grandtotal;
        float Per;
        void indata()
        {
            put();
            System.out.println("the pract1 marks:");
            pract1=sc.nextInt();
            System.out.println("The pract2 marks:");
            pract2=sc.nextInt();
            grandtotal=total+pract1+pract2;
            Per=grandtotal/5.0f;
        }
        void outdata()
        {
            get();
            System.out.println("the pract1 marks are:"+pract1);   
            System.out.println("the pract2 marks are:"+pract2);
            System.out.println("the grandtotal:"+grandtotal);
            System.out.println("the percentage:"+Per);
        }
}
class D extends C
{

        void manu()
        {
            indata();
            if(s1>35&&s2>35&&s3>35&&pract1>35&&pract2>35)
            {
                get();
                outdata();
            }
            else
            {
            System.out.println("You are succesfully failed in your exams");
            }
            
        }        
}

public class multilevelinh2 
{
  public static void main(String args[]) throws IOException
    {
        D obj=new D();
        obj.manu();
            
    }
}