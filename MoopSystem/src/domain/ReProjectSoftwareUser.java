package domain;

/**
 * ReProjectSoftwareUser entity. @author MyEclipse Persistence Tools
 */

public class ReProjectSoftwareUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private Enterprise enterprise;
	private Integer projectId;
	private Integer subprojectId;
	private Integer softwareId;
	private String softwareName;
	private Integer authorId;
	private String authorName;
	private String enterpriseName;
	private String authorOrder;

	// Constructors

	/** default constructor */
	public ReProjectSoftwareUser() {
	}

	/** full constructor */
	public ReProjectSoftwareUser(Enterprise enterprise, Integer projectId,
			Integer subprojectId, Integer softwareId, String softwareName,
			Integer authorId, String authorName, String enterpriseName,
			String authorOrder) {
		this.enterprise = enterprise;
		this.projectId = projectId;
		this.subprojectId = subprojectId;
		this.softwareId = softwareId;
		this.softwareName = softwareName;
		this.authorId = authorId;
		this.authorName = authorName;
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

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getSubprojectId() {
		return this.subprojectId;
	}

	public void setSubprojectId(Integer subprojectId) {
		this.subprojectId = subprojectId;
	}

	public Integer getSoftwareId() {
		return this.softwareId;
	}

	public void setSoftwareId(Integer softwareId) {
		this.softwareId = softwareId;
	}

	public String getSoftwareName() {
		return this.softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
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