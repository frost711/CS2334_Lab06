import java.util.ArrayList;

/**
 * Abstract shape class to define a polygon.
 * 
 * @author Stephen
 * @version 2018-10-03
 */
public abstract class Polygon extends Shape
{
    /**
     * A list of the lengths of the sides of the polygons.
     */
    protected ArrayList<Double> sideLengths;
    
    /**
     * Initializes the sideLengths arraylist and sets the Shape's ID.
     * 
     * @param id The created shape's name id.
     */
    public Polygon(String id)
    {
        // TODO: implement this.
    	// DONE
    	super(id);
    	sideLengths = new ArrayList<Double>();
    	// this.sideLengths = sideLengths;
    }
    
    /**
     * Calcaulates the perimeter of a polygon. That is, the sum of its side lengths.
     * 
     * @return The perimeter of the polygon.
     */
    public double getPerimeter()
    {
        // TODO: implement this.
    	// use a for loop to sum all of the sides together
    	double perimeter = 0;
    	for (int i = 0; i < sideLengths.size(); i++) {
    		perimeter += sideLengths.get(i);
    	}
    	return perimeter;
    }
}
