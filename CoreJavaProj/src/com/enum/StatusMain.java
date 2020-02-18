enum Status{
	NEW(1),REJECTED(2),ACCEPTED(3),COMPLETED(4);
	int value;
	Status(int value){
		//System.out.println("Inside Constructor: " +value);
		this.value=value;
	}

	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
		switch(this) {
			
			case NEW: return "NEW "+value;
			case REJECTED: return "REJECTED "+value;
			case ACCEPTED: return "ACCEPTED "+value;
			case COMPLETED: return "COMPLETED "+value;
			default: return "Invalid status";
		}
	}

};
class Order{
	private int orderId;
	private String name;
	private int quantity;
	private int status;
	public Order(int orderId,String name,int quantity,int status){
		this.orderId=orderId;
		this.name=name;
		this.quantity=quantity;
		this.status=status;
	}

	public Status getOrderStatus(){
		switch(status){
			case 1: return Status.NEW;
			case 2: return Status.REJECTED;
			case 3: return Status.ACCEPTED;
			case 4: return Status.COMPLETED;
			default: return Status.NEW;
		}
	}
}
class StatusMain{
	public static void main(String [] args){
		Order o =new Order(1044,"Iphone",2,3);
		System.out.println(o.getOrderStatus());
		/*
		Status s=Status.NEW;
		System.out.println("NEW staus value = "+s.getValue());
		s.setValue(2);
		System.out.println("ACCEPTED VALUE = "+Status.ACCEPTED);
		System.out.println(s);
		System.out.println("NEW VALUE = "+Status.NEW);
		*/
	}
}