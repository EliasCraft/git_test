import java.util.*;


public class Calculator {

	public static void main (String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int n1 = input.nextInt();
		
		System.out.println("Enter the second number: ");
		int n2 = input.nextInt();
		
		System.out.println("Enter the action: ");
		String act = input.next();
		
		input.close();
		
		System.out.println("The result is: " +Functional.calcAct(n1, n2, act));
		
	}
	
}
