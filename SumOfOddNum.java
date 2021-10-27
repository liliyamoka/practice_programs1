//Write a java program to find sum of all odd numbers between 1 to n
import java.util.Scanner;

public class SumOfOddNum {

	public static void main(String[] args) {
		int i,sum=0;
		Scanner sc=new Scanner(System.in);

		System.out.print("enter number");
		int num=sc.nextInt();
		for (i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
				
			}
			
		}
		System.out.print(sum);
		
	}

}
