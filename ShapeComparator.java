import java.util.Comparator;

/**
 * Lab 6
 * 
 * Class used to define a new way to compare shapes. This gives a different ordering
 * to shapes. The compareTo() in Shape orders shapes in descending order (comparing area then perimeter).
 * When a sorting function uses this class instead of the compareTo() method in shape, the sorting function
 * will sort the list of shapes in ascending order of area.
 * 
 * @author Stephen
 * @version 2018-10-03
 */
public class ShapeComparator implements Comparator<Shape>
{
    /**
     * Implementation of Comparator<Shape>'s compare method.
     * This method should define an ordering of shapes that
     * would sort shapes in a descending order, comparing first area and then perimeter.
     * Look to the documentation in Shape's compareTo to better understand
     * how this should work.
     * 
     * @param s1 The first shape to be compared.
     * @param s2 The second shape to be compared.
     * @return -1, 0, or 1. These values are returned on the following conditions:
     *     (1) Area of s1 is > area of s2: return -1
     *     (2) Area of s1 is < area of s2: return 1
     *     (3) Area of s1 = area of s2:
     *         (a) Perimeter of s1 is > perimeter of s2: return -1
     *         (b) Perimeter of s1 is < perimeter of s2: return 1
     *         (C) Perimeter of s1 = perimeter of s2: return 0
     */
	public int compare(Shape s1, Shape s2)
	{
	    // TODO: implement this.
		if (s1.getArea() > s2.getArea()) 
		{
			return -1;
		}
		else if (s1.getArea() < s2.getArea()) 
		{
			return 1;
		}
		else 
		{
			if (s1.getPerimeter() > s2.getPerimeter())
			{
				return -1;
			}
			else if (s1.getPerimeter() < s2.getPerimeter())
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
	}

	/**
	 * Compares two shapes to determine if they are effectively equal. You should
	 * use the compare() method of this class to determine this.
	 * 
	 * @param s1 The first shape to be compared.
     * @param s2 The second shape to be compared.
     * @return True if the shapes are effectively equal, False if they do not.
	 */
	public boolean equals(Shape s1, Shape s2)
	{
	    // TODO: implement this.
		return compare(s1, s2) == 0;
	}
}
