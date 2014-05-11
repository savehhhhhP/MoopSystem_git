package dao;

import domain.UserInfo;

public interface UserDAO {
	public UserInfo findByID(int userID);// ʹ��������ż����û���Ϣ

	public UserInfo findByProperty(String propertyEmail, String propertyPsw);// ����Ƿ�������������

	public void save(UserInfo newUser);
}
