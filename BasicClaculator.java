import java.lang.*;
public abstract class BasicClaculator implements Calculation {
	double value1;
	double value2;
	BasicClaculator(){}
	BasicClaculator(double v1,double v2){
		this.value1 = v1;
		this.value2 = v2;
		}
	
	public void setValue1(double v1){
		this.value1 = v1;}
	public void setValue2(double v2){
		this.value2 = v2;}
	public double getValue1()
	{
		return value1;}
	public double getValue2()
	{
		return value1;}
	
}
