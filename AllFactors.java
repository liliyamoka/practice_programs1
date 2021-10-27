//37. Write a java program to find all factors of a number.
import java.util.Scanner;
public class AllFactors {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("enter any number : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
