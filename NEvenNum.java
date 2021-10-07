import java.util.Scanner;

public class NEvenNum {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);

		System.out.print("enter number");
		int num=sc.nextInt();

		i=1;
		while(i<=num){
		if(i%2==0){
		System.out.print(i+" ");
		}
		 i++;
		}

	}

}
