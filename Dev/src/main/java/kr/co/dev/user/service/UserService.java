package kr.co.dev.user.service;

import org.springframework.web.servlet.ModelAndView;

public interface UserService {

	public ModelAndView regUser(String id, String password, int age, String name, String email, String address, String phone, String country) throws Exception;
	
}
