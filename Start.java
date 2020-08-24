public class Start {

	public static void main(String[] args) {
		ScientificCalculator b1 = new ScientificCalculator(15.0,5.0);
		System.out.println("Addition "+b1.add());
		System.out.println("Subtraction "+b1.subtract());
		System.out.println("Multiplication "+b1.multiply());
		System.out.println("Divide "+b1.divide());
		System.out.println("toThePower "+b1.toThePow());

	}

}
