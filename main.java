import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Calculator add = new AddCalculator();
		Calculator sub = new SubCalculator();
		Calculator mul = new MulCalculator();
		Calculator div = new DivCalculator();
		
		add.setNextCalculator(sub).setNextCalculator(mul).setNextCalculator(div);
			
		int cnt = 1,num1,num2;
		String operand = "";
		
		while(true) {
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Calculation: " + cnt++);
			System.out.print("Enter Operation Name: ");
			operand = keyboard.next();
			System.out.print("Enter the First Operand: ");
			num1 = keyboard.nextInt();
			System.out.print("Enter the Second Operand: ");
			num2 = keyboard.nextInt();
		
			add.calculate(new Numbers(num1,num2,operand));
			
			System.out.println("================================");
		}
		
	}
	
}
