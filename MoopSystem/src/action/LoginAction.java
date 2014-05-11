package action;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.opensymphony.xwork2.ActionSupport;



public class LoginAction extends ActionSupport {
	private String userEmail;
	private String userPsw;
	
	private SessionFactory sessionFactory;
	
	public String getUserEmail(){
		return userEmail;
	}
	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}
	
	public void setUserPsw(String userPsw){
		this.userPsw = userPsw;
	}
	public String getUserPsw(){		return userPsw;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public String execute() throws Exception{
		System.out.println(userPsw);
		System.out.println(userEmail);
		
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try{
			tx =session.beginTransaction();
			String hql = "from UserInfo where Email=? and Password=?";
		      Query query = session.createQuery(hql);
		      query.setParameter(0, userEmail);
		      query.setParameter(1, userPsw);
		      java.util.List list = query.list();
		      if(list.size()>0){
		    	  return SUCCESS;
		      }
		      return ERROR;
		}
		catch(Exception e){
			return ERROR;
		}
		

//		Session session = sessionFactory.openSession();
//		Transaction tx =session.beginTransaction();
//		
//		 Student stu = new Student("Äô¾¸Óî", 22, 98);  
//		    try {  
//		        session.save(stu);
//		        tx.commit();  
//		    } catch (Exception e) {  
//		        tx.rollback();  
//		        e.printStackTrace();  
//		    }finally{  
//		        session.close();  
//		    }  
//		    return SUCCESS;

	}
}
