package operations;

import java.util.*;

import labTest1.*;

public class CreateApplicationOperation implements ICreateApplication {

	@Override
	public Application performCreateApplication(Researcher lead, Team theTeam, String name, String appID, Administrator admin) {
		
		Application aNewApplication = null;

		if (lead.equals(theTeam.getHasLeader())) {

			ArrayList<Researcher> reviewers = new ArrayList<Researcher>();
			reviewers.add(theTeam.getHasLeader());

			ArrayList<Review> reviews = new ArrayList<Review>();

			aNewApplication = new Application(theTeam, reviews, appID, reviewers, 0, admin);

			
		}
		else {
			System.out.println("A non leader cannot create a new application");
		
		}
		
		return aNewApplication;

	}

}
