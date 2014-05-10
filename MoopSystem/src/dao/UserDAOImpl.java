package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public User findByID(int userID) {
		// TODO Auto-generated method stub
		User user = (User) getHibernateTemplate().get(User.class, userID); // �������������ض��־û����ʵ��
		return user;
	}

	/**
	 * ����������û���Ϣ�����û�
	 */
	@Override
	public User findByProperty(String propertyEmail, String propertyPsw) {
		// TODO Auto-generated method stub
		User result = new User();
		String queryString = "from User user where user.Email='"
				+ propertyEmail + "' and user.password='" + propertyPsw + "'";
		System.out.println(queryString);
		List<User> userList = getHibernateTemplate().find(queryString);
		if (userList.size() != 0) // ������Ӧ���û�
		{
			result = userList.get(0);
		} else // ��������Ӧ���û�
		{
			result = null;
		}
		return result;
	}

	@Override
	public void save(User newUser) {
		// TODO Auto-generated method stub
		if (newUser == null) // �û�������
			return;
		getHibernateTemplate().save(newUser);// �������û�
	}

}
