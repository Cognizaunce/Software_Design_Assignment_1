/* testDriver.java
 *
 *  Created on: Sep 28, 2024
 *      Author: Julian Olano Medina
*/

import java.io.IOException;

/**
 *  Test Driver Code Class
 */
public class testDriver {
	public static void main(String[] args) throws IOException {
		// Create Bananas
		GroceryProductFactory bananaFactory = new BananaFactory();
		GroceryProduct banana = bananaFactory.createGroceryProduct();
		// Fetch the price of the bananas using the database
		banana.setPrice();
		// Show the price for test purposes
		System.out.println(banana.getName() + " price: $" + banana.getPrice());
		
		// Create Apples
		GroceryProductFactory appleFactory = new AppleFactory();
		GroceryProduct apple = appleFactory.createGroceryProduct();
		// Fetch the price of the apple using the database
		apple.setPrice();
		// Show the price for test purposes
		System.out.println(apple.getName() + " price: $" + apple.getPrice());
	}
}
