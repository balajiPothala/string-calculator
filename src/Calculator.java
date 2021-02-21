
public class Calculator {
	
	public int calculate(String input) {
		if(isEmpty(input)) {
			return 0;
		}
		return Integer.parseInt(input);	
	}
	
	private boolean isEmpty(String input){
		return input.isEmpty();
	}

	private int StraightToInt(String input) {
		return Integer.parseInt(input);
	}
}
