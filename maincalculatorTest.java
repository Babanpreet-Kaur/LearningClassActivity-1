package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class maincalculatorTest {

	@Test
	void test() {
		assertTrue(true);
	}
	
	@Test 
	void testadd() {
		
		float a = 2;
		float b = 3;
		
		boolean value = maincalculator.addnum(a, b);
		assertTrue(value);

	}
	
	@Test 
	
	void testsub() {
		float a = 3;
		float b = 2;
		
		boolean value = maincalculator.subnum(a, b);
		assertTrue(value);
		
	}
	
@Test 
	
	void testmul() {
		float a = 3;
		float b = 2;
		
		boolean value = maincalculator.mulnum(a, b);
		assertTrue(value);
		
	}
@Test 

void testdivide() {
	float a = 3;
	float b = 2;
	
	boolean value = maincalculator.divnum(a, b);
	assertTrue(value);
	
}
@Test 

void testexp() {
	float a = 3;
	float b = 2;
	
	boolean value = maincalculator.expnum(a, b);
	assertTrue(value);
	
}

}
