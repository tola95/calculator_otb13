package ic.doc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class View implements Updatable {
	
	private final int NUMBER_OF_INTS = 10;
	private List<JButton> buttons = new ArrayList<JButton>();
	private final JTextField textField = new JTextField(10);
	private Model model;
	
	public View(ActionListener controller, Model model) {
		this.model = model;
		
		JFrame frame = new JFrame("RPN Calculator B)");
		frame.setSize(300,200);
		
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
			buttons.add(new JButton(i.toString()));
		}
		
		buttons.add(new JButton("+"));
		buttons.add(new JButton("-"));
		buttons.add(new JButton("*"));
		buttons.add(new JButton("/"));
		
	}
	
	private void setActionListenersForButtons() {
		for (final JButton button : buttons) {
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(button.getName());
//					model.addToCalculation(button.getName());
				}
			});;
		}
	}
	
	private void addButtonsToJPanel(JPanel panel) {
		for (JButton button : buttons) {
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
