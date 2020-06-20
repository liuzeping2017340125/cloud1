package com.control;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.pojo.File1;
import com.pojo.FileDomain;
import com.pojo.User;
import com.service.FileService;
import com.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	private FileService fileService;
	@RequestMapping("/tologin")
	public String tologin() {
		System.out.println("进入到login的控制器！");
		return "login";
	}
	//登录验证
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password,Model model) {
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		if(userService.logincheck(user) != null){
			model.addAttribute("username",username);
			return "index";
		}
		else{
		    model.addAttribute("error","账号或密码错误");
		    return "login";
		}
	}
	@RequestMapping("/toregister")
	public String toregister(){
		return "register";	
	}
	//注册
	@RequestMapping("/register")
	public String register(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		userService.register(user);		
		return "login";
	}
	@RequestMapping("/toindex")
	public String toindex(){
		return "index";	
	}
	@RequestMapping("/tofileupload")
	public String tofileupload(){
		return "fileupload";	
	}
	@RequestMapping("/upload.do")
    public String fileupload(@RequestParam("uploadFile") MultipartFile file, HttpServletRequest request)
    		throws IllegalStateException, IOException{
		// 判断文件是否为空，空则返回失败页面
		if (file.isEmpty()) {
			return "failed";
		}
		// 获取文件存储路径（绝对路径）
		HttpSession session = request.getSession();
		String path = session.getServletContext().getRealPath("/WEB-INF/file");
		// 获取原文件名
		String fileName = file.getOriginalFilename();
		// 创建文件实例
		File filePath = new File(path, fileName);
		// 如果文件目录不存在，创建目录
		if (!filePath.getParentFile().exists()) {
			filePath.getParentFile().mkdirs();
			System.out.println("创建目录" + filePath);
		}
		// 写入文件
		file.transferTo(filePath);
		return "common/success";
	}
}
