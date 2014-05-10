package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * ProjectInfo entity. @author MyEclipse Persistence Tools
 */

public class ProjectInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String number;
	private Integer masterId;
	private String masterName;
	private Integer enterpriseId;
	private String enterpriseName;
	private Double funds;
	private String startDate;
	private String endDate;
	private Integer isPublic;
	private Integer state;
	private Set reProjectSoftwares = new HashSet(0);
	private Set reSubprojectUsers = new HashSet(0);
	private Set reSubprojectEnterprises = new HashSet(0);
	private Set reProjectThesisUsers = new HashSet(0);
	private Set reProjectUsers = new HashSet(0);
	private Set reProjectThesises = new HashSet(0);
	private Set reProjectDocuments = new HashSet(0);
	private Set discussions = new HashSet(0);
	private Set reProjectPatents = new HashSet(0);
	private Set reProjectEnterprises = new HashSet(0);
	private Set projectExtendInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public ProjectInfo() {
	}

	/** minimal constructor */
	public ProjectInfo(String name, String number, Integer masterId,
			String masterName, Integer enterpriseId, String enterpriseName,
			Double funds, String startDate, String endDate, Integer isPublic,
			Integer state) {
		this.name = name;
		this.number = number;
		this.masterId = masterId;
		this.masterName = masterName;
		this.enterpriseId = enterpriseId;
		this.enterpriseName = enterpriseName;
		this.funds = funds;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isPublic = isPublic;
		this.state = state;
	}

	/** full constructor */
	public ProjectInfo(String name, String number, Integer masterId,
			String masterName, Integer enterpriseId, String enterpriseName,
			Double funds, String startDate, String endDate, Integer isPublic,
			Integer state, Set reProjectSoftwares, Set reSubprojectUsers,
			Set reSubprojectEnterprises, Set reProjectThesisUsers,
			Set reProjectUsers, Set reProjectThesises, Set reProjectDocuments,
			Set discussions, Set reProjectPatents, Set reProjectEnterprises,
			Set projectExtendInfos) {
		this.name = name;
		this.number = number;
		this.masterId = masterId;
		this.masterName = masterName;
		this.enterpriseId = enterpriseId;
		this.enterpriseName = enterpriseName;
		this.funds = funds;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isPublic = isPublic;
		this.state = state;
		this.reProjectSoftwares = reProjectSoftwares;
		this.reSubprojectUsers = reSubprojectUsers;
		this.reSubprojectEnterprises = reSubprojectEnterprises;
		this.reProjectThesisUsers = reProjectThesisUsers;
		this.reProjectUsers = reProjectUsers;
		this.reProjectThesises = reProjectThesises;
		this.reProjectDocuments = reProjectDocuments;
		this.discussions = discussions;
		this.reProjectPatents = reProjectPatents;
		this.reProjectEnterprises = reProjectEnterprises;
		this.projectExtendInfos = projectExtendInfos;
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

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getMasterId() {
		return this.masterId;
	}

	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}

	public String getMasterName() {
		return this.masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
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

	public Double getFunds() {
		return this.funds;
	}

	public void setFunds(Double funds) {
		this.funds = funds;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(Integer isPublic) {
		this.isPublic = isPublic;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Set getReProjectSoftwares() {
		return this.reProjectSoftwares;
	}

	public void setReProjectSoftwares(Set reProjectSoftwares) {
		this.reProjectSoftwares = reProjectSoftwares;
	}

	public Set getReSubprojectUsers() {
		return this.reSubprojectUsers;
	}

	public void setReSubprojectUsers(Set reSubprojectUsers) {
		this.reSubprojectUsers = reSubprojectUsers;
	}

	public Set getReSubprojectEnterprises() {
		return this.reSubprojectEnterprises;
	}

	public void setReSubprojectEnterprises(Set reSubprojectEnterprises) {
		this.reSubprojectEnterprises = reSubprojectEnterprises;
	}

	public Set getReProjectThesisUsers() {
		return this.reProjectThesisUsers;
	}

	public void setReProjectThesisUsers(Set reProjectThesisUsers) {
		this.reProjectThesisUsers = reProjectThesisUsers;
	}

	public Set getReProjectUsers() {
		return this.reProjectUsers;
	}

	public void setReProjectUsers(Set reProjectUsers) {
		this.reProjectUsers = reProjectUsers;
	}

	public Set getReProjectThesises() {
		return this.reProjectThesises;
	}

	public void setReProjectThesises(Set reProjectThesises) {
		this.reProjectThesises = reProjectThesises;
	}

	public Set getReProjectDocuments() {
		return this.reProjectDocuments;
	}

	public void setReProjectDocuments(Set reProjectDocuments) {
		this.reProjectDocuments = reProjectDocuments;
	}

	public Set getDiscussions() {
		return this.discussions;
	}

	public void setDiscussions(Set discussions) {
		this.discussions = discussions;
	}

	public Set getReProjectPatents() {
		return this.reProjectPatents;
	}

	public void setReProjectPatents(Set reProjectPatents) {
		this.reProjectPatents = reProjectPatents;
	}

	public Set getReProjectEnterprises() {
		return this.reProjectEnterprises;
	}

	public void setReProjectEnterprises(Set reProjectEnterprises) {
		this.reProjectEnterprises = reProjectEnterprises;
	}

	public Set getProjectExtendInfos() {
		return this.projectExtendInfos;
	}

	public void setProjectExtendInfos(Set projectExtendInfos) {
		this.projectExtendInfos = projectExtendInfos;
	}

}