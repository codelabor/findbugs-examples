package org.codelabor.example.findbugs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <h1>ICAST_IDIV_CAST_TO_DOUBLE</h1>
 * <p>
 * This code casts the result of an integral division (e.g., int or long division) operation to double or float. Doing division on integers truncates the result
 * to the integer value closest to zero. The fact that the result was cast to double suggests that this precision should have been retained. What was probably
 * meant was to cast one or both of the operands to double before performing the division. Here is an example:
 * </p>
 *
 * <pre>
 * int x = 2;
 * int y = 5;
 * // Wrong: yields result 0.0
 * double value1 = x / y;
 *
 * // Right: yields result 0.4
 * double value2 = x / (double) y;
 * </pre>
 *
 * @author Shin Sang-jae
 *
 */
public class IcastIdivCastToDoubleTest {

	private static final Logger logger = LoggerFactory.getLogger(IcastIdivCastToDoubleTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRight1() {
		int x = 2;
		int y = 5;
		double value1 = (double) x / y;
		logger.debug("value1: {}", value1);
	}

	@Test
	public void testRight2() {
		int x = 2;
		int y = 5;
		double value1 = x / (double) y;
		logger.debug("value1: {}", value1);
	}

	@Test
	public void testWrong() {
		int x = 2;
		int y = 5;
		double value1 = x / y;
		logger.debug("value1: {}", value1);
	}

}
