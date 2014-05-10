package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserCategory userCategory;
	private Nation nation;
	private Enterprise enterprise;
	private String name;
	private String email;
	private String password;
	private String number;
	private String phone;
	private String sex;
	private String birth;
	private String degree;
	private String title;
	private Set replies = new HashSet(0);
	private Set userExtendInfos = new HashSet(0);
	private Set reSubprojectUsers = new HashSet(0);
	private Set reProjectUsers = new HashSet(0);
	private Set documents = new HashSet(0);
	private Set softwareRights = new HashSet(0);
	private Set patents = new HashSet(0);
	private Set discussions = new HashSet(0);
	private Set reProjectThesisUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(UserCategory userCategory, Enterprise enterprise, String name,
			String email, String password, String number) {
		this.userCategory = userCategory;
		this.enterprise = enterprise;
		this.name = name;
		this.email = email;
		this.password = password;
		this.number = number;
	}

	/** full constructor */
	public User(UserCategory userCategory, Nation nation,
			Enterprise enterprise, String name, String email, String password,
			String number, String phone, String sex, String birth,
			String degree, String title, Set replies, Set userExtendInfos,
			Set reSubprojectUsers, Set reProjectUsers, Set documents,
			Set softwareRights, Set patents, Set discussions,
			Set reProjectThesisUsers) {
		this.userCategory = userCategory;
		this.nation = nation;
		this.enterprise = enterprise;
		this.name = name;
		this.email = email;
		this.password = password;
		this.number = number;
		this.phone = phone;
		this.sex = sex;
		this.birth = birth;
		this.degree = degree;
		this.title = title;
		this.replies = replies;
		this.userExtendInfos = userExtendInfos;
		this.reSubprojectUsers = reSubprojectUsers;
		this.reProjectUsers = reProjectUsers;
		this.documents = documents;
		this.softwareRights = softwareRights;
		this.patents = patents;
		this.discussions = discussions;
		this.reProjectThesisUsers = reProjectThesisUsers;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserCategory getUserCategory() {
		return this.userCategory;
	}

	public void setUserCategory(UserCategory userCategory) {
		this.userCategory = userCategory;
	}

	public Nation getNation() {
		return this.nation;
	}

	public void setNation(Nation nation) {
		this.nation = nation;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
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

	public String getBirth() {
		return this.birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
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

	public Set getReplies() {
		return this.replies;
	}

	public void setReplies(Set replies) {
		this.replies = replies;
	}

	public Set getUserExtendInfos() {
		return this.userExtendInfos;
	}

	public void setUserExtendInfos(Set userExtendInfos) {
		this.userExtendInfos = userExtendInfos;
	}

	public Set getReSubprojectUsers() {
		return this.reSubprojectUsers;
	}

	public void setReSubprojectUsers(Set reSubprojectUsers) {
		this.reSubprojectUsers = reSubprojectUsers;
	}

	public Set getReProjectUsers() {
		return this.reProjectUsers;
	}

	public void setReProjectUsers(Set reProjectUsers) {
		this.reProjectUsers = reProjectUsers;
	}

	public Set getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set documents) {
		this.documents = documents;
	}

	public Set getSoftwareRights() {
		return this.softwareRights;
	}

	public void setSoftwareRights(Set softwareRights) {
		this.softwareRights = softwareRights;
	}

	public Set getPatents() {
		return this.patents;
	}

	public void setPatents(Set patents) {
		this.patents = patents;
	}

	public Set getDiscussions() {
		return this.discussions;
	}

	public void setDiscussions(Set discussions) {
		this.discussions = discussions;
	}

	public Set getReProjectThesisUsers() {
		return this.reProjectThesisUsers;
	}

	public void setReProjectThesisUsers(Set reProjectThesisUsers) {
		this.reProjectThesisUsers = reProjectThesisUsers;
	}

}