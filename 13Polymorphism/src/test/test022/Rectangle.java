package test.test022;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super("�簢��");
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}

}
