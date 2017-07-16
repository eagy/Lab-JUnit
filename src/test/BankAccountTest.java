package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import core.BankAccount;

public class BankAccountTest {
	private BankAccount blank;
	private BankAccount bk1, bk2, bk3, bk4;
	@Before
	public void setUp() throws Exception {
		blank = new BankAccount();
		bk1 = new BankAccount("1", "AccountType1", 25.00, 1);
		bk2 = new BankAccount("2", "AccountType2", 25.00, 2);
		bk3 = new BankAccount("3", "AccountType3", 25.00, 3);
		bk4 = new BankAccount("4", "AccountType4", 25.00, 4);
	}

	@After
	public void tearDown() throws Exception {
		bk1 = null;
		bk2 = null;
		bk3 = null;
		bk4 = null;
		blank = null;
	}

	@Test
	public void testGetInterestRateAccountType0() {
		assertEquals("Account with accountType 0 should have a 0.0 interest rate", 0.0, blank.getInterestRate(), 0);
	}

	@Test
	public void testGetInterestRateAccountType1() {
		assertEquals("Account with accountType 1 should have a 0.5 interest rate", 0.5, bk1.getInterestRate(), 0);
	}
	
	@Test
	public void testGetInterestRateAccountType2() {
		assertEquals("Account with accountType 2 should have a 4.5 interest rate", 4.5, bk2.getInterestRate(), 0);
	}

	@Test
	public void testGetInterestRateAccountType3() {
		assertEquals("Account with accountType 3 should have a 1.0 interest rate", 1.0, bk3.getInterestRate(), 0);
	}

	@Test
	public void testGetInterestRateAccountType4() {
		assertEquals("Account with accountType 4 should have a 15.0 interest rate", 15.0, bk4.getInterestRate(), 0);
	}
	
	@Test
	public void testCalculateTotalBalanceAccountType0() {
		assertEquals("Account with accountType 0 with a balance of $0.00 should have a total with interest of $0.00", 0.00, blank.calculateTotalBalance(), 0);
	}
	
	@Test
	public void testCalculateTotalBalanceAccountType1() {
		assertEquals("Account with accountType 0 with a balance of $0.00 should have a total with interest of $0.00", 0.00, blank.calculateTotalBalance(), 0);
	}
}
