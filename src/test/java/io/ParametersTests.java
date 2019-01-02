package io;

import static org.junit.Assert.*;
import org.junit.Test;

public class ParametersTests {

	private String[] args;

	@Test
	public void paramsAreSetIfValide() {
		try {
			this.args = new String[2];
			this.args[0] = "UPDATE test SET nom = --B where nom = --C";
			this.args[1] = "test.csv";
			Parameters parameters = new Parameters(args);
			assertTrue(true);
		} catch (Exception e) {
			fail();
		}
	}

}
