public class AddCalculator extends Calculator{
	
	protected boolean resolve(Numbers numbers) {	
		if("add".equals(numbers.getOperand())){
			return true;
		} else {
			return false;
		}
	}
}
