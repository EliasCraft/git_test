
public class Functional {
	
	public static int calcAct(int x1, int x2, String action){
		
		int result = 0;
		
		switch(action){
		
		case "+": result = x1 + x2;
		break;
		
		case "-": result = x1 - x2;
		break;
		
		case "*": result = x1 * x2;
		break;
		
		case "/": result = x1 / x2;
		break;
		}
		
		return result;	
		
		}
	}
