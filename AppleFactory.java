/* AppleFactory.java
 *
 *  Created on: Sep 27, 2024
 *      Author: Julian Olano Medina
*/

import java.io.IOException;

/**
 * 
 */
public class AppleFactory implements GroceryProductFactory {

	public GroceryProduct createGroceryProduct() {
		return new Apple();
	}
}

class Apple extends GroceryProduct {
	
	Apple() {
		this.name = "Apple";
	}
	
	@Override
	public void setPrice() throws IOException {
		this.price = readDatabaseFile("Apple");
	}
}
