/*14. Write a C program to input basic salary of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%*/
import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter basic salary:");
		double basic=sc.nextDouble();
		    double gross,da,hra;
		    if(basic <=10000)
		    {
		        da = basic * 0.8;
		        hra = basic *0.2;
		        gross = basic + da + hra;
		       
		    }
		           
		        else if(basic <=20000)
		    {
		        da = basic * 0.9;
		        hra = basic *0.25;
		        gross = basic + da + hra;
		    }
		    else
		    {
		        da = basic * 0.95;
		        hra = basic * 0.3;
		        gross = basic + da + hra;

		    }
		    System.out.println("The hra is :"+hra);    
	        System.out.println("the da is:"+da);
	        System.out.println("the gross salary is :"+gross);
		
	}

}
