//print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}

	}

}
