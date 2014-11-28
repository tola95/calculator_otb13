package ic.doc;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ModelTest {
	
	final Model testModel = new Model();
	
	@Test
	public void additionIsCorrect() {
		testModel.addToCalculation(5);
		testModel.addToCalculation(6);
		testModel.addToCalculation('+');
		assertThat(testModel.calculate(), is(11));
	}
	
	public void subtractionIsCorrect() {
		testModel.addToCalculation(6);
		testModel.addToCalculation(5);
		testModel.addToCalculation('-');
		assertThat(testModel.calculate(), is(1));
	}
	
	public void multiplicationIsCorrect() {
		testModel.addToCalculation(5);
		testModel.addToCalculation(6);
		testModel.addToCalculation('*');
		assertThat(testModel.calculate(), is(30));
	}
	
	public void divisionIsCorrect() {
		testModel.addToCalculation(30);
		testModel.addToCalculation(6);
		testModel.addToCalculation('/');
		assertThat(testModel.calculate(), is(5));
	}

}
