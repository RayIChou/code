package fivechess;

public class Point {
	private int x,y;
	boolean valid = true ;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	Point (){}
	

}
