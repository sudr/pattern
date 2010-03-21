package org.sudr.train.pattern.strategy;

import java.io.File;
import java.util.ArrayList;

//Strategy Interface
public interface CompressionStrategy {

	void compressFiles(ArrayList<File> files);

}