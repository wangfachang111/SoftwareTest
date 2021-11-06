package math3_test;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
public class Main {
	public static void main(String[] args) {
		double[] array = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
		double[] weight = {0.1, 0.2, 0.05, 0.1, 0, 0.05, 0.3,0.15,0.05};
		Sum sum = new Sum();
		Sum sum2 = new Sum();
		Sum sum3 = new Sum();
		//test Sum.evaluate()
		if(sum.evaluate(array,0,array.length)!=49.5)
			System.out.println("evaluate error!");
		else System.out.println("evaluate pass!");
		
		//test Sum.increment()
		sum2.increment(10);
		if(sum2.getResult() != 10)
			System.out.println("increment error!");
		else System.out.println("evaluate pass!");
		
		//test override Sum.evaluate()
		double result = sum3.evaluate(array, weight, 0, array.length);
		if(result != 5.61)
			System.out.println("evaluate2 error!");
		else System.out.println("evaluate2 pass!");
	}
	
}
