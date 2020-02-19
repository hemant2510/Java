class Account{
	private int id;
	private String name;
	private double balance;
	
	public Account(int id,String name,double balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public String toString(){
		return this.id+" "+this.name+" "+this.balance;
	}
}

class SavingsAccount extends Account{
	private double fixedDeposit;
	
	public SavingsAccount(int id,String name,double balance,double fixedDeposit){
		super(id,name,balance);
		this.fixedDeposit=fixedDeposit;
	}
	
	public double getBalance(){
		return super.getBalance()+this.fixedDeposit;
	}
	
	public String toString(){
		return super.toString()+" "+this.fixedDeposit;
	}
}

class CurrentAccount extends Account{
	private double cashCredit;
	
	public CurrentAccount(int id,String name,double balance,double cashCredit){
		super(id,name,balance);
		this.cashCredit=cashCredit;
	}
	
	public double getBalance(){
		return super.getBalance()+this.cashCredit;
	}
	
	public String toString(){
		return super.toString()+" "+this.cashCredit;
	}
}
		
class AccountTest{
	public static double calculateBal(Account a[]){
		double totBal=0;
		for(int i=0;i<a.length;i++){
			totBal=totBal+a[i].getBalance();
		}
		return totBal;
	}
	
	public static void main(String [] args){
		Account a[]=new Account[4];
		a[0]=new SavingsAccount(1,"Hemant",50000,5000);
		a[1]=new SavingsAccount(2,"Raj",60000,6000);
		a[2]=new CurrentAccount(3,"Priyamvad",70000,7000);
		a[3]=new CurrentAccount(4,"Singh",80000,8000);
		System.out.println(calculateBal(a));
	}
}
	