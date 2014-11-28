package ic.doc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPNCalc {
	
	private Model model = new Model();
	private Updatable view = new View(model);
	
	class Controller implements ActionListener {
		
		private View view;

		public Controller(View view) {
			this.view = view;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		new RPNCalc();
	}

}
