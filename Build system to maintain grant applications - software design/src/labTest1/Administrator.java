package labTest1;

import operations.AssignReviewerOperation;
import operations.AssignScoreForApplicationOperation;
import operations.IAdminAppMgmtOperation;
import operations.IScoreOperation;

public class Administrator extends User {

	private IAdminAppMgmtOperation assignReviewerStrategy;
	private IScoreOperation finalScoreStrategy;
	
	public Administrator(String firstName, String lastName, String uniqueId) {
		super(firstName, lastName, uniqueId);
		// TODO Auto-generated constructor stub
	}
	
	public Application assignReviewerToApplication(Application app, Researcher aUser) {
		
		assignReviewerStrategy = new AssignReviewerOperation();
		
		app = assignReviewerStrategy.assignReviewer(app, this, aUser);
		
		return app;
		
	}
	
	
public float getFinalScoreForApplication(Application app) {
		
		finalScoreStrategy = new AssignScoreForApplicationOperation();
		
		float result = finalScoreStrategy.assignScore(app, this);
		
		
		return result;
		
	}
}
