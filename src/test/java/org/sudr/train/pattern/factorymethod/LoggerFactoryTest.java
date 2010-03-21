package org.sudr.train.pattern.factorymethod;

import org.testng.annotations.Test;

/**
 * Define an interface for creating an object, but let the subclasses decide
 * which class to instantiate. The Factory method lets a class defer
 * instantiation to subclasses.
 * 
 * A simple factory usually works fine. Factory method provides further
 * decoupling by allowing the subclass to decide what concrete implementation to
 * create.
 * 
 * Prototype is better for more complicated structures.
 */
public class LoggerFactoryTest {

	@Test
	public void test_xml_logger() {
		AbstractLoggerCreator creator = new XMLLoggerCreator();
		// the appropriate creator (XML, FILE, DB) can be passed to any method
		// you can also pass in a parameter to the LoggerCreate() which it can
		// use to determine which logger to create
		Logger logger = creator.createLogger();
		logger.log("hello");
	}

}
