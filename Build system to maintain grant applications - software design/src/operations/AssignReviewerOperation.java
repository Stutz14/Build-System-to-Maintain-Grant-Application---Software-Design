package operations;

import java.util.ArrayList;

import labTest1.*;


public class AssignReviewerOperation implements IAdminAppMgmtOperation {



	@Override
	public Application assignReviewer(Application anApplication, Administrator admin, Researcher aResearcher) {
		if (anApplication != null) {
			anApplication.getReviewers().add(aResearcher);
			if(aResearcher.getIsReviewerToApplication() == null) {
				aResearcher.setIsReviewerToApplication(new ArrayList<Application>());
			}
			aResearcher.getIsReviewerToApplication().add(anApplication);
			anApplication.getReviewers().add(aResearcher);
		}
		else {
			System.out.println("Cannot add reviewer to a null application");
		}
		return anApplication;
	}

}
