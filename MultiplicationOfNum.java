//Write a java program to print multiplication table of any number
import java.util.Scanner;
public class MultiplicationOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  n value");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
		System.out.println(n+" x "+i+" = "+n*i);
		}
		
	}

}
