package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Basketball;

/**
 * @Charlie Dolphin charl - cpdolphin
 * CIS175 - Fall 2021
 * Sep 8, 2022
 */
class BasketballTest2 {
	
	Basketball b2 = new Basketball("Billybob", true);

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testOpen()
	{
		boolean open = true;
		assertTrue(open == b2.isOpen());
	}

}
