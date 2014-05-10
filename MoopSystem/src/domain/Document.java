package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Document entity. @author MyEclipse Persistence Tools
 */

public class Document implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String name;
	private String keyWords;
	private String abstract_;
	private String author;
	private Set reProjectDocuments = new HashSet(0);
	private Set reProjectDocumentUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Document() {
	}

	/** minimal constructor */
	public Document(User user, String name, String keyWords, String abstract_,
			String author) {
		this.user = user;
		this.name = name;
		this.keyWords = keyWords;
		this.abstract_ = abstract_;
		this.author = author;
	}

	/** full constructor */
	public Document(User user, String name, String keyWords, String abstract_,
			String author, Set reProjectDocuments, Set reProjectDocumentUsers) {
		this.user = user;
		this.name = name;
		this.keyWords = keyWords;
		this.abstract_ = abstract_;
		this.author = author;
		this.reProjectDocuments = reProjectDocuments;
		this.reProjectDocumentUsers = reProjectDocumentUsers;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Set getReProjectDocuments() {
		return this.reProjectDocuments;
	}

	public void setReProjectDocuments(Set reProjectDocuments) {
		this.reProjectDocuments = reProjectDocuments;
	}

	public Set getReProjectDocumentUsers() {
		return this.reProjectDocumentUsers;
	}

	public void setReProjectDocumentUsers(Set reProjectDocumentUsers) {
		this.reProjectDocumentUsers = reProjectDocumentUsers;
	}

}