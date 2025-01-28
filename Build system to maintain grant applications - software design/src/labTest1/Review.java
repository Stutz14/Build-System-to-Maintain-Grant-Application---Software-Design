package labTest1;

public class Review {
	
	private Application reviewForApplication;
	private float score;
	private User reviewer;
	
	
	public Application getReviewForApplication() {
		return reviewForApplication;
	}
	public void setReviewForApplication(Application reviewForApplication) {
		this.reviewForApplication = reviewForApplication;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public User getReviewer() {
		return reviewer;
	}
	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}

}
