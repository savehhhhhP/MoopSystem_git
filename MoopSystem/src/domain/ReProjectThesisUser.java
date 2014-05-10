package domain;

/**
 * ReProjectThesisUser entity. @author MyEclipse Persistence Tools
 */

public class ReProjectThesisUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private Thesis thesis;
	private SubprojectInfo subprojectInfo;
	private User user;
	private ProjectInfo projectInfo;
	private String thesisTopic;
	private String authorName;
	private Integer enterpriseId;
	private String enterpriseName;
	private String authorOrder;

	// Constructors

	/** default constructor */
	public ReProjectThesisUser() {
	}

	/** full constructor */
	public ReProjectThesisUser(Thesis thesis, SubprojectInfo subprojectInfo,
			User user, ProjectInfo projectInfo, String thesisTopic,
			String authorName, Integer enterpriseId, String enterpriseName,
			String authorOrder) {
		this.thesis = thesis;
		this.subprojectInfo = subprojectInfo;
		this.user = user;
		this.projectInfo = projectInfo;
		this.thesisTopic = thesisTopic;
		this.authorName = authorName;
		this.enterpriseId = enterpriseId;
		this.enterpriseName = enterpriseName;
		this.authorOrder = authorOrder;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Thesis getThesis() {
		return this.thesis;
	}

	public void setThesis(Thesis thesis) {
		this.thesis = thesis;
	}

	public SubprojectInfo getSubprojectInfo() {
		return this.subprojectInfo;
	}

	public void setSubprojectInfo(SubprojectInfo subprojectInfo) {
		this.subprojectInfo = subprojectInfo;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ProjectInfo getProjectInfo() {
		return this.projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public String getThesisTopic() {
		return this.thesisTopic;
	}

	public void setThesisTopic(String thesisTopic) {
		this.thesisTopic = thesisTopic;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
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

	public String getAuthorOrder() {
		return this.authorOrder;
	}

	public void setAuthorOrder(String authorOrder) {
		this.authorOrder = authorOrder;
	}

}