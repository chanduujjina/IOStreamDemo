package com.demo.filehandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws Exception {
		FileHandlingDemo fileHandlingDemo = new FileHandlingDemo();
		
		String sourceBasePath = "src/SourceFolder/image/Input-Output-Stream_base_diagram.jpg";
		
		String docType = null;

		if (sourceBasePath.contains(DocType.image.name())) {
			docType = "image";
		} else if (sourceBasePath.contains(DocType.video.name())) {
			docType = "video";

		} else if (sourceBasePath.contains(DocType.audio.name())) {
			docType = "addio";
		}
		else {
		   throw new Exception("Invalid doctype");
		}

		String destinationPath = "src/SanLocation/"+docType;

		fileHandlingDemo.fileHandle(sourceBasePath, destinationPath);

	}

	private void fileHandle(String sourceBasePath, String destinationPath) throws IOException {
		// get the fileName from source path

		String fileName = sourceBasePath.substring(sourceBasePath.lastIndexOf("/") + 1, sourceBasePath.length());

		// create a folder for destination path

		File directory = new File(destinationPath);

		if (!directory.isDirectory()) {
			directory.mkdirs();
		}

		//
		File file = new File(directory, fileName);
		boolean createNewFile = file.createNewFile();
		System.out.println("file created::" + createNewFile);

		// read the file from source

		try (FileInputStream fis = new FileInputStream(sourceBasePath);
				FileOutputStream fous = new FileOutputStream(file)) {
			int i = 0;

			while ((i = fis.read()) != -1) {
				fous.write(i);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
