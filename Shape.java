/**
 * Lab 6
 * 
 * Class representing a shape.
 * 
 * @author Stephen
 * @version 2018-10-03
 */
public abstract class Shape implements Comparable<Shape>
{	
    /**
     * A name identifier for a shape. Not enforced to be unique.
     */
    private String id;
    
    
    /**
     * Shape constructor. Sets the name id.
     * 
     * @param id The created shape's name id.
     */
    public Shape(String id)
    {
        this.id = id;
    }
    
    // TODO: declare abstract methods.
    public abstract double getArea();
    
    public abstract double getPerimeter(); 
    
    public abstract String getShapeType();
	
	/**
	 * Implementation of the compareTo method derived from "implements Comparable<Shape>"
	 * The Comparable interface is used to define the "natural ordering" of classes. That is,
	 * the default way to sort objects of a class. If we want to sort a list of shapes, Java has
	 * no way to know inherently if one shape should come before or after another shape. Thus, we use
	 * Comparable to tell Java how to sort a list.
	 * 
	 * Comparable just provides a default way to sort objects. Most methods that attempt to sort or order
	 * any collection of objects will use objects implementing the comparable interface (e.g. Collections.sort()).
	 * It is possible to define other ordering or provide a way to compare objects without the comparable
	 * interface as well. This is demonstrated with the ShapeComparator, which defines an alternate ordering
	 * for shapes. You will notice that the driver sorts a list of shapes with both:
	 * (a) The Shape class's "Natural Order". i.e. it's compareTo method.
	 *     Collections.sort(list);
	 * (b) An alternate order, as defined by the shapeComparator class.
	 *     Collections.sort(list, new ShapeComparator());
	 * 
	 * For this compareTo, we compare area and perimeter to determine how to sort, but in general any property
	 * of the object could be used. By convention, when comparing two objects, a comparison
	 * should return -1 if the first object in the comparison should come before the second object
	 * in a sorted list, 0 if they are effectively equal, and 1 if the first object should
	 * come after the second object in a sorted list. A comparison may sort elements in ascending
	 * order, but may be defined to sort data in any way.
	 * 
	 * This compareTo orders shapes by area and perimeter. If a shape has a larger perimeter, it should
	 * be ordered to come after the shape it is compared to in a sorted list. If the areas are equal,
	 * the shape with the smaller area comes first. A list of shapes is thus sorted in ascending
	 * order of perimeter/area when using Shape's compareTo.
	 * 
     * E.g. we have the shapes A, B, and C. A has a larger perimeter than B and an equal perimeter to C.
     * A also has a smaller area than C.
     *  A.compareTo(B) yields 1 to indicate that it should come after B in a sorted list. This is because
     *  we define that shapes with larger perimeters (A) should be placed after shapes with smaller perimeters (B).
     *  A.compareTo(C) yields -1 to indicate that it should come before C in a sorted list. This is because
     *  the perimeters are equal, but we define that shapes with larger areas (A) should be placed after
     *  shapes with smaller areas (C).
     * Thus, when using compareTo to sort, a list will be sorted as such:
     * 
     * B C A
	 * 
	 * @return -1, 0, or 1. These values are returned on the following conditions:
	 *     (this refers to this Shape object, and s refers to the input parameter Shape s)
	 *     (1) Perimeter of this is > perimeter of s: return 1 (this should come after s in a sorted list)
	 *     (2) Perimeter of this is < perimeter of s: return -1 (this should come before s in a sorted list)
	 *     (3) Perimeter of this = perimeter of s:
	 *         (a) Area of this is > area of s: return 1 (this should come after s in a sorted list)
	 *         (b) Area of this is < area of s: return -1 (this should come before s in a sorted list)
	 *         (C) Area of this = area of s: return 0 (this is effecitively equal to s in a sorted list)
	 */
	@Override
	public int compareTo(Shape s)
	{
	    // TODO: implement this.
		if (this.getPerimeter() > s.getPerimeter())
		{
			return 1;
		}
		else if (this.getPerimeter() < s.getPerimeter())
		{
			return -1;
		}
		else
		{
			if (this.getArea() > s.getArea())
			{
				return 1;
			}
			else if (this.getArea() < s.getArea()) 
			{
				return -1;
			}
			else 
			{
				return 0;
			}
		}

		
	}
	
	/**
	 * Gets the shape's id.
	 * 
	 * @return The name id of the shape.
	 */
	public String getId()
	{
	    return id;
	}
	
	/**
	 * toString override. Gives information about the shape. You will need to use the
	 * methods getShapeType(), getArea(), and getPerimeter() to complete the output string.
	 * Note that these are abstract methods in Shape and are thus not implemented here. Instead,
	 * when you call getShapeType() in this method, it will use the getShapeType() method as
	 * implemented in the non-abstract shape that the toString() is called on.
	 * 
	 * E.g. you call toString() on a Square. The Square does not have its own toString, so it looks
	 * for a toString of one of its superclasses. Shape is the first superclass of Square that has
	 * a toString, so the toString of Shape is used. getShapeType() is overriden and implemented in Square,
	 * so the Shape toString() uses the getShapeType() as defined in Square, which should return the
	 * String "Square".
	 * 
	 * @return A String describing the Shape. The returned string is of the format:
	 * "<<shapetype>>\t ID = <<id>>\t area = <<area rounded to 3 decimals>>\t perimeter = <<perimeter rounded to 3 decimals>>"
	 * Where <<x>> should be replaced with the value of x described inside the angle brackets.
	 * \t is the tab character.
	 */
	@Override
	public String toString()
	{
	    // TODO: implement this.
		String shapeType = getShapeType().toString();
		String Id = getId().toString();
		double area = getArea();
		double perimeter = getPerimeter();
		return String.format("%s:\t ID = %s\t area = %.3f\t perimeter = %.3f",shapeType,Id,area,perimeter);
	}
}
