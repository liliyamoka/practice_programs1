//Write a java program to calculate factorial of a number
import java.util.Scanner;
public class FactorialNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter any number : ");
		int n=sc.nextInt();
		int fact=1,i;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print(fact);
	}

}
