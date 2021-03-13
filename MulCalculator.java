public class MulCalculator extends Calculator{

	protected boolean resolve(Numbers numbers) {	
		if("mul".equals(numbers.getOperand())) {
			return true;
		} else {
			return false;
		}
	}
}
