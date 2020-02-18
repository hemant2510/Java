package com.annotations;
import java.lang.annotation.Retention; 
import java.lang.annotation.RetentionPolicy; 
import java.lang.reflect.Method; 
import java.lang.annotation.Annotation; 
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.*;
import java.lang.Class;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface Getter{
}

class Sample{
	private String names="Priyam";
	private int age=22;

	@Getter
	public String getNames(){
		return this.names;
	}

	@Getter
	public int getge(){
		return this.age;
	}
	@Getter
	public String fx(){
		return "iter";
	}

	public static void main(String [] args) throws Exception{
		Class c=Class.forName("com.annotations.Sample");
		Method m[]=c.getDeclaredMethods();
		Field f[]=c.getDeclaredFields();
		int flag=0,flag1=0;
		String s="";
		for(int i=0;i<m.length;i++){
			Method myMethod=m[i];
			if(myMethod.isAnnotationPresent(Getter.class)){
				s=myMethod.getName();
				//System.out.println(s);
				if(s.startsWith("get")){
					flag1=1;
					String s1=s.substring(3);
					s1=s1.toLowerCase();
					//System.out.println(s1);
					for(Field f1:f){
						flag=0;
						//System.out.println(f1.getName());
						if(f1.getName().equals(s1)){
							flag=1;
							//System.out.println("Yes");
							break;
						}
					}

					if(flag==0){
						System.out.println(s+"() is not a getter method.");
					}

				}

				else
					System.out.println(s+" () is not a getter method");
			}
		}
	}
}