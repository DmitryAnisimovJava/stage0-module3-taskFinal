package lang.print.gaps.finalModuleTask;import static java.lang.Math.incrementExact;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
    	int sum = 0;
    	for (int i = 0; number > 0; i++) {
			sum = sum + (number % 10);
			number = number / 10;
		}
    	System.out.println(sum);
    }
    public static void main(String[] args) {
		DigitsSumCalculator calculator = new DigitsSumCalculator();
		calculator.calculateSum(100000);
	}
}
