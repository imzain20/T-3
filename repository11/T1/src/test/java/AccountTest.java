import static org.junit.Assert.*;

import org.junit.*;
import static org.junit.Assert.*;

public class AccountTest {

	Account atest = new Account("zain", "c111", "090178601", 1, 1000);
	@Before
	public void BeforeTest() {
		//set balance amount
		atest.setBalance(25000);
	}
	
	@Test
	public void test() {
		int amount_check = atest.makeWithdrawal(1400);
		assertEquals(23600,amount_check);
	
	}
	
	@Test
	public void test2() {
		
		int amount_check = atest.makeWithdrawal(0);
		assertEquals(25000,amount_check);
	
	}
	
	@Test
	public void test3() {
		int amount_deposit = atest.makeDeposit(15000);
		assertEquals(40000,amount_deposit);
	}
	
	@Test
	public void test4() {
		int amount_deposit = atest.makeDeposit(0);
		assertEquals(25000,amount_deposit);
	}

	@Test
	public void test5() {
		int zakat_amount = atest.calculateZakat("Savings");
		assertEquals(625,zakat_amount);		//balance after zakat deduction
	}
	
	@Test
	public void test6() {
		int zakat_amount = atest.calculateZakat("Current");
		assertEquals(0,zakat_amount);		//balance after no zakat deduction
	}
	
	@Test
	public void test7() {
		int transaction_fees= atest.transactionFees(3, false);
		assertEquals(24990,transaction_fees);	//fee deduction because of transaction limit has been exceeded.
	}

	@Test
	public void test8() {
		int transaction_fees= atest.transactionFees(2, true);
		assertEquals(25000,transaction_fees);	//no fee deduction as only 2 transactions have been done and 1 month has been exceeded.
	}
	
	@Test
	public void test9() {
		int interest= atest.calculateInterest("Savings");
		assertEquals(29000,interest);	
	}
	
	@Test
	public void test10() {
		int interest= atest.calculateInterest("Current");
		assertEquals(25000,interest);	//no increase in balance due to current account
	}
	
	@Test
	public void test11() {
		int interest= atest.AllDeductions("Current");
		assertEquals(1000,interest);	
	}
	
	@Test
	public void test12() {
		int interest= atest.AllDeductions("Savings");
		assertEquals(625,interest);	
	}
	
	@Test
	public void test13() {
		String s1 = atest.printStatement();
		assertEquals("zainc111090178601125000",s1);	 //details of account
	}
}
