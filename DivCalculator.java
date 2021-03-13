public class DivCalculator extends Calculator{

	protected boolean resolve(Numbers numbers) {	
		if("div".equals(numbers.getOperand())) {
			return true;
		} else {
			return false;
		}
	}
}
