package junit_math3_test;

import org.apache.commons.math3.stat.descriptive.summary.Sum;
import junit.framework.TestCase;

public class IncrementTest extends TestCase {
	Sum sum = new Sum();
	
	public void testIncrement() {
		sum.increment(10.0);
		assertEquals(10.0,sum.getResult());
	}
}
