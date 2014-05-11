package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.UserInfo;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public UserInfo findByID(int UserInfoID) {
		// TODO Auto-generated method stub
		UserInfo UserInfo = (UserInfo) getHibernateTemplate().get(UserInfo.class, UserInfoID); // 根据主键加载特定持久化类的实例
		return UserInfo;
	}

	/**
	 * 根据邮箱等用户信息查找用户
	 */
	@Override
	public UserInfo findByProperty(String propertyEmail, String propertyPsw) {
		// TODO Auto-generated method stub
		UserInfo result = new UserInfo();
		String queryString = "from UserInfo UserInfo where UserInfo.Email='"
				+ propertyEmail + "' and UserInfo.password='" + propertyPsw + "'";
		System.out.println(queryString);
		List<UserInfo> UserInfoList = getHibernateTemplate().find(queryString);
		if (UserInfoList.size() != 0) // 存在相应的用户
		{
			result = UserInfoList.get(0);
		} else // 不存在相应的用户
		{
			result = null;
		}
		return result;
	}

	@Override
	public void save(UserInfo newUserInfo) {
		// TODO Auto-generated method stub
		if (newUserInfo == null) // 用户不存在
			return;
		getHibernateTemplate().save(newUserInfo);// 保存新用户
	}

}
