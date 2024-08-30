package com.project;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	
	String uploadFile(MultipartFile file,String path) throws IOException;

}
