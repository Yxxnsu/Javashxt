public class Numbers {
	
	private int num1;
	private int num2;
	private String operands;
	private int result;
	
	public Numbers(int newNum1, int newNum2, String op) {
		
		num1 = newNum1;
		num2 = newNum2;
		operands = op;
		/// 이게 문제인가..?
		
	}
	
	System.out.println(operands);
	
	public int getNumber1() {return num1;}
	public int getNumber2() {return num2;}
	public String getOperand() {return operands;}
	
	public void hpfunc1(String operand) {
		switch(operand) {
		case "add":
			System.out.print("Addition");
			break;
		case "sub":
			System.out.print("Subtraction");
			break;
		case "mul":
			System.out.print("Multiplication");
			break;
		case "div":
			System.out.print("Division");
			break;
		default:
			break;
		}
	}

	public int hpfunc2(int num1, int num2, String operand1) {
	
	///여기 함수에서 넣어줬는데
		
		int result = 0;
		
		switch(operand1) {
			
			case "add":
				result = num1 + num2;
				break;
			case "sub":
				result = num1 - num2;
				break;
			case "mul":
				result = num1 * num2;
				break;
			case "div":
				result = num1 / num2;
				break;
			default:
				break;
		}
		
		return result;
		
	}
	
	int result = hpfunc2(num1,num2,operands);
	/// 여기에서 계속 oprands가 null 이라는데 왜 null 이라는거야??
	
	
	public String toString() {
        return num1 + " " + num2 + " " + "= " + result;
    }
	
	
}
