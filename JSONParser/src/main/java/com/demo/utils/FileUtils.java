package com.demo.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
	public FileWriter fileWriter;
	
	public void createJSONFile(String path) {
		try {
			fileWriter = new FileWriter(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
