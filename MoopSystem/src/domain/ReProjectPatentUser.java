package domain;

/**
 * ReProjectPatentUser entity. @author MyEclipse Persistence Tools
 */

public class ReProjectPatentUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private Enterprise enterprise;
	private Integer projectId;
	private Integer subprojectId;
	private Integer patentId;
	private String patentNumber;
	private Integer authorId;
	private String authorName;
	private String enterpriseName;
	private String authorOrder;

	// Constructors

	/** default constructor */
	public ReProjectPatentUser() {
	}

	/** full constructor */
	public ReProjectPatentUser(Enterprise enterprise, Integer projectId,
			Integer subprojectId, Integer patentId, String patentNumber,
			Integer authorId, String authorName, String enterpriseName,
			String authorOrder) {
		this.enterprise = enterprise;
		this.projectId = projectId;
		this.subprojectId = subprojectId;
		this.patentId = patentId;
		this.patentNumber = patentNumber;
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

	public Integer getPatentId() {
		return this.patentId;
	}

	public void setPatentId(Integer patentId) {
		this.patentId = patentId;
	}

	public String getPatentNumber() {
		return this.patentNumber;
	}

	public void setPatentNumber(String patentNumber) {
		this.patentNumber = patentNumber;
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