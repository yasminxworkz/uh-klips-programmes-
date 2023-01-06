package codingquestions;

public class RotationString {
	
	public static boolean checkRotation(String st1,String st2) {
		if(st1.length()!=st2.length()) {
			return false;
		}
		String st3=st1+st1;
		if(st3.contains(st2))
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		
		String str1="vinoda";
		String str2="adoniv";
		
		System.out.println("Checking if a string is rotation of another");
		
		if(checkRotation(str1,str2)) {
			System.out.println("yes"+str2+"is rotation of"+str1);
		}
		else {
			System.out.println("no "+str2+"is not rotation of "+str1);
		}
		

	}

}
