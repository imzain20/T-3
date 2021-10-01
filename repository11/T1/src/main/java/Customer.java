
public class Customer {
	private String name;
	private String address;
	private String phno;
	private int account_no;
	
	
	public Customer() {
		
	}
	public Customer(String name, String address, String phno, int account_no)
	{
		this.name=name;
		this.address=address;
		this.phno=phno;
		this.account_no=account_no;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public void setPhoneNo(String ph_no) {
		this.phno=ph_no;
	}
	
	public void setAccountNo(int acc_no) {
		this.account_no=acc_no;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPhoneNo() {
		return this.phno;
	}
	
	public int gettAccountNo() {
		return this.account_no;
	}
	
}
