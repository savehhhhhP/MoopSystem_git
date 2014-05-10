package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * UserCategory entity. @author MyEclipse Persistence Tools
 */

public class UserCategory implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public UserCategory() {
	}

	/** minimal constructor */
	public UserCategory(String name) {
		this.name = name;
	}

	/** full constructor */
	public UserCategory(String name, Set users) {
		this.name = name;
		this.users = users;
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

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}