package Q7;

import java.util.*;

public class Circumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        
        double radius = scanner.nextDouble();
       
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("The circumference of the circle is: " + circumference);
        
	}

}
