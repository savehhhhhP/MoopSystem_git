package dao;

import domain.User;

public interface UserDAO {
	public User findByID(int userID);// ʹ��������ż����û���Ϣ

	public User findByProperty(String propertyEmail, String propertyPsw);// ����Ƿ�������������

	public void save(User newUser);
}
