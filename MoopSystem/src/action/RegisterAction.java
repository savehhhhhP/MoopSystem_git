package action;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;

import domain.UserInfo;

public class RegisterAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _nickname;
	private String _userPsw1;
	private String _userPsw2;
	private String _userEmail;
	
	private SessionFactory sessionFactory;
	public String get_Nickname() {
		return _nickname;
	}

	public void set_Nickname(String _Nickname) {
		this._nickname = _Nickname;
	}

	public String get_userPsw1() {
		return _userPsw1;
	}

	public void set_userPsw1(String _userPsw1) {
		this._userPsw1 = _userPsw1;
	}

	public String get_userPsw2() {
		return _userPsw2;
	}
	public void set_userPsw2(String _userPsw2) {
		this._userPsw2 = _userPsw2;
	}

	public String get_userEmail() {
		return _userEmail;
	}

	public void set_userEmail(String _userEmail) {
		this._userEmail = _userEmail;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String execute() throws Exception{
		if(!_userPsw1.equals(_userPsw2)){
			return ERROR;
		}

		Session session = sessionFactory.openSession();
		Transaction tx =null;

		UserInfo stu = new UserInfo(_nickname,_userEmail, _userPsw1,"111");
		stu.setId(1);
		try {  
			tx =session.beginTransaction();
			session.save(stu);
			tx.commit();  
		} catch (Exception e) {  
			tx.rollback();  
			e.printStackTrace();  
			return ERROR;
		}finally{  
			session.close();  
		}  
		return SUCCESS;
	}

}
