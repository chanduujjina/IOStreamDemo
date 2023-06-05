package com.demo.filehandle_divya;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.demo.filehandle.DocType;

public class FileHandling {

	public static void main(String[] args) throws Exception {
		FileHandling fh = new FileHandling();
		String basePath = "src/SourceFolder_Divya/image/Input-Output-Stream_base_diagram.jpg";
		
		String docType = null;
		
		if(basePath.contains(DocType.image.name())) {
			docType = "image";
		}
		else if (basePath.contains(DocType.audio.name())) {
			docType = "audio";
		}
		else if (basePath.contains(DocType.video.name())) {
			docType = "video";
		}
		else {
			throw new Exception("Invalid doctype");
		}
		
		
		String destinationPath = "src/SanLocation_Divya"+docType;
		
		fh.fileHandle(basePath, destinationPath );
		
		
  }

	private void fileHandle(String basePath, String destinationPath) throws IOException {
		
		String folderName = basePath.substring(0, basePath.lastIndexOf("/"));
		System.out.println(folderName);

		// get the fileName from source path
		String fileName = basePath.substring(basePath.lastIndexOf("/")+1, basePath.length());
		System.out.println(fileName);
		
		// create a folder for destination path
		File directory = new File(destinationPath);
		
		if(!directory.isDirectory()) {
			directory.mkdirs();
		}
		
		// add fileName to the above crate folder
		File file = new File(directory, fileName);
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
		
		// read the file from source
		
		try (FileInputStream fileInputStream = new FileInputStream(basePath);
				FileOutputStream fileOutputStream = new FileOutputStream(file)) {
			
			int i=0;
			
			while((i=fileInputStream.read())!= -1) {
				fileOutputStream.write(i);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
