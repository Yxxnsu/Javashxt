public class SubCalculator extends Calculator{

	protected boolean resolve(Numbers numbers) {	
		if("sub".equals(numbers.getOperand())) {
			return true;
		} else {
			return false;
		}
	}
}
