package labTest1;

import java.util.*;

public class Application {

	private Team appliedByTeam;
	private List<Review> reviews;
	private String ApplicationID;
	private List<Researcher> reviewers;
	private float totalScore;
	private Administrator hasAdministrator;
	

	public Administrator getHasAdministrator() {
		return hasAdministrator;
	}

	public void setHasAdministrator(Administrator hasAdministrator) {
		this.hasAdministrator = hasAdministrator;
	}

	public Application(Team appliedByTeam, List<Review> reviews, String applicationID, List<Researcher> reviewers,
			float totalScore, Administrator anAdmin) {
		super();
		this.appliedByTeam = appliedByTeam;
		this.reviews = reviews;
		ApplicationID = applicationID;
		this.reviewers = reviewers;
		this.totalScore = totalScore;
		this.hasAdministrator = anAdmin;
	}
	
	public float getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(float totalScore) {
		this.totalScore = totalScore;
	}

	public List<Researcher> getReviewers() {
		return reviewers;
	}

	public void setReviewers(List<Researcher> reviewers) {
		this.reviewers = reviewers;
	}

	public String getApplicationID() {
		return ApplicationID;
	}

	public void setApplicationID(String applicationID) {
		ApplicationID = applicationID;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}


	
	public Team getAppliedByTeam() {
		return appliedByTeam;
	}

	public void setAppliedByTeam(Team appliedByTeam) {
		this.appliedByTeam = appliedByTeam;
	}
	
}
