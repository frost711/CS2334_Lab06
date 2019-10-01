import java.util.ArrayList;
import java.util.Collections;

/**
 * Lab 6
 * 
 * Test class for Lab 6
 * 
 * @author Stephen
 * @version 2018-10-03
 */
public class ShapeTest
{
    /**
     * Tests for the square class.
     * 
     * @throws AssertException Thrown if the actual value does not equal true;
     */
	public void SquareTest() throws AssertException
	{
	    // TODO: implement this.
		Shape square1 = new Square("Square1", 3.0);
		Assert.assertEquals(3.0*3.0, square1.getArea(),0.0001);
		Assert.assertEquals(3.0+3.0+3.0+3.0, square1.getPerimeter(),0.0001);
		Assert.assertEquals("Square",square1.getShapeType());
		Assert.assertEquals("Square1", square1.getId());
		
		Shape square2 = new Square("Square2", 4.5);
		Assert.assertEquals(4.5*4.5, square2.getArea(),0.0001);
		Assert.assertEquals(4.5+4.5+4.5+4.5, square2.getPerimeter(),0.0001);
		Assert.assertEquals("Square",square2.getShapeType());
		Assert.assertEquals("Square2", square2.getId());
	}
	
	/**
     * Tests for the rectangle class.
     * 
     * @throws AssertException Thrown if the actual value does not equal true;
     */
	public void RectangleTest() throws AssertException
	{
	    // TODO: implement this.
		Shape rectangle1 = new Rectangle("Rectangle1", 3.25, 4.35);
		Assert.assertEquals(3.25*4.35, rectangle1.getArea(),0.0001);
		Assert.assertEquals(3.25+4.35+3.25+4.35, rectangle1.getPerimeter(),0.0001);
		Assert.assertEquals("Rectangle",rectangle1.getShapeType());
		Assert.assertEquals("Rectangle1", rectangle1.getId());
		
		Shape rectangle2 = new Rectangle("Rectangle2", 3.0, 4.0);
		Assert.assertEquals(3.0*4.0, rectangle2.getArea(),0.0001);
		Assert.assertEquals(3.0+4.0+3.0+4.0, rectangle2.getPerimeter(),0.0001);
		Assert.assertEquals("Rectangle",rectangle2.getShapeType());
		Assert.assertEquals("Rectangle2", rectangle2.getId());
	}
	
	/**
     * Tests for the equilateral triangle class.
     * 
     * @throws AssertException Thrown if the actual value does not equal true;
     */
	public void EquilateralTriangleTest() throws AssertException
	{
	    // TODO: implement this.
		Shape triangle1 = new EquilateralTriangle("Triangle1", 3.0);
		Assert.assertEquals(3.0*3.0*Math.sqrt(3)/4, triangle1.getArea(),0.0001);
		Assert.assertEquals(3.0+3.0+3.0, triangle1.getPerimeter(),0.0001);
		Assert.assertEquals("EquilateralTriangle",triangle1.getShapeType());
		Assert.assertEquals("Triangle1", triangle1.getId());
		
		Shape triangle2 = new EquilateralTriangle("Triangle2", 3.5);
		Assert.assertEquals(3.5*3.5*Math.sqrt(3)/4, triangle2.getArea(),0.0001);
		Assert.assertEquals(3.5+3.5+3.5, triangle2.getPerimeter(),0.0001);
		Assert.assertEquals("EquilateralTriangle",triangle2.getShapeType());
		Assert.assertEquals("Triangle2", triangle2.getId());
	}
	
	/**
	 * THIS TEST IS GIVEN FOR YOU. IT WILL WORK ONCE YOU HAVE DECLARE THE ABSTRACT SHAPE METHODS.
	 * 
     * Tests for the circle class. Also test that IDs are done correctly.
     * @throws AssertException Thrown if the actual value does not equal true;
     */
	public void CircleTest() throws AssertException
	{
		Shape circ = new Circle("Circle1", 3.0);
		Assert.assertEquals(Math.PI*3.0*3.0, circ.getArea(),0.0001);
		Assert.assertEquals(2*Math.PI*3.0, circ.getPerimeter(),0.0001);
		Assert.assertEquals("Circle",circ.getShapeType());
		Assert.assertEquals("Circle1", circ.getId());
		
		Shape circs = new Circle("Circle2", 4.5);
		Assert.assertEquals(Math.PI*4.5*4.5, circs.getArea(),0.0001);
		Assert.assertEquals(2*Math.PI*4.5, circs.getPerimeter(),0.0001);
		Assert.assertEquals("Circle",circs.getShapeType());
		Assert.assertEquals("Circle2", circs.getId());
	}
	
	/**
     * Tests for the Shape Comparator class.
     * 
     * @throws AssertException Thrown if the actual value does not equal true;
     */
	public void CompareTest() throws AssertException
	{
	    // TODO: implement this.
		ArrayList<Shape> list = new ArrayList<Shape>();
		Shape s1 = new Square("A", 4.0);
		Shape s2 = new Rectangle("B", 4.0, 1.0);
		list.add(s1);
		list.add(s2);
		
		// Assert.assertTrue(s1.compareTo(s2));
		Collections.sort(list, new ShapeComparator());
		
		
	}
	
	/**
	 * Tests for Shape's toString().
	 * 
	 * @throws AssertException Thrown if the actual value does not equal true;
	 */
	public void ShapeToStringTest() throws AssertException
	{
	    // TODO: implement this.
		Shape square = new Square("Square1", 3.0);
		Assert.assertEquals("Square:\t ID = Square1\t area = 9.000\t perimeter = 12.000",square.toString());
	}
	
	/**
	 * Tests the natural ordering of shapes (compareTo in shape)
	 * 
	 * @throws AssertException Thrown if the actual value does not equal true;
	 */
    public void NaturalCompareTest() throws AssertException
    {
	    // TODO: implement this.
    	ArrayList<Shape> list = new ArrayList<Shape>();
		Shape s1 = new Square("A", 4.0);
		Shape s2 = new Rectangle("B", 4.0, 1.0);
		list.add(s1);
		list.add(s2);
		Collections.sort(list);
    }
}
