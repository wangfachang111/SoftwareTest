package junit_math3_test;

import org.apache.commons.math3.stat.descriptive.summary.Sum;
import junit.framework.TestCase;

public class Evaluate2Test extends TestCase {
	double[] array = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
	double[] weight = {0.1, 0.2, 0.05, 0.1, 0, 0.05, 0.3,0.15,0.05};
	Sum sum = new Sum();
	
	public void testEvaluate2() {
		assertEquals(5.61,sum.evaluate(array, weight, 0, array.length));
	}
}
