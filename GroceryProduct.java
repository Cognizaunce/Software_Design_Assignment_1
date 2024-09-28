/* CreateGroceryProduct.java
 *
 *  Created on: Sep 27, 2024
 *      Author: Julian Olano Medina
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * An interface class for grocery products, complete with the database
 * functionality each different product needs to use in order to fetch its
 * price.
 */
public abstract class GroceryProduct {

	// All grocery products need a price
	protected float price;
	// All grocery products need a name
	protected String name;

	// Reads the file and returns the value associated with the item.
	public static float readDatabaseFile(String item) throws IOException {

		// Open the file
		try (BufferedReader br = new BufferedReader(new FileReader("\\Assignment_One\\database.csv"))) {
			String line;

			// Read each line in the file
			while ((line = br.readLine()) != null) {
				// Split the line using the comma delimiter
				String[] values = line.split(",");

				// Check if the first column matches the item
				if (values[0].equalsIgnoreCase(item)) {
					// Return the price (the value after the comma)
					return Float.parseFloat(values[1].strip());
				}
			}
		}

		catch (IOException e) {// Print that exception occurred
			System.err.println(e);
		}

		// If item is not found, return price of NaN
		return Float.NaN;
	}

	/**
	 * This is a mandatory all products need, the ability to get their price
	 * 
	 * @throws IOException
	 */
	public abstract void setPrice() throws IOException;

	/**
	 * Mandatory method, the ability to return the value of its price
	 */
	public float getPrice() {
		return this.price;
	}

	/**
	 * Mandatory method, the ability to return the value of its name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
}
