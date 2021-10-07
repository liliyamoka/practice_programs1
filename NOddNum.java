
import java.util.Scanner;
class NOddNum{
public static void main (String args[]){
int i;
Scanner sc=new Scanner(System.in);

System.out.print("enter number");
int num=sc.nextInt();

i=1;
while(i<=num){
if(i%2==1){
System.out.print(i+" ");
}
 i++;
}
}
}