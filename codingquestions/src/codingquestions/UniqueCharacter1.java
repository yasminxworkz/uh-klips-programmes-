package codingquestions;

public class UniqueCharacter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean result=false;
	        String inputstring="Alive";
	        System.out.println("String method 2 answer "+ method2(inputstring));
	    }
	    
	    public static boolean method2(String input)
	    {
	        for(int i=0; i < input.length();i++)
	        {
	            char charcterofinputstring=input.charAt(i);
	            int count=0;
	            for(int j=i; j < input.length();j++)
	            {
	                if (charcterofinputstring==input.charAt(j))
	                count++;
	            }
	            if(count > 1)
	            return false;
	        }
	        return true;

	}

}
