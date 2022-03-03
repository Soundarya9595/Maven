package com.properties;

import java.io.IOException;

public class FileReaderManager {

private   FileReaderManager() {
}
 
	
	
	public static FileReaderManager getobjFRM() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public ConfigurationReader getobjCRM() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
	
	
	
	
	
}
