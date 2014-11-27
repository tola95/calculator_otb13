package ic.doc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class View implements Updatable {
	
	private final int NUMBER_OF_INTS = 10;
	private List<JButton> numButtons = new ArrayList<JButton>();
	private List<JButton> operButtons = new ArrayList<JButton>();
	private final JTextField textField = new JTextField(10);
	private Model model;
	
	public View( Model model ) {
		this.model = model;
		
		JFrame frame = new JFrame("RPN Calculator B)");
		frame.setSize(500,500);
		
		setButtons();
		setActionListenersForButtons();
		
		JPanel panel = new JPanel();
		panel.add(textField);
		addButtonsToJPanel(panel);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		}
		
	private void setButtons() {
		for (Integer i=0; i<NUMBER_OF_INTS; i++) {
			MyButton button = new MyButton(i.toString());
			button.setValue(i);
			numButtons.add(new JButton(i.toString()));
		}
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton mult = new JButton("*");
		JButton div = new JButton("/");
		
		operButtons.add(plus);
		operButtons.add(minus);
		operButtons.add(mult);
		operButtons.add(div);
		
	}
	
	private void setActionListenersForButtons() {
		for (final JButton button : numButtons) {
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(button.getText());
					int param = Integer.parseInt(button.getText());
					model.addToCalculation(param);
					update();
				}
			});;
		}
		
		for (final JButton button : operButtons) {
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(button.getText());
					char oper = button.getText().charAt(0);
					model.addToCalculation(oper);
					update();
				}
			});;
		}
	}
	
	private void addButtonsToJPanel(JPanel panel) {
		for (JButton button : numButtons) {
			panel.add(button);
		}
		
		for (JButton button : operButtons) {
			panel.add(button);
		}
	}

	@Override
	public void update() {
		if (model.timeToCalculate()) {
			int ans = model.calculate();
			textField.setText(Integer.toString(ans));
		}
		
	}
	

}
