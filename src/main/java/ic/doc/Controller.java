package ic.doc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class Controller implements ActionListener {
	
	private View view;
	private JButton button;

	public Controller(View view, JButton button) {
		this.view = view;
		this.button = button;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (view.getNumButtons().contains(button)) {
			view.getTextField().setText(button.getText());
			int param = Integer.parseInt(button.getText());
			view.getModel().addToCalculation(param);
			view.update();		
	    }
		
		if (view.getOperButtons().contains(button)) {
			view.getTextField().setText(button.getText());
			char oper = button.getText().charAt(0);
			view.getModel().addToCalculation(oper);						
			view.update();
        }
		
	}	
	
}