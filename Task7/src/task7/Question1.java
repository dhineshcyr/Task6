package task7;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First number: ");
		int num1=scanner.nextInt();
		
		System.out.println("Enter Second number: ");
		int num2=scanner.nextInt();
		
		try {
			int result=num1/num2;
			System.out.println("Result: "+ result);
		
		    }
		catch (ArithmeticException  e) 
		{
		System.out.println("Error: Devision by zero is not allowed");
		}
		scanner.close();
	}

}
//Output
//Enter First number: 
//4
//Enter Second number: 
//0
//Error: Devision by zero is not allowed
