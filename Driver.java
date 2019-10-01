import java.util.ArrayList;
import java.util.Collections;

/**
 * Lab 6
 * 
 * Driver class that creates some shapes and demonstrates how sorting is accomplished
 * through use of the defined natural ordering of shapes (compareTo in Shape) and
 * an alternate order (compare in ShapeComparator).
 * 
 * @author Stephen
 * @version 2018-10-03
 * Edited by Olivia Black on 2019-09-21
 */
public class Driver
{
    /**
     * Method used to do high-level testing of your code. You may alter this as you see fit.
     * @param args Program args.
     */
	public static void main(String[] args)
	{
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		Shape s1 = new Square("A", 4.0);
		Shape s2 = new Rectangle("B", 4.0, 1.0);
		Shape s3 = new Rectangle("A", 8.0, 2.0);
		Shape s4 = new Circle("C",3.0);
		Shape s5 = new EquilateralTriangle("D",5.0);
		
		list.add(s1);
		list.add(s2);
		list.add(s4);
		list.add(s3);
		list.add(s5);
		
		
		System.out.println("###");
		for(Shape s: list) System.out.println(s);
		
		// Sort shapes via the built-in ordering of shape:
		Collections.sort(list);
		
		System.out.println("###");
		for(Shape s: list) System.out.println(s);

		// Sort via a given comparison method:
		Collections.sort(list, new ShapeComparator());
		
		System.out.println("###");
		for(Shape s: list) System.out.println(s);
	}
}