/**
 * Generic Triangle base class.
 * 
 * @author Stephen
 * @version 2018-10-03
 */
public abstract class Triangle extends Polygon
{
    /**
     * The triangle constructor. Add the sides to the sideLengths arraylist.
     * 
     * @param id The created shape's name id.
     * @param s1 The first side length of the triangle.
     * @param s2 The first side length of the triangle.
     * @param s3 The first side length of the triangle.
     */
    public Triangle(String id, double s1, double s2, double s3)
    {
    	// TODO: implement this.
    	super(id);
    	sideLengths.add(s1);
    	sideLengths.add(s2);
    	sideLengths.add(s3);
    }
}
