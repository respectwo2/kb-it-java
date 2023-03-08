package java0308;

public class Circle extends Shape {
	private int r;

	public Circle(int x1, int y1, int r) {
		super(x1, y1);
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return super.toString()+", r=" + r;
	}
	
	

}

