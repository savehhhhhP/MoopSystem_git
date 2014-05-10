package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Post entity. @author MyEclipse Persistence Tools
 */

public class Post implements java.io.Serializable {

	// Fields

	private Integer id;
	private Discussion discussion;
	private Integer userId;
	private Integer replyCount;
	private String topic;
	private String postContent;
	private String postExpression;
	private String postTime;
	private Integer clickCount;
	private Set replies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Post() {
	}

	/** minimal constructor */
	public Post(Discussion discussion, Integer userId, Integer replyCount,
			String topic, String postContent, String postExpression,
			String postTime, Integer clickCount) {
		this.discussion = discussion;
		this.userId = userId;
		this.replyCount = replyCount;
		this.topic = topic;
		this.postContent = postContent;
		this.postExpression = postExpression;
		this.postTime = postTime;
		this.clickCount = clickCount;
	}

	/** full constructor */
	public Post(Discussion discussion, Integer userId, Integer replyCount,
			String topic, String postContent, String postExpression,
			String postTime, Integer clickCount, Set replies) {
		this.discussion = discussion;
		this.userId = userId;
		this.replyCount = replyCount;
		this.topic = topic;
		this.postContent = postContent;
		this.postExpression = postExpression;
		this.postTime = postTime;
		this.clickCount = clickCount;
		this.replies = replies;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Discussion getDiscussion() {
		return this.discussion;
	}

	public void setDiscussion(Discussion discussion) {
		this.discussion = discussion;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getReplyCount() {
		return this.replyCount;
	}

	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getPostContent() {
		return this.postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostExpression() {
		return this.postExpression;
	}

	public void setPostExpression(String postExpression) {
		this.postExpression = postExpression;
	}

	public String getPostTime() {
		return this.postTime;
	}

	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}

	public Integer getClickCount() {
		return this.clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	public Set getReplies() {
		return this.replies;
	}

	public void setReplies(Set replies) {
		this.replies = replies;
	}

}