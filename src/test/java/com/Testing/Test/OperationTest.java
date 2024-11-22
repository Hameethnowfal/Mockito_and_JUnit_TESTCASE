package com.Testing.Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Testing.Test.units.Operations;

public class OperationTest {
	
	Operations op;
	
	@BeforeEach
	public void object() {
		op=new Operations();
	}
	
	@Test
	public void testAdd() {
		int result=op.add(5,10);
		assertEquals(15,result);
	}
	
	@Test
	public void testSub() {
		int result=op.sub(10, 5);
		assertEquals(5,result);
	}
	
	@Test
	public void testProd() {
		int result=op.prod(5,10);
		assertEquals(50,result);
	}
	
	@Test
	public void testDiv() {
		int result=op.div(10,5);
		assertEquals(2,result);
		
		try {
			op.div(10,0);
			org.junit.Assert.fail("Excepted ArithmeticException was not Thrown");
		}catch(ArithmeticException e) {
			System.out.println(e);
			//assertEquals("Can't divide by zero",e.getMessage());
		}
	}
}