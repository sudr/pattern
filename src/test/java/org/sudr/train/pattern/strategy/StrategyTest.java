package org.sudr.train.pattern.strategy;

import java.io.File;
import java.util.ArrayList;

import org.testng.annotations.Test;

/**
 * Defines a set of encapsulated algorithms that can be swapped to carry out a
 * specific behaviour.
 * 
 */
@Test
public class StrategyTest {

	public static void test_strategy() {
		CompressionContext ctx = new CompressionContext();
		// we could assume context is already set by preferences
		ctx.setCompressionStrategy(new ZipCompressionStrategy());

		ArrayList<File> fileList = new ArrayList<File>();
		// get a list of files
		ctx.createArchive(fileList);
	}
}
