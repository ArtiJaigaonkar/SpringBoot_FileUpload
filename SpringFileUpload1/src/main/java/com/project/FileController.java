package com.project;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {
	
	@Autowired
	FileServerImpl fileSer;
	
	@Value("${project.image}")
	String path;
	
	@PostMapping("/uploadfile")
	public String uploadfile(MultipartFile file) throws IOException {
		System.out.println(file.getOriginalFilename());
		return fileSer.uploadFile(file,path);
	}

}


