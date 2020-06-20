package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.pojo.File1;

@Service
public class FileService {

	@Autowired
	private UserMapper userMapper;
	public void addFile(File1 upFile) {
		userMapper.addFile(upFile);
	}
	public List<File1> showFile() {
		return userMapper.showFile();
	}
	public List<File1> showFileUser(int userId){
		return userMapper.showFileUser(userId);
	}

}
