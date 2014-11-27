package ic.doc;

import javax.swing.JButton;

public class MyButton extends JButton {
	
	private static final long serialVersionUID = 1L;
	private int value;
	
	public MyButton() {
		
	}

	public MyButton(String string) {
	   new JButton(string);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
}
