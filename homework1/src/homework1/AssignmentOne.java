package homework1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class AssignmentOne {

	public static void main(String[] args) {

	    File file = new File("C:\\Users\\AITUGANG\\Desktop\\homework1\\src\\homework1//file.txt");
	    shape a=new shape();
	    try {

	        Scanner sc = new Scanner(file);

	        while (sc.hasNextLine()) {
	        	point d=new point();
	        	d.setx(sc.nextDouble());
	        	d.sety(sc.nextDouble());
	        	a.addpoint(d);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    System.out.println(a.calculatePerimeter());//perimetr
	    System.out.println(a.getlong());//longest
	    System.out.println(a.getave());//average
	 }
}
