/* BananaFactory.java
 *
 *  Created on: Sep 27, 2024
 *      Author: Julian Olano Medina
*/

import java.io.IOException;

/**
 * 
 */
public class BananaFactory implements GroceryProductFactory {
	
	@Override
	public GroceryProduct createGroceryProduct() {
		return new Banana();
	}
}

class Banana extends GroceryProduct {

	public Banana() {
		this.name = "Banana";
	}
	@Override
	public void setPrice() throws IOException {
		this.price = readDatabaseFile("Banana");
	}
}
