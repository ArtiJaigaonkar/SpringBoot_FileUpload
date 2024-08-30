package com.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileServerImpl implements FileService{

	@Override
	public String uploadFile(MultipartFile file, String path) throws IOException {
		// TODO Auto-generated method stub
		String name=file.getOriginalFilename();
		String fname=path+name;
		
		Files.copy(file.getInputStream(), Paths.get(fname));
		return "File Upload Successfully";
	}

}
