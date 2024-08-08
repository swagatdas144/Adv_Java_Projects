package com.nt.test;
import com.nt.service.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	@Test
	public void testwithpositive() {
		Arithmatic ar=new Arithmatic();
		float expected=30.0f;
		float actual=ar.sum(10.0f, 20.0f);
		assertEquals(expected, actual);
	}
	@Test
	public void testwithnegative() {
		Arithmatic ar=new Arithmatic();
		float expected=-30.0f;
		float actual=ar.sum(-10.0f, -20.0f);
		assertEquals(expected,actual);
	}
	@Test
	public void testwithmixvalues() {
		Arithmatic ar=new Arithmatic();
		float expected=-10.0f;
		float actual=ar.sum(10.0f, -20.0f);
		assertEquals(expected,actual);
	}

}

