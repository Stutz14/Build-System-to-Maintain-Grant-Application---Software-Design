package operations;

import labTest1.Researcher;
import labTest1.Team;

public class AddTeamMemberOperation implements ITeamMgmtOperation {

	@Override
	public Team performTeamOperation(Team theTeam, Researcher aResearcher, Researcher lead) {
		
		if(theTeam.getHasLeader().equals(lead)) {
			theTeam.getHasMembers().add(aResearcher);
		}
		else {
			System.out.println("New members can be added only by the lead of the team\n");
		}
		
		return theTeam;
	}

}
