package codingquestions;

public class TechQuestion {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1&&j==1) {
				System.out.print("X-workz");
				}
				else {
					System.out.print(" "+i+" ");
				}
				
			}
			System.out.println(" ");
			
		}

		System.out.println("************************************************EXAMPLE-2***********************************************************");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==3&&j==3) {
				System.out.print("X-workz");
				}
				else {
					System.out.print(" "+j+" ");
				}
				
			}
			System.out.println(" ");
			
		}
	}

}
