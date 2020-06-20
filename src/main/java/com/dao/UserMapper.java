package com.dao;

import java.util.List;


import com.pojo.File1;
import com.pojo.User;

public interface UserMapper {
    //登录验证
	User logincheck(User user);
	//注册
	void register(User user);
	//把上传文件信息写入数据库
		public void addFile(File1 upFile);
		//文件在index页面显示
	    public List<File1> showFile();
	  //登陆后显示该用户在云盘存储的文件
	    public List<File1> showFileUser(int userId);
}
