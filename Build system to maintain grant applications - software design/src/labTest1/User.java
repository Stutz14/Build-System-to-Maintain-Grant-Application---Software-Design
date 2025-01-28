package labTest1;

import java.util.List;

import operations.CreateReviewOperation;
import operations.IReviewOperation;

public abstract class User {
	
	public User(String firstName, String lastName, String uniqueId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.uniqueId = uniqueId;
	}
	
	
	private String firstName;
	private String lastName;
	private String uniqueId;
	private List<Team> belongsToTeam;
	private List<Application> isReviewerToApplication;
	private IReviewOperation reviewStrategy;
	
	public Application ReviewApp(Application app) {
		
		if(reviewStrategy == null) {
			reviewStrategy  = new CreateReviewOperation();
		}
		app = reviewStrategy.performReviewOperation(app, this);
		return app;
		
	}
	
	public IReviewOperation getReviewStrategy() {
		return reviewStrategy;
	}
	public void setReviewStrategy(IReviewOperation reviewStrategy) {
		this.reviewStrategy = reviewStrategy;
	}
	public List<Team> getBelongsToTeam() {
		return belongsToTeam;
	}
	public void setBelongsToTeam(List<Team> belongsToTeam) {
		this.belongsToTeam = belongsToTeam;
	}
	public List<Application> getIsReviewerToApplication() {
		return isReviewerToApplication;
	}
	public void setIsReviewerToApplication(List<Application> isReviewerToApplication) {
		this.isReviewerToApplication = isReviewerToApplication;
	}


	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	

}
