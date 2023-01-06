package codingquestions;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String t="White Space Count csddf cfghhh";
		int count=1;
		
		for(int i=0; i<t.length(); ++i) {
			
			if(t.charAt(i)==' ') 
				count++;
				
		
		}
		System.out.println("words "+count);
		System.out.println(count-1);

	}

}
