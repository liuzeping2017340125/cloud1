package com.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.pojo.User;

@Service
@Transactional(propagation=Propagation.NOT_SUPPORTED)
public interface UserService {

	  //登录验证
		User logincheck(User user);
		//注册
		void register(User user);

}
