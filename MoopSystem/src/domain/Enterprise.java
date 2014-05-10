package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Enterprise entity. @author MyEclipse Persistence Tools
 */

public class Enterprise implements java.io.Serializable {

	// Fields

	private Integer id;
	private String enterprise;
	private Set reProjectSoftwareUsers = new HashSet(0);
	private Set reProjectEnterprises = new HashSet(0);
	private Set reProjectPatentUsers = new HashSet(0);
	private Set users = new HashSet(0);
	private Set reSubprojectEnterprises = new HashSet(0);
	private Set reEnterpriseUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Enterprise() {
	}

	/** minimal constructor */
	public Enterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	/** full constructor */
	public Enterprise(String enterprise, Set reProjectSoftwareUsers,
			Set reProjectEnterprises, Set reProjectPatentUsers, Set users,
			Set reSubprojectEnterprises, Set reEnterpriseUsers) {
		this.enterprise = enterprise;
		this.reProjectSoftwareUsers = reProjectSoftwareUsers;
		this.reProjectEnterprises = reProjectEnterprises;
		this.reProjectPatentUsers = reProjectPatentUsers;
		this.users = users;
		this.reSubprojectEnterprises = reSubprojectEnterprises;
		this.reEnterpriseUsers = reEnterpriseUsers;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	public Set getReProjectSoftwareUsers() {
		return this.reProjectSoftwareUsers;
	}

	public void setReProjectSoftwareUsers(Set reProjectSoftwareUsers) {
		this.reProjectSoftwareUsers = reProjectSoftwareUsers;
	}

	public Set getReProjectEnterprises() {
		return this.reProjectEnterprises;
	}

	public void setReProjectEnterprises(Set reProjectEnterprises) {
		this.reProjectEnterprises = reProjectEnterprises;
	}

	public Set getReProjectPatentUsers() {
		return this.reProjectPatentUsers;
	}

	public void setReProjectPatentUsers(Set reProjectPatentUsers) {
		this.reProjectPatentUsers = reProjectPatentUsers;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Set getReSubprojectEnterprises() {
		return this.reSubprojectEnterprises;
	}

	public void setReSubprojectEnterprises(Set reSubprojectEnterprises) {
		this.reSubprojectEnterprises = reSubprojectEnterprises;
	}

	public Set getReEnterpriseUsers() {
		return this.reEnterpriseUsers;
	}

	public void setReEnterpriseUsers(Set reEnterpriseUsers) {
		this.reEnterpriseUsers = reEnterpriseUsers;
	}

}