package ic.doc;

import java.util.Stack;

public class Model {
	
	private final Updatable view;
	private Stack<Object> calcStack;
	
	private int count = 0;
	
	public Model(Updatable view) {
	    this.view = view;
	}
	
	public void addToCalculation(int i) {
		calcStack.add(i);
		count++;
	}
	
	public void addToCalculation(char c) {
		calcStack.add(c);
		count++;
	}
	
	public int calculate() {
		assert (count == 3);
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

}
