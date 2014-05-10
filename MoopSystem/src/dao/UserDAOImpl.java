package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public User findByID(int userID) {
		// TODO Auto-generated method stub
		User user = (User) getHibernateTemplate().get(User.class, userID); // 根据主键加载特定持久化类的实例
		return user;
	}

	/**
	 * 根据邮箱等用户信息查找用户
	 */
	@Override
	public User findByProperty(String propertyEmail, String propertyPsw) {
		// TODO Auto-generated method stub
		User result = new User();
		String queryString = "from User user where user.Email='"
				+ propertyEmail + "' and user.password='" + propertyPsw + "'";
		System.out.println(queryString);
		List<User> userList = getHibernateTemplate().find(queryString);
		if (userList.size() != 0) // 存在相应的用户
		{
			result = userList.get(0);
		} else // 不存在相应的用户
		{
			result = null;
		}
		return result;
	}

	@Override
	public void save(User newUser) {
		// TODO Auto-generated method stub
		if (newUser == null) // 用户不存在
			return;
		getHibernateTemplate().save(newUser);// 保存新用户
	}

}
