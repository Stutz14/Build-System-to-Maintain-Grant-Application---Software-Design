package operations;

import labTest1.*;


public class AssignScoreForApplicationOperation implements IScoreOperation {

	@Override
	public float assignScore(Application anApplication, User aUser) {
		// TODO Auto-generated method stub
		return calculateTotalScoreForApplication(anApplication, aUser);
	}
	
	private float calculateTotalScoreForApplication(Application anApplication, User aUser) {
		
		float total = 0;
		float result = 0;
		
		if(!anApplication.getHasAdministrator().equals(aUser)) {
			System.out.println("A non member can not calculate the final score \n");
		}
		
		for(Review review : anApplication.getReviews()){
			
		
			total = total + review.getScore();
			result = total/anApplication.getReviews().size();
		}
		System.out.println("There are " + anApplication.getReviews().size() + " Reviews for " + anApplication.getApplicationID());
		System.out.println("Total is " + total);
		for(Review rev : anApplication.getReviews()) {
			System.out.println("Reviewer is :" + rev.getReviewer().getUniqueId());
		}
		return result;	
	}

}
