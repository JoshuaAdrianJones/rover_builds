package rover_positioning;

//rover class
public class Rover{
//defines rovers traveling around in mission space
	
	//rover state properties
	private int start_rover_x;//start x coordinate of rover
	private int start_rover_y;//start y coordinate of rover
	private char start_rover_dir;//final direction rover is facing (N,W,S,E)
	//private int start_rover_z;//start elevation of rover
	private String end_rover;//end rover final position
	//rover state properties

	//rover mission info properties
	private String mission_order;//order given to individual rover
	
	private int rover_distance;//Traveled along paths
	//	private int rover_distance_absolute;//actual distance from start point
	//rover mission info properties
	
	//rover cam properties
	//	private int rover_cam_FOV;//field of vision for camera in degrees (wide or narrow)
	//	private int rover_cam_height;//rover elevation + some assumed height
	//	private int rover_cam_vision;//what the rover can see.
	//	array showing co-ordinates rover can see if fov is narrow
	//	then can only see direct line, if wide, can see 2 diagonally either side (3 points max)
	//rover cam properties
	public  void setStartCo(String co_ordinates) {
		
		String[] splitArray = co_ordinates.split("\\s+");
		start_rover_x =  Integer.parseInt(splitArray[0]);
		start_rover_y =  Integer.parseInt(splitArray[1]);
		start_rover_dir =(splitArray[2]).charAt(0);
	}

	public  int[] getStartCo() {
		int[] start_pos ={start_rover_x,start_rover_y};
		return start_pos;
	}
	public char getStartDir(){
		return start_rover_dir;
	}
	
	public  String getMissionOrder() {
		return mission_order;
	}
	public  void setMissionOrder(String MissionOrder) {
		mission_order = MissionOrder;
	}
	public  String getEnd() {	
		return end_rover;
	}
	
	public  void setEnd(int[] pos, char c, String move) {
		//takes the details of the rover and calculates the endpoint
		char[] splitArray = move.toCharArray();//splits the move order up
		int x = pos[0];//separates the array into local variables
		int y = pos[1];
		char dir = c;//creates a local variable for the direction

		for (int i=0;i<splitArray.length;i++){
			//System.out.println(splitArray[i]);
			//update the co-ordinates and direction after each move order
			if (splitArray[i]=='M'){
				//System.out.println("move forward order detected");
				if (dir == 'N'){
					y +=1;
				}
				else if (dir == 'E'){
					x +=1;
				}
				else if (dir == 'S'){
					y -=1;
				}
				else if (dir == 'W'){
					x -=1;
				}
			}
			else if(splitArray[i]=='L'){
				//System.out.println("move left order detected");
				if (dir == 'N'){
					dir ='W';
				}
				else if (dir == 'E'){
					dir ='N';
				}
				else if (dir == 'S'){
					dir ='E';
				}
				else if (dir == 'W'){
					dir ='S';
				}
			} 
			else if(splitArray[i]=='R'){
				//System.out.println("move right order detected");	
				if (dir == 'N'){
					dir ='E';
				}
				else if (dir == 'E'){
					dir ='S';
				}
				else if (dir == 'S'){
					dir ='W';
				}
				else if (dir == 'W'){
					dir ='N';
				}
			}
			
				end_rover = Integer.toString(x)+" "+Integer.toString(y)+" "+Character.toString(dir);
			
		}		
	}

	public void calculateDistance(String missionOrder) {
		rover_distance = missionOrder.length() - missionOrder.replace("M", "").length();
	}
	public int getDistance(){return rover_distance;}
}