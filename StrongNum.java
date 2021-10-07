import java.util.Scanner;
public class StrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,fact=1,rem=0,temp=0,sum=0;
		System.out.print("Enter the number : ");
		n = sc.nextInt();
		
		while(n!=0)
		{
			fact=1;
			rem=n%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
			
			
		}
		if(sum==temp)
		{
			System.out.print("strong number");
		}
		else {
			System.out.print("not strong number");
		}
	}

}
