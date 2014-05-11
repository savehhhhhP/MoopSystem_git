package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.UserInfo;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public UserInfo findByID(int UserInfoID) {
		// TODO Auto-generated method stub
		UserInfo UserInfo = (UserInfo) getHibernateTemplate().get(UserInfo.class, UserInfoID); // �������������ض��־û����ʵ��
		return UserInfo;
	}

	/**
	 * ����������û���Ϣ�����û�
	 */
	@Override
	public UserInfo findByProperty(String propertyEmail, String propertyPsw) {
		// TODO Auto-generated method stub
		UserInfo result = new UserInfo();
		String queryString = "from UserInfo UserInfo where UserInfo.Email='"
				+ propertyEmail + "' and UserInfo.password='" + propertyPsw + "'";
		System.out.println(queryString);
		List<UserInfo> UserInfoList = getHibernateTemplate().find(queryString);
		if (UserInfoList.size() != 0) // ������Ӧ���û�
		{
			result = UserInfoList.get(0);
		} else // ��������Ӧ���û�
		{
			result = null;
		}
		return result;
	}

	@Override
	public void save(UserInfo newUserInfo) {
		// TODO Auto-generated method stub
		if (newUserInfo == null) // �û�������
			return;
		getHibernateTemplate().save(newUserInfo);// �������û�
	}

}
