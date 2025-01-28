package labTest1;

import operations.*;

public class Researcher extends User {

	private ICreateApplication applCreationStrategy;
	private ITeamMgmtOperation teamManagementStrategy;
	
	

	public ITeamMgmtOperation getTeamManagementStrategy() {
		return teamManagementStrategy;
	}

	public void setTeamManagementStrategy(ITeamMgmtOperation teamManagementStrategy) {
		this.teamManagementStrategy = teamManagementStrategy;
	}

	private Boolean isLead;

	public ICreateApplication getApplCreationStrategy() {
		return applCreationStrategy;
	}

	public void setApplCreationStrategy(ICreateApplication applCreationStrategy) {
		this.applCreationStrategy = applCreationStrategy;
	}

	public Boolean getIsLead() {
		return isLead;
	}

	public void setIsLead(Boolean isLead) {
		this.isLead = isLead;
	}

	public Researcher(String firstName, String lastName, String uniqueId) {
		super(firstName, lastName, uniqueId);
		// TODO Auto-generated constructor stub
	}
	
	public Application createAnApplication(String name, String appID, Team theTeam, Administrator admin) {
		applCreationStrategy = new CreateApplicationOperation();
		Application theNewApplication = applCreationStrategy.performCreateApplication(this, theTeam, name, appID, admin);
		return theNewApplication;
	}
	
	public Team addTeamMember(Team theTeam, Researcher aResearcher) {
		ITeamMgmtOperation newOp = new AddTeamMemberOperation();
		teamManagementStrategy = newOp;
		
		theTeam = teamManagementStrategy.performTeamOperation(theTeam, aResearcher, this);
		return theTeam;
	}
	
	public Team removeTeamMember(Team theTeam, Researcher aResearcher) {
		ITeamMgmtOperation newOp = new RemoveTeamMemberOperation();
		teamManagementStrategy = newOp;
		
		theTeam = teamManagementStrategy.performTeamOperation(theTeam, aResearcher, this);
		return theTeam;
	}

}
