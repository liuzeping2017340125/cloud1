package com.pojo;

import org.springframework.web.multipart.MultipartFile;

public class FileDomain {

	public MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
