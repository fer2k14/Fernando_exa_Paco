package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Resta;

public class TestJU {
	Resta res = new Resta();
	@Before
	public void setUp() throws Exception {
		res.setA(5);
		res.setB(3);
	}

	@Test
	public void test() {
		assertEquals(2, res.resta());
	}

}
