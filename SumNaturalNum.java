import java.util.Scanner;

public class SumNaturalNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.print("enter n value :");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)//while(i<=n)
		{
		sum=sum+i;
		//i++;
		}
		System.out.print(sum);
	}

}
