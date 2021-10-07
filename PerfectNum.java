import java.util.Scanner;
public class PerfectNum {

	public static void main(String[] args) {
		
		 System.out.print("Enter n value : ");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int sum=1;
		 for(int i=1;i<=n;i++)
		 {
			 if(n%i==0)
			 {
				 sum=sum+i;
			 }
		 }
		 if(sum==n)
		 {
			 System.out.print("number is perfect");
		 }
		 else {
			 System.out.print("number is not perfect");
		 }
		 
	}

}
