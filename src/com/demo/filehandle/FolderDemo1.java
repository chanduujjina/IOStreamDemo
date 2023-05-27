package com.demo.filehandle;

import java.io.File;

public class FolderDemo1 {
	
	public static void main(String[] args) {
		
		String basePath = "src/FileStorage";
		
		File file = new File(basePath);
		
		if(!file.isDirectory()) {
			boolean mkdirs = file.mkdirs();
			System.out.println(mkdirs);
		}
	}

}
