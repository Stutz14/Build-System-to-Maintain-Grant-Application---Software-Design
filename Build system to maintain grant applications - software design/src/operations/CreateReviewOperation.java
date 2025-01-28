package operations;

import labTest1.*;


public class CreateReviewOperation implements IReviewOperation {

	@Override
	public Application performReviewOperation(Application anApplication, User aUser) {
		
		return createANewReview(anApplication, aUser);
	}
	

	public Application createANewReview(Application anApplication, User aUser) {
		float theScore = 0;
		
		if(anApplication.getReviewers().contains(aUser)) {
			Review aNewReview = new Review();
			aNewReview.setReviewer(aUser);
			IScoreOperation scoreOperation = new AssignScoreForReviewOperation();
			theScore = scoreOperation.assignScore(anApplication, aUser);
			aNewReview.setScore(theScore);
			anApplication.getReviews().add(aNewReview);	
		}
		else {
			System.out.println("Review can not be perfomed by a non-reviewer");
		}
		
		return anApplication;
	}

}
