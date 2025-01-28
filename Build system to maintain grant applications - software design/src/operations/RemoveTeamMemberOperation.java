package operations;

import labTest1.Researcher;
import labTest1.Team;

public class RemoveTeamMemberOperation implements ITeamMgmtOperation {
	
	public Team performTeamOperation(Team theTeam, Researcher aResearcher, Researcher lead) {
	
	if(theTeam.getHasLeader().equals(lead)) {
		theTeam.getHasMembers().remove(aResearcher);
	}
	else {
		System.out.println("New members can be removed only by the leader of the team\n");
	}
	
	return theTeam;
}

}
