
public class Account extends Customer {
	private int balance;
	//private String created_date;
	
	public Account()
	{}
	
	public Account(String name, String address, String phno, int account_no, int bal)
	{
		super(name,address,phno,account_no);
		this.balance=bal;
		//this.created_date=created_date;
	//	System.out.println("Account created on ");
	//	System.out.println(java.time.LocalDate.now());
	}
	/*
	public void CreateCustomer()
	{
		//Customer c2=new Customer("Zain","C-195","03303511511","001");
		
	}
	*/
	public void setBalance(int bal) {
		this.balance=bal;
	}
	/*
	public void setAccountNo(int acc_no) {
		this.account_no=acc_no;
	}*/
	/*
	public void setDate(String date) {
		this.created_date=date;
	}
	*/
	public int getBalance() {
		return this.balance;
	}
	/*
	public int getAccountNo() {
		return this.account_no;
	}*/
	
	/*
	public void checkBalance() {
		//System.out.println("Name " + this.name);
		System.out.println("Your balance is " + this.balance);
	}
	*/
	public String printStatement() {
		String s= this.getName() + this.getAddress() + this.getPhoneNo() + this.gettAccountNo() + this.getBalance();
		return s;
	}
	
	public int makeDeposit(int amount) {
		this.balance=balance+amount;
		return this.balance;
	}
	
	public int makeWithdrawal(int amount) {
		//Type of account needed to be checked
		this.balance=balance-amount;
		//this.setBalance(balance);
		return this.balance;
	}
	/*
	public void transferAmount(int amount) {
		this.balance=balance-amount;
	}
	*/
	public int calculateZakat( String account_type) {
	//Type of account needed to be checked (only savings account)
		double zakat=0;
		if(this.balance>20000 & account_type=="Savings")
		{
		
		zakat=this.balance*(2.5/100);
		this.balance=(int) (this.balance-zakat);
		
		}
		return (int)zakat;
	}
	
	public int AllDeductions(String account_type)
	{
		
		if(account_type=="Current")
		{
			double fees=0;
			fees=this.balance*(0.04); //4%
			return (int)fees;
		}
		
		if(account_type=="Savings")
		{
			double zakat=0;
			zakat=this.balance*(2.5/100);
			return (int)zakat;
		}
		
		
		return 0;
	}

	public int transactionFees(int nooftransaction, boolean month) {
		//checking month (boolean) if 1 month has been exceeded or not
		if(nooftransaction>2 & month==false)
		{
			this.balance=this.balance-10;
		}
		 
		return this.balance;
	}
	
	
	public int calculateInterest(String account_type)
	{
		if (account_type=="Savings")
		{
			int checkamount=0;
			checkamount=this.balance*16/100;
			this.balance+=checkamount;
		}
		return this.balance;
	}
	
	
}
