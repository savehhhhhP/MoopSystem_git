package domain;

/**
 * ReProjectUser entity. @author MyEclipse Persistence Tools
 */

public class ReProjectUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private ProjectInfo projectInfo;
	private User user;
	private String userName;
	private Integer enterpriseId;
	private String enterpriseName;

	// Constructors

	/** default constructor */
	public ReProjectUser() {
	}

	/** full constructor */
	public ReProjectUser(ProjectInfo projectInfo, User user, String userName,
			Integer enterpriseId, String enterpriseName) {
		this.projectInfo = projectInfo;
		this.user = user;
		this.userName = userName;
		this.enterpriseId = enterpriseId;
		this.enterpriseName = enterpriseName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(Integer enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

}