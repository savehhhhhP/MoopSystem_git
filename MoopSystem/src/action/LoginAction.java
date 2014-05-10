package action;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.opensymphony.xwork2.ActionSupport;

import domain.Enterprise;
import domain.Student;
import domain.User;
import domain.UserCategory;

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
	
	/**
	 * ï¿½ï¿½Ñ¯ï¿½Ã»ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ç·ï¿½ï¿½ï¿½È·ï¿½ï¿½ï¿½ï¿½È·ï¿½ï¿½ï¿½ï¿½sessionï¿½Òµï¿½Â¼ï¿½É¹ï¿½ï¿½ï¿½
	 */
	
	public String execute() throws Exception{

		Session session = sessionFactory.openSession();
		Transaction tx =session.beginTransaction();
		
		 Student stu = new Student("Äô¾¸Óî", 22, 98);  
		    try {  
		        session.save(stu);  
		        tx.commit();  
		    } catch (Exception e) {  
		        tx.rollback();  
		        e.printStackTrace();  
		    }finally{  
		        session.close();  
		    }  
		    return SUCCESS;

//		UserCategory cat = new UserCategory("aa");
//		cat.setId(0);
//		
//		Enterprise en = new Enterprise("a", new List(){"a"},
//				Set reProjectEnterprises, Set reProjectPatentUsers, Set users,
//				Set reSubprojectEnterprises, Set reEnterpriseUsers);
//	    User usr =new User(cat,en, "a",
//				"aa", "aa", "aa");
//	    
//	    usr.setId(1);
//	    try {
//	        session.save(usr);
//	        tx.commit();  
//	    } catch (Exception e) {  
//	        tx.rollback();  
//	        e.printStackTrace();  
//	    }finally{  
//	        session.close();  
//	    }
//	    return SUCCESS;
//		
	   

	}
}
