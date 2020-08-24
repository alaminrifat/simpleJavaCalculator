import java.lang.*;
public class ScientificCalculator extends BasicClaculator implements ScientificCalculation {
	ScientificCalculator(){
		
	}
	ScientificCalculator(double v1,double v2){
		super(v1,v2);
	}
	
	public double toThePow() {	
		double result = StrictMath.pow(getValue1(),getValue2());
		return result;
	}
	public double add() {
		return value1+value2;
	}
	
	public double subtract() {
		return value1-value2;
	}
	
	public double multiply() {
		return value1*value2;
	}
	
	public double divide() {
		return value1/value2;
	}
	
	
}
