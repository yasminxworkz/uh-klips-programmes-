package codingquestions;

public class UniqueCharacters {

	
		 public static void main (String args[])
		    {
		        boolean result=false;
		        String inputstring="Alive is awesome";
		        System.out.println("String method 4 answer "+ method4(inputstring));
		    }
		    
		    public static boolean method4(String input)
		    {
		        boolean result=false;
		        for (char ch: input.toCharArray())
		        {
		            if(input.indexOf(ch)== input.lastIndexOf(ch))
		            result= true;
		            else
		            {
		                result=false;
		                break;
		            }
		        }
		        return result;
		        
		        
		        
		       
		    }
	}


