package Point;


public class Point {
double x,y,z;
public Point(double x,double y,double z){
	this.x=x;
	this.y=y;
	this.z=z;
}
public double getDistance(Point p){
	return Math.sqrt((x-p.x)*(x-p.x)+(y-p.x)*(y-p.x)+(z-p.x)*(z-p.x));
}


	public static void main(String[] args){
	Point p = new Point(5.0,6.0,7.8);
	Point origin = new Point(0.0,0.0,0.0);
	System.out.print(p.getDistance(origin));
	}
}

