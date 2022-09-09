package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Basketball;

/**
 * @Charlie Dolphin charl - cpdolphin
 * CIS175 - Fall 2021
 * Sep 8, 2022
 */
class BasketballTest {
	
	Basketball b1 = new Basketball("Charlie", false);

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	public void test() {
		assertEquals(false, b1.Shoot());
	}
	
	@Test
	public void testNameNotNull()
	{
		assertNotNull(b1.getName());
	}

}
