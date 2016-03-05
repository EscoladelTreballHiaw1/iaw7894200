/*
 * Bicycle.java
 * 
 * Copyright 2016 Samba Gueye <gueye.samba@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package triangle;

/**
 * Modelizes a triangle.
 * 
 * a tringle can be acute scalene triangle , equilateral triangle, isoceles triangle , obtuse scalene triangle , isoceles right triangle o right  
 * the sum of the two sides may be greater the the third side.
 */
public class Triangle {
    
    // side 1
    private double side1;
    // side 2
    private double side2;
    // side 3
    private double side3;
    
    
    /**
     * constructor by default. Create a triangle with sides 3, 4 and 5, this mean that side1 = 3, side2 = 4, side4 = 5
     * 
     */
    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }
    
    /**
     * constructor. 
     * 
     * @param side1 - a side of the triangle
     * @param side2 - a side of the triangle
     * @param side3 - a side of the triangle
     * 
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /**
     * determinate if 3 given numers form a triangle
     * 
     * @param side1 - a side of the triangle
     * @param side2 - a side of the triangle
     * @param side3 - a side of the triangle
     * 
     */ 
    public boolean isTriangle(double side1, double side2, double side3) {
        boolean admited = false;
        if (side1 + side2 > side3 && side1 + side3 > side2 && side3 + side2 > side1) {
            admited = true;
        }
        return admited;
    }
    /**
     * calculate the perimeter of a triangle 
     * 
     * @param side1 - a side of the triangle
     * @param side2 - a side of the triangle
     * @param side3 - a side of the triangle
     * 
     */
    public double perimeter(double side1, double side2, double side3) {
      return  (side1 + side2 + side3) ;         
    }
    
    /**
     * calculate the area of a triangle
     * 
     * @param side1 - a side of the triangle
     * @param side2 - a side of the triangle
     * @param side3 - a side of the triangle
     * 
     */
    public double area(double side1, double side2, double side3) {
        double p = perimeter(side1, side2, side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
    
    
            
            