package junit_math3_test;

import org.apache.commons.math3.stat.descriptive.summary.Sum;
import junit.framework.TestCase;

public class EvaluateTest extends TestCase {
	Sum sum = new Sum();
	double[] array = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
	
	public void testEvaluate() {
		assertEquals(49.6,sum.evaluate(array, 0, array.length));
	}
	
}
