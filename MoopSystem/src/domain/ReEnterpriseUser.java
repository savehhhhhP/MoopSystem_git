package domain;

/**
 * ReEnterpriseUser entity. @author MyEclipse Persistence Tools
 */

public class ReEnterpriseUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private Enterprise enterprise;
	private Integer userId;

	// Constructors

	/** default constructor */
	public ReEnterpriseUser() {
	}

	/** full constructor */
	public ReEnterpriseUser(Enterprise enterprise, Integer userId) {
		this.enterprise = enterprise;
		this.userId = userId;
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

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}