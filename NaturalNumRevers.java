import java.util.Scanner;

public class NaturalNumRevers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int i=n;
		
		while(i>=1)
		{
			System.out.print(i+" ");
			i--;
		}

	}

}
