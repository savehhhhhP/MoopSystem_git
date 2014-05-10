package domain;

/**
 * ReSubprojectUser entity. @author MyEclipse Persistence Tools
 */

public class ReSubprojectUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private SubprojectInfo subprojectInfo;
	private ProjectInfo projectInfo;
	private User user;
	private String userName;
	private String userEnterprise;

	// Constructors

	/** default constructor */
	public ReSubprojectUser() {
	}

	/** full constructor */
	public ReSubprojectUser(SubprojectInfo subprojectInfo,
			ProjectInfo projectInfo, User user, String userName,
			String userEnterprise) {
		this.subprojectInfo = subprojectInfo;
		this.projectInfo = projectInfo;
		this.user = user;
		this.userName = userName;
		this.userEnterprise = userEnterprise;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SubprojectInfo getSubprojectInfo() {
		return this.subprojectInfo;
	}

	public void setSubprojectInfo(SubprojectInfo subprojectInfo) {
		this.subprojectInfo = subprojectInfo;
	}

	public ProjectInfo getProjectInfo() {
		return this.projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEnterprise() {
		return this.userEnterprise;
	}

	public void setUserEnterprise(String userEnterprise) {
		this.userEnterprise = userEnterprise;
	}

}