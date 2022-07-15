import java.util.*;
public class prg2 
{
	int empNo;
	String empName;
	int sal;
	double hra;
	double pf;
	double da;
	double netSal;
	Scanner sc=new Scanner(System.in);
	void read() 
	{
		System.out.println("enter the empno:");
		empNo=sc.nextInt();
		System.out.println("enter empname:");
		empName=sc.next();
		System.out.println("enter sal");
		sal=sc.nextInt();
	}
	void display()
	{
		System.out.println("empno is:"+empNo);
		System.out.println("empname is:"+empName);
		if(sal<=5000) 
		{
			hra=sal*(15/100.0);
			da=sal*(12/100.0);
			pf=sal*(9/100.0);
			netSal=sal+hra+da-pf;
		}
		System.out.println("hra is:"+hra);
		System.out.println("da is:"+da);
		System.out.println("pf is:"+pf);
		System.out.println("netsal is:"+netSal);
		
	}
	public static void main(String args[]) 
	{
	prg2 emp=new prg2();
	System.out.println("enter the details:");
	emp.read();
	System.out.println("the details are:");
	emp.display();
	}
}
