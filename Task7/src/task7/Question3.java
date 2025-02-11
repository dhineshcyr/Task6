package task7;
	import java.util.Scanner;

	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	public class Question3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();
	        
	        try {
	            if (age < 18) {
	                throw new InvalidAgeException("Age must be 18 or above.");
	            }
	            System.out.println("Valid age entered.");
	        } catch (InvalidAgeException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	        
	        scanner.close();
	    }
	}
//output
//Enter age: 26
//Valid age entered.