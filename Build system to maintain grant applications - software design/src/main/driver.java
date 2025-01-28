package main;

import java.util.ArrayList;

import labTest1.*;
import operations.*;

public class driver {

	public static void main(String[] args) {
		Administrator admin1 = new Administrator("John", "Smith", "001");
		Administrator admin2 = new Administrator("John", "Smith", "002");
		Researcher univ1 = new Researcher("Kostas", "K", "002a");
		Researcher univ2 = new Researcher("Kostas", "A", "003");
		Researcher univ3 = new Researcher("Kostas", "B", "004");
		Researcher univ4 = new Researcher("Kostas", "C", "005");
		Researcher univ5 = new Researcher("Kostas", "D", "006");
		Researcher univ6 = new Researcher("Kostas", "E", "007");
		Researcher ind1 = new Researcher("Kostas", "F", "008");
		Researcher ind2 = new Researcher("Kostas", "G", "009");	
		Researcher ind3 = new Researcher("Kostas", "H", "010");	
		Researcher ind4 = new Researcher("Kostas", "I", "011");	
		Researcher ind5 = new Researcher("Kostas", "J", "012");	
		Researcher ind6 = new Researcher("Kostas", "K", "013");
		
		Team team1 = new Team("T1", univ1);
		
	
		Team team2 = new Team("T2", univ6);
		
		
		Application app1 = univ1.createAnApplication("APP1 NAME", "app1", team1, admin1);
		Application app2 = univ6.createAnApplication("APP1 NAME", "app2", team2, admin2);
		// univ1 not a leader in team2
		Application app3 = univ1.createAnApplication("APP1 NAME", "app1", team2, admin1);
		
		
		team1 = univ1.addTeamMember(team1, univ2);
		team1 = univ1.addTeamMember(team1, univ3);
		team2 = univ6.addTeamMember(team2, univ4);
		team2 = univ6.addTeamMember(team2, univ5);
		
		//univ1 not a leader in team2
		team2 = univ1.addTeamMember(team2, univ2);
		
		admin1.assignReviewerToApplication(app1, ind5);
		admin1.assignReviewerToApplication(app1, ind3);
		admin1.assignReviewerToApplication(app1, univ1);
		admin1.assignReviewerToApplication(app2, univ1);
		admin1.assignReviewerToApplication(app2, univ2);
		admin1.assignReviewerToApplication(app2, univ6);
		
		ind5.ReviewApp(app1);
		ind3.ReviewApp(app1);
		univ1.ReviewApp(app2);
		univ2.ReviewApp(app2);
		
		float score1 = admin1.getFinalScoreForApplication(app1);
		float score2 = admin2.getFinalScoreForApplication(app2);
		
		
		
		System.out.println("Scores are " + score1 + " " + score2);
		

		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
