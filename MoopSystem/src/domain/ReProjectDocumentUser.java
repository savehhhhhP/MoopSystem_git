package domain;

/**
 * ReProjectDocumentUser entity. @author MyEclipse Persistence Tools
 */

public class ReProjectDocumentUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private Document document;
	private Integer projectId;
	private Integer subprojectId;
	private String documentName;
	private Integer authorId;
	private String authorName;
	private Integer enterpriseId;
	private String enterpriseName;
	private String authorOrder;

	// Constructors

	/** default constructor */
	public ReProjectDocumentUser() {
	}

	/** full constructor */
	public ReProjectDocumentUser(Document document, Integer projectId,
			Integer subprojectId, String documentName, Integer authorId,
			String authorName, Integer enterpriseId, String enterpriseName,
			String authorOrder) {
		this.document = document;
		this.projectId = projectId;
		this.subprojectId = subprojectId;
		this.documentName = documentName;
		this.authorId = authorId;
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

	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
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

	public String getDocumentName() {
		return this.documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
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