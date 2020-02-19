class Banner{
	public static void main(String [] args) throws InterruptedException{
		StringBuilder sb=new StringBuilder("Welcome to Java");
		for (;;){
			Thread.sleep(500);
			System.out.print(sb+"\r");
			String s=sb.charAt(sb.length()-1)+(sb.substring(0,sb.length()-1));
			sb=sb.delete(0,s.length());
			sb=sb.append(s);
		}
	}
}