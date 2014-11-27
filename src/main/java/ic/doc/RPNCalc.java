package ic.doc;


public class RPNCalc {
	
	private Model model = new Model();
	@SuppressWarnings("unused")
	private Updatable view = new View(model);
	
	public static void main(String[] args) {
		new RPNCalc();
	}

}
