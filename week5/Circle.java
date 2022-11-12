/**
 * This class simulates a circle
 */
package chapter6;

/**
 * 6.7 Circle
 *
 * Write a Circle class that has the following fields: radius: a double PI: a final double initialized with the value
 * 3.14159 The class should have the following methods: Constructor. Accepts the radius of the circle as an argument.
 * Constructor. A no-arg constructor that sets the radius field to 0.0. setRadius. A mutator method for the radius
 * field. getRadius. An accessor method for the radius field. area. Returns the area of the circle, which is calculated
 * as area = PI * radius * radius diameter. Returns the diameter of the circle, which is calculated as diameter = radius
 * * 2 circumference. Returns the circumference of the circle, which is calculated as circumference = 2 * PI * radius
 * Write a program that demonstrates the Circle class by asking the user for the circle’s radius, creating a Circle
 * object, and then reporting the circle’s area, diameter, and circumference.
 *
 * @author Nikolay Stoyanov Nov 8, 2022
 */
public class Circle
{
	/**
	 * Radius of circle
	 */
	private double radius = 0;

	/**
	 * Constant for Pi
	 */
	private final static double PI = 3.14159;

	/**
	 * Calculates the area of the circle
	 *
	 * @return circle area
	 */
	public double getArea()
	{
		return PI * radius * radius;
	}

	/**
	 * Calculate the circumference of the circle
	 *
	 * @return circle circumference
	 */
	public double getCircumference()
	{
		return 2 * PI * radius;
	}

	/**
	 * Calculate the diameter of the cirlce
	 *
	 * @return circle diameter
	 */
	public double getDiameter()
	{
		return radius * 2;
	}

	/**
	 * Return the radius
	 *
	 * @return radius
	 */

	public double getRadius()
	{
		return this.radius;
	}

	/**
	 * Sets the radius
	 *
	 * @param rad radius
	 */

	public void setRadius(double rad)
	{
		this.radius = rad;
	}

	/**
	 * This constructorsets the starting radius to 0
	 */
	public Circle()
	{
		this(0);
	}

	/**
	 * This constructor sets the starting balance to the value passed as an argument
	 *
	 * @param rad user input for radius
	 */

	public Circle(double rad)
	{
		radius = rad;
	}

	/**
	 * Returns an unserialized representation of this object
	 * 
	 * @return The unserialized representatiuon of this object
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		sb.append(this.getClass());
		sb.append(" this.getRadius()= ").append(this.getRadius());
		sb.append(" this.getArea()= ").append(this.getArea());
		sb.append(" this.getDiameter()= ").append(this.getDiameter());
		sb.append(" this.getCircumference()= ").append(this.getCircumference());

		return sb.toString();
	}// close toString
}// close class
