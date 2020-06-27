package kr.co.dev.user.dao;

public interface UserDao {
	
	public int regUser(String id, String password, int age, String name, String email, String address, String phone, String country) throws Exception;


}
