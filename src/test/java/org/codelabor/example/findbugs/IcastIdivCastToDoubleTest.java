package org.codelabor.example.findbugs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
