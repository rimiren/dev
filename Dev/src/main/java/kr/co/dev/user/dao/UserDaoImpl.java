package kr.co.dev.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public int regUser(String id, String password, int age, String name, String email, String address,
			String phone, String country) throws ClassNotFoundException, SQLException {
		
		   String dbId = "root";
		   String dbPassword = "";//localhost:3306/test?
		   String url = "jdbc:mysql://localhost:3306/dev?serverTimezone=UTC&useUnicode=true& useUnicode=true&characterEncoding=utf-8";
		   
		   Class.forName("com.mysql.jdbc.Driver");
		   
		   Connection conn = DriverManager.getConnection(url, dbId, dbPassword);
		   
		   String sql = "insert into userinfo(id, password, age, name, email, address, phone, country) values(?,?,?,?,?,?,?,?)";
		   
		   PreparedStatement pst = conn.prepareStatement(sql);
		   pst.setString(1, id);
		   pst.setString(2, password);
		   pst.setInt(3, age);
		   pst.setString(4, name);
		   pst.setString(5, email);
		   pst.setString(6, address);
		   pst.setString(7, phone);
		   pst.setString(8, country);
		   
		   int result = pst.executeUpdate();
		   
		   return result;
		
	}

}
