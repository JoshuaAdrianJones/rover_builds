package rover_positioning;

public class Planet{
	 //prototype properties for all classes
	
	 private int number_of_missions;//planet class property
	 private int number_of_rovers;//mission space class property
	 private String plateau;//dimensions of the mission space
	 //prototype properties for all classes

	 //methods
	 public void setNumberofMissions(int num) {
		number_of_missions = num;
		
		}
	 public void setNumberofRovers(int numberOfRovers) {
		 number_of_rovers = numberOfRovers;
	}
	 
	public int getNumberOfMissions(){
		 return number_of_missions;
	 }
	public int getNumberOfRovers(){
		return number_of_rovers;
	}
	
	public void setMissionSpace(String a){
		plateau = a;
	}
	
	public String getMissionSpace(){
		return plateau;
	}
	//methods
	//what if there's multiple mission spaces and multiple rovers?
	//private MissionSpace[] missionspaces;//array of mission spaces operating on the planet
	
	//planet properties
	//private int numberOfMissionSpaces;//the number of missions occurring on the planet
	//planet properties

	//planet methods
//	public  int  getNumberOfMissions() {
//		
//		return numberOfMissionSpaces;
//	}
	//planet methods
	
	//planet constructor
	public Planet(int num){
		number_of_missions = num;//constructor sets the number of mission
									//spaces when the object is first created.
	}//planet constructor
}