package ic.doc;

import java.util.Stack;

public class Model {
	
	private Stack<Object> calcStack = new Stack<Object>();
	
	
	public Model() {

	}
	
	public void addToCalculation(int i) {
		if (calcStack.size() < 2) {
		    calcStack.add(i);
		}
	}
	
	public void addToCalculation(char c) {
		if (calcStack.size() == 2) {
		    calcStack.add(c);
		}
	}
	
	public int calculate() {
		assert (calcStack.size() == 3);
		
		char oper = (char) calcStack.pop();
		int arg2 = (int) calcStack.pop();
		int arg1 = (int) calcStack.pop();
		
		switch (oper) {
		case '+' : return arg1 + arg2;
		case '-' : return arg1 - arg2;
		case '*' : return arg1 * arg2;
		case '/' : return arg1 / arg2;
		default  : System.err.print("Invalid operation"); return 0;
		}	
		
	}
	
	public boolean timeToCalculate() {
		return calcStack.size() == 3;
	}

}
