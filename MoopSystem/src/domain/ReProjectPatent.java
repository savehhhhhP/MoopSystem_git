package domain;

/**
 * ReProjectPatent entity. @author MyEclipse Persistence Tools
 */

public class ReProjectPatent implements java.io.Serializable {

	// Fields

	private Integer id;
	private SubprojectInfo subprojectInfo;
	private ProjectInfo projectInfo;
	private String patentNumber;
	private String applyDate;
	private String author;
	private String organization;

	// Constructors

	/** default constructor */
	public ReProjectPatent() {
	}

	/** full constructor */
	public ReProjectPatent(SubprojectInfo subprojectInfo,
			ProjectInfo projectInfo, String patentNumber, String applyDate,
			String author, String organization) {
		this.subprojectInfo = subprojectInfo;
		this.projectInfo = projectInfo;
		this.patentNumber = patentNumber;
		this.applyDate = applyDate;
		this.author = author;
		this.organization = organization;
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

	public String getPatentNumber() {
		return this.patentNumber;
	}

	public void setPatentNumber(String patentNumber) {
		this.patentNumber = patentNumber;
	}

	public String getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

}