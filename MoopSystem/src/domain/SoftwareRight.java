package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * SoftwareRight entity. @author MyEclipse Persistence Tools
 */

public class SoftwareRight implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String softwareName;
	private String applyDate;
	private String abstract_;
	private String keyWords;
	private String author;
	private Set reProjectSoftwares = new HashSet(0);

	// Constructors

	/** default constructor */
	public SoftwareRight() {
	}

	/** minimal constructor */
	public SoftwareRight(User user, String softwareName, String applyDate,
			String abstract_, String keyWords, String author) {
		this.user = user;
		this.softwareName = softwareName;
		this.applyDate = applyDate;
		this.abstract_ = abstract_;
		this.keyWords = keyWords;
		this.author = author;
	}

	/** full constructor */
	public SoftwareRight(User user, String softwareName, String applyDate,
			String abstract_, String keyWords, String author,
			Set reProjectSoftwares) {
		this.user = user;
		this.softwareName = softwareName;
		this.applyDate = applyDate;
		this.abstract_ = abstract_;
		this.keyWords = keyWords;
		this.author = author;
		this.reProjectSoftwares = reProjectSoftwares;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSoftwareName() {
		return this.softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public String getKeyWords() {
		return this.keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Set getReProjectSoftwares() {
		return this.reProjectSoftwares;
	}

	public void setReProjectSoftwares(Set reProjectSoftwares) {
		this.reProjectSoftwares = reProjectSoftwares;
	}

}