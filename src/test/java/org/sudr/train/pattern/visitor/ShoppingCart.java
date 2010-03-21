package org.sudr.train.pattern.visitor;

import java.util.ArrayList;

import org.testng.annotations.Test;

/**
 * Allows for one or more operation to be applied to a set of objects at
 * runtime, decoupling the operations from the object structure.
 * 
 */
@Test
public class ShoppingCart {

	public void test_calculate_postage() {
		// normal shopping cart stuff
		ArrayList<Visitable> items = new ArrayList<Visitable>();
		// create a visitor
		PostageVisitor visitor = new PostageVisitor();
		// iterate through all items
		for (Visitable item : items) {
			item.accept(visitor);
		}
		double postage = visitor.getTotalPostage();
		System.out.println("total postage: " + postage);
	}

}