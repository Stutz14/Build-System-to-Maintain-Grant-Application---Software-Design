package labTest1;

import java.util.*;

public class Team {
	
	public Team(String teamId, Researcher hasLeader) {
		super();
		TeamId = teamId;
		this.hasLeader = hasLeader;
		ArrayList<Researcher> members = new ArrayList<Researcher>();
		members.add(hasLeader);
		this.setHasMembers(members);
	}
	private String TeamId;
	private Researcher hasLeader;
	private List<Researcher> hasMembers;
	private List<Application> appliesFor;
	
	
	
	public String getTeamId() {
		return TeamId;
	}
	public void setTeamId(String teamId) {
		TeamId = teamId;
	}
	public Researcher getHasLeader() {
		return hasLeader;
	}
	public void setHasLeader(Researcher hasLeader) {
		this.hasLeader = hasLeader;
	}

	
	
	public List<Researcher> getHasMembers() {
		return hasMembers;
	}
	public void setHasMembers(List<Researcher> hasMembers) {
		this.hasMembers = hasMembers;
	}
	public List<Application> getAppliesFor() {
		return appliesFor;
	}
	public void setAppliesFor(List<Application> appliesFor) {
		this.appliesFor = appliesFor;
	}

	

}
