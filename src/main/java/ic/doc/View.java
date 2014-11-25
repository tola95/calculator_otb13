package ic.doc;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class View implements Updatable {
	
	private final int NUMBER_OF_INTS = 10;
	private List<JButton> buttons = new ArrayList<JButton>();
	private final JTextField textField = new JTextField(10);
	
	public View(ActionListener controller) {
		JFrame frame = new JFrame("RPN Calculator B)");
		frame.setSize(300,200);
		
		setButtons();
		setActionListenersForButtons(controller);
		
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
	
	private void setActionListenersForButtons(ActionListener controller) {
		for (JButton button : buttons) {
			button.addActionListener(controller);
		}
	}
	
	private void addButtonsToJPanel(JPanel panel) {
		for (JButton button : buttons) {
			panel.add(button);
		}
	}

	@Override
	public void update(Model model) {
//		if (buttons.get(0).)
		
	}

}
