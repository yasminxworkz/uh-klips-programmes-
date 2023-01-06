package codingquestions;

public class ArithmaticOperations {

	public static void main(String[] args) {
	
	
		String s="+-*/";
		int a=20;
		int b=10;
		
		
		for(int i=0;i<s.length();i++) {
			char temp=s.charAt(i);
			
			if(temp=='+') {
				System.out.println(a+b);
				
			}
			
			else if (temp=='-') {
				System.out.println(a-b);
				
			}
			
			else if(temp=='*') {
				System.out.println(a*b);
			}
			
			else if (temp=='/') {
				System.out.println(a/b);
			}
			
		}
		
		
	}

}
