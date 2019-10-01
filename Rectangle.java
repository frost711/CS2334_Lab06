/**
 * Lab 6
 * 
 * Class representing a Rectangle.
 * 
 * @author Stephen
 * @version 2018-10-03
 */
public class Rectangle extends Polygon
{
    /**
     * Height of the rectangle. Two sides have this length.
     */
    private double height;
    
    /**
     * Width of the rectangle. Two sides have this length.
     */
    private double width;
    
    /**
     * The rectangle constructor. Store the width and height and adds both twice to the sideLengths array.
     * 
     * @param id The created shape's name id.
     * @param height The height of the rectangle.
     * @param width The width of the rectangle.
     */
	public Rectangle(String id, double height, double width)
	{
		super(id);
		this.height = height;
		this.width = width;
        sideLengths.add(height);
        sideLengths.add(width);
        sideLengths.add(height);
        sideLengths.add(width);
	}
	
	/**
	 * Calculates the area of a rectangle.
	 * 
	 * @return The area of the rectangle (height * width).
	 */
	@Override
	public double getArea()
	{
	    // TODO: implement this.
		double area = sideLengths.get(0) * sideLengths.get(1);
		return area;
		
	}
	
	/**
	 * Gets the type of the shape.
	 * 
	 * @return The string "Rectangle"
	 */
	@Override
	public String getShapeType()
	{
	    // TODO: implement this.
		return "Rectangle";
	}
}
