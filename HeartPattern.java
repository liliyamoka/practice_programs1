//print heart pattern
public class HeartPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int row=0;row<6;row++) {
			
			for(int col=0;col<7;col++) {
				
				if(row==0 && col%3!=0 || row==1 && col%3==0 || row+col==8 || row-col==2) {
				
				        System.out.print(" * ");
				}
				else { 
					System.out.print("   ");
				}
				
			}
			System.out.println();
	}

	}
}
