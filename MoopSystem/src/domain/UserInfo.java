package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String email;
	private String password;
	private String number;
	private String phone;
	private String sex;
	private Date birth;
	private Integer nationId;
	private String degree;
	private String title;
	private Integer categoryId;
	private Integer enterpriseId;
	private Set userInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** minimal constructor */
	public UserInfo(String name, String email,
			String password, String number) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.number = number;
	}

	/** full constructor */
	public UserInfo(String name, String email,
			String password, String number, String phone, String sex,
			Date birth, Integer nationId, String degree, String title,
			Integer categoryId, Integer enterpriseId, Set userInfos) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.number = number;
		this.phone = phone;
		this.sex = sex;
		this.birth = birth;
		this.nationId = nationId;
		this.degree = degree;
		this.title = title;
		this.categoryId = categoryId;
		this.enterpriseId = enterpriseId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Integer getNationId() {
		return this.nationId;
	}

	public void setNationId(Integer nationId) {
		this.nationId = nationId;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(Integer enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Set getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(Set userInfos) {
		this.userInfos = userInfos;
	}

}