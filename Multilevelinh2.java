import java.io.IOException;
import java.util.*;
 class Aa
 {
     int sno;
     String sname;
     Scanner sc = new Scanner(System.in);
     void in()
     {
        System.out.println("Enter sno:");
        this.sno=sc.nextInt();
        System.out.println("Enter sname:");
        sname=sc.nextLine();
        sc.nextLine();
     }                      
    void out()
    {
         System.out.println("The sno is:"+sno);
         System.out.println("The sname is:"+sname);
    }
 }  
class Ba extends Aa
{
     int s1,s2,s3,total;
     void put()
     {
        in();
        System.out.println("Enter the s1 marks:");
        this.s1 = sc.nextInt();
        System.out.println("Enter the s2 marks:");
        this.s2 = sc.nextInt();
        System.out.println("Enter the s3 marks:");
        this.s3 = sc.nextInt();
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
class Ca extends Ba
{
        int pract1,pract2,grandtotal;
        float Per;
        void indata()
        {
            put();
            System.out.println("the pract1 marks:");
            this.pract1=sc.nextInt();
            System.out.println("The pract2 marks:");
            this.pract2=sc.nextInt();
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
class Da extends Ca
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
            System.out.println("you are succesfully failed in your exams");
            }
            
        }        
}

public class Multilevelinh2 
{
  public static void main(String args[]) throws IOException
    {
        Da obj=new Da();
        obj.manu();
            
    }
}