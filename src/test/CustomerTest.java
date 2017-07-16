/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import core.Customer;

/**
 * @author Daniel Eagy
 *
 */
public class CustomerTest {
	private Customer cust;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cust = new Customer("Daniel Eagy", "1234 W Test St", "Phoenix", "AZ", "85007", 28);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		cust = null;
	}

	/**
	 * Test method for {@link core.Customer#displayAddress()}.
	 */
	@Test
	public void testDisplayAddress() {
		String temp = "1234 W Test St,\nPhoenix, AZ 85007";
		assertEquals("Address should be displayed as:"
				+ "\n1234 W Test St,"
				+ "\nPhoenix, AZ 85007", temp, cust.displayAddress());
	}

	/**
	 * Test method for {@link core.Customer#displayAddressLabel()}.
	 */
	@Test
	public void testDisplayAddressLabel() {
		String temp = "Daniel Eagy\n1234 W Test St,\nPhoenix, AZ 85007";
		assertEquals("Address should be displayed as:"
				+ "\nDaniel Eagy"
				+ "\n1234 W Test St,"
				+ "\nPhoenix, AZ 85007", temp, cust.displayAddressLabel());
	}

}
