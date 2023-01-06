package codingquestions;

public class Swapping {

	public static void main(String[] args) {
		 int a=60;
		 int b=80;
		 int temp=0;
		 
		 temp=a;
		 a=b;
		 b=temp;
		 
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 
		 
///////////////////////swapping of numbers using another way////////////
		 
		 
		 
		 int c=60;
			int d=80;
			
			c=c+d;
			d=c-d;
			 c=c-d;
			 
			 System.out.println(c);
			 System.out.println(d);
		 
		
	}

}
