package homework1;
import java.util.ArrayList;
public class shape {
	private ArrayList<point> abc;
	public shape() {
		this.abc =new ArrayList<point>();
	}
	public point get(int i) {
		return abc.get(i);
	}
	public void addpoint(point a) {
		this.abc.add(a);
	}
	public void getpoints() {
		for(int i=0;i<abc.size();i++) {
			 System.out.println(abc.get(i).getx()+' '+abc.get(i).gety());
		}
	}
	public double  calculatePerimeter() {
		double x=abc.get(0).distance(abc.get(abc.size()-1));
		for(int i=1;i<abc.size();i++) {
			x+=abc.get(i-1).distance(abc.get(i));
		}
		return x;
	}
	public double getlong() {
		double x=abc.get(0).distance(abc.get(abc.size()-1));
		for(int i=1;i<abc.size();i++) {
			Math.max(x,abc.get(i-1).distance(abc.get(i)));
		}
		return x;
	}
	public double getave() {
		double x=abc.get(0).distance(abc.get(abc.size()-1));
		for(int i=1;i<abc.size();i++) {
			x+=abc.get(i-1).distance(abc.get(i));
		}
		x/=abc.size();
		return x;
	}
}
