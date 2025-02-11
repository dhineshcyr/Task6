package task7;

public class Question2 {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException & StringIndexOutOfBoundsExceptionb
		try {
			int[] number= {1,2,3};
			System.out.println(number[5]);
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Array index out of bounds. ");
		}
		try {
			String text="java";
			System.out.println(text.charAt(10));
		
		}catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index out of bounds.");
		
	}
	
	}}

//output
//Error: Array index out of bounds. 
//Error: String index out of bounds.
