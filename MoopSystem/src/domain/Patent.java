package domain;

/**
 * Patent entity. @author MyEclipse Persistence Tools
 */

public class Patent implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String patentNum;
	private String applyDate;
	private String author;
	private String keyWords;
	private String abstract_;
	private String organization;

	// Constructors

	/** default constructor */
	public Patent() {
	}

	/** full constructor */
	public Patent(User user, String patentNum, String applyDate, String author,
			String keyWords, String abstract_, String organization) {
		this.user = user;
		this.patentNum = patentNum;
		this.applyDate = applyDate;
		this.author = author;
		this.keyWords = keyWords;
		this.abstract_ = abstract_;
		this.organization = organization;
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

	public String getPatentNum() {
		return this.patentNum;
	}

	public void setPatentNum(String patentNum) {
		this.patentNum = patentNum;
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

	public String getKeyWords() {
		return this.keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

}