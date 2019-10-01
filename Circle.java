/**
 * Lab 6
 * 
 * Class representing a circle.
 * 
 * @author Stephen
 * @version 2018-10-03
 */
public class Circle extends Shape
{
    /**
     * The radius of the circle.
     */
	private double radius;
	
	/**
	 * Circle constructor. Although super() would be called automatically, we make an
	 * explicit call to super() here. As Shape is the superclass of Circle, this calls
	 * the Shape() constructor. This means that when the Circle() constructor is called,
	 * the Shape() constructor is also called, and the Circle is assigned an id.
	 * 
	 * @param id The shape's name identifier, as defined in Shape.java.
	 * @param radius The radius of the circle.
	 */
	public Circle(String id, double radius)
	{
		super(id);
		this.radius = radius;
	}
	
	/**
	 * Gets the area of the circle.
	 * 
	 * @return pi*(radius^2)
	 */
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	/**
	 * Gets the circumference (perimeter) of the circle.
	 * 
	 * @return 2*pi*radius
	 */
	public double getPerimeter()
	{
		return 2.0 * Math.PI * radius;
	}
	
	/**
	 * Gets the type of the shape.
	 * 
	 * @return The string "Circle"
	 */
	public String getShapeType()
	{
		return "Circle";
	}
}
