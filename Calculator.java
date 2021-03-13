public abstract class Calculator {
	
	public Calculator() {};
	
    private Calculator next;
    
    public Calculator setNextCalculator(Calculator next){
        this.next = next;
        return next;
    }
    public final void calculate(Numbers numbers) {
        if (resolve(numbers)) {
            done(numbers);
        } else if (next != null) {
        	numbers.hpfunc1(numbers.getOperand());
        	System.out.println(" server passing " + numbers.getOperand() + 
        			"operator to the next server.");
        	next.calculate(numbers);
        } 
    }
 
    protected abstract boolean resolve(Numbers numbers);
    
    protected void done(Numbers numbers) {
    	numbers.hpfunc1(numbers.getOperand());
    	System.out.println(" Server Working...");
        System.out.println(numbers);
        numbers.hpfunc1(numbers.getOperand());
        System.out.println(" Provided");
    }


}
