public class MyCircle {
	public int x;
	public int y;
	public int radius;

	public MyCircle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public MyCircle(MyPoint center, int radius) {
		this.x = center.x;
		this.y = center.y;
		this.radius = radius;
	}
	
	public int getRadius() { return this.radius; }
	public MyPoint getCenter() { return new MyPoint(this.x, this.y); }
	public int getCenterX() { return this.x; }
	public int getCenterY() { return this.y; }

	public void setRadius(int radius) { this.radius = radius; }
	public void setCenter(MyPoint center) {
		this.x = center.x;
		this.y = center.y;
	}

	public void setCenterXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Circle @ (" + this.x + "," + this.y + ") radius=" + this.radius + "; area=" + getArea();
	}

	public double getArea() {
		double pi = 3.14159265;
		return pi * this.radius * this.radius;
	}
}
