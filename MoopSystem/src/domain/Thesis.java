package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Thesis entity. @author MyEclipse Persistence Tools
 */

public class Thesis implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer authorId;
	private String author;
	private String topic;
	private String organization;
	private String publishDate;
	private Integer pagination;
	private String absract;
	private String keyWords;
	private Set reProjectThesises = new HashSet(0);
	private Set reProjectThesisUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Thesis() {
	}

	/** minimal constructor */
	public Thesis(Integer authorId, String author, String topic,
			String organization, String publishDate, Integer pagination,
			String absract, String keyWords) {
		this.authorId = authorId;
		this.author = author;
		this.topic = topic;
		this.organization = organization;
		this.publishDate = publishDate;
		this.pagination = pagination;
		this.absract = absract;
		this.keyWords = keyWords;
	}

	/** full constructor */
	public Thesis(Integer authorId, String author, String topic,
			String organization, String publishDate, Integer pagination,
			String absract, String keyWords, Set reProjectThesises,
			Set reProjectThesisUsers) {
		this.authorId = authorId;
		this.author = author;
		this.topic = topic;
		this.organization = organization;
		this.publishDate = publishDate;
		this.pagination = pagination;
		this.absract = absract;
		this.keyWords = keyWords;
		this.reProjectThesises = reProjectThesises;
		this.reProjectThesisUsers = reProjectThesisUsers;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public Integer getPagination() {
		return this.pagination;
	}

	public void setPagination(Integer pagination) {
		this.pagination = pagination;
	}

	public String getAbsract() {
		return this.absract;
	}

	public void setAbsract(String absract) {
		this.absract = absract;
	}

	public String getKeyWords() {
		return this.keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public Set getReProjectThesises() {
		return this.reProjectThesises;
	}

	public void setReProjectThesises(Set reProjectThesises) {
		this.reProjectThesises = reProjectThesises;
	}

	public Set getReProjectThesisUsers() {
		return this.reProjectThesisUsers;
	}

	public void setReProjectThesisUsers(Set reProjectThesisUsers) {
		this.reProjectThesisUsers = reProjectThesisUsers;
	}

}