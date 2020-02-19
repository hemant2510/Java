class Account{
	private int balance;
	private String name;
	private int accId;
	
	public Account(int balance, String name, int accId){
		this.balance=balance;
		this.name=name;
		this.accId=accId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setBalance(int balance){
		this.balance=balance;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getBalance(){
		return this.balance;
	}
	
	public int getAccId(){
		 return this.accId;
	}
		
	public int withdraw(int withdraw_amount){
		this.balance=this.balance-withdraw_amount;
		return this.balance;
	}
	
	public int deposit(int deposit_amount){
		this.balance=this.balance+deposit_amount;
		return this.balance;
	}	
	
	public String toString(){
		return "Account details -> "+ this.name+", Account number ->"+this.accId+" Account balance ->"+this.balance;
	}
}

class AccountMain{
	public static void main(String []args){
		Account a=new Account(5000000,"Priyamvad",3093);
		int bal=a.withdraw(5);
		System.out.println(a);
		bal=a.deposit(2000000);
		System.out.println(a);
	}
}

	
	
	
	