package operations;

import java.util.Scanner;

import labTest1.*;


public class AssignScoreForReviewOperation implements IScoreOperation {

	@Override
	public float assignScore(Application anApplication, User aUser) {
		return calculateScoreForReview(anApplication, aUser);
	}


	private float calculateScoreForReview(Application anApplication, User aUser) {
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter score 0-10 for application " + anApplication.getApplicationID() 
							+ " by reviewer " + aUser.getUniqueId() + ": ");
		float score= sc.nextFloat();
		
		
		return score;
		
	}


}
