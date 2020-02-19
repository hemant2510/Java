abstract class Shape{
	abstract void draw();
}	

class Line extends Shape{
	public void draw(){
		System.out.println("Line is drawn");
	}
}

class Rectangle extends Shape{
	public void draw(){
		System.out.println("Rectangle is drawn");
	}
}

class Cube extends Shape{
	public void draw(){
		System.out.println("Cube is drawn");
	}
}

class Abstract{
	
	public static void main(String []args){
		Shape s[]=new Shape[3];
		s[0]=new Line();
		s[1]=new Rectangle();
		s[2]=new Cube();
		for(int i=0;i<s.length;i++){
			s[i].draw();
		}
	}
}