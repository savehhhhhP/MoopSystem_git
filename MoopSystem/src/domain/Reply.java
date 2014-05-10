package domain;

/**
 * Reply entity. @author MyEclipse Persistence Tools
 */

public class Reply implements java.io.Serializable {

	// Fields

	private Integer id;
	private Post post;
	private User user;
	private String replyContent;
	private String replyExpression;
	private String replyTime;

	// Constructors

	/** default constructor */
	public Reply() {
	}

	/** full constructor */
	public Reply(Post post, User user, String replyContent,
			String replyExpression, String replyTime) {
		this.post = post;
		this.user = user;
		this.replyContent = replyContent;
		this.replyExpression = replyExpression;
		this.replyTime = replyTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getReplyContent() {
		return this.replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyExpression() {
		return this.replyExpression;
	}

	public void setReplyExpression(String replyExpression) {
		this.replyExpression = replyExpression;
	}

	public String getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}

}