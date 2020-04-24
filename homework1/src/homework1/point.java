package homework1;

import java.awt.Point;

public class point {
	private double x;
	private double y;
	public point(){
		this.x=0;
		this.y=0;
	}
	public double getx() {
		return x;
	}
	public double gety() {
		return y;
	}
	public void setx(double a) {
		this.x=a;
	}
	public void sety(double a) {
		this.y=a;
	}
	public double distance(point a) {
		return Math.sqrt((x-a.getx())*(x-a.getx())+(y-a.gety())*(y-a.gety()));
	}
}
