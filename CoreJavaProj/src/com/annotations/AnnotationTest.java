@Retention(RetentionPolicy.COMPILETIME)
@Target({ElementType.METHOD})
public @interface Getter{
}

class Sample{
	private String name="Priyam";
	private int age=22;

	@Getter
	public String getName(){
		return this.name;
	}

	@Getter
	public int getAge(){
		return this.age;
	}

	public static void main(String [] args){
		Class c=Class.forName("Sample");
		Annotation a[]=c.getDeclaredAnnotations();
		for(Annotation p:a)
			system.out.println(p);
	}
}