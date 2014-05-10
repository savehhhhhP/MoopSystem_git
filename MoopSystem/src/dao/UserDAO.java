package dao;

import domain.User;

public interface UserDAO {
	public User findByID(int userID);// 使用主键编号检索用户信息

	public User findByProperty(String propertyEmail, String propertyPsw);// 检查是否存在邮箱和密码

	public void save(User newUser);
}
