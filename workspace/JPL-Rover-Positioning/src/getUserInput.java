import java.util.Scanner;
import java.util.Arrays;
//import java.awt.Point;

public abstract class getUserInput {

	 
	{	// TODO Auto-generated method stub
		System.out.println("Enter Mission Space Size:"); //prompts the user to enter the mission space size
		
		Scanner missionSpaceInput = new Scanner(System.in);//sets up the scanner to take user input
		String missionSpaceXY = missionSpaceInput.nextLine();//tells the scanner to take the next line of input as string.
		missionSpaceInput.close();//closes the scanner

		System.out.println("Mission Space is: " + missionSpaceXY);//prints the value to console
		String[] splitArray = missionSpaceXY.split("\\s+");//splits the string into an array

		
		//convert array items to their proper data types
		int x = Integer.parseInt(splitArray[0]);
		int y = Integer.parseInt(splitArray[1]);
		char dir = splitArray[2].charAt(0);
        //convert array items to their proper data types
		
		//print user output
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(dir);
		
		int [ ] [ ] missionSpace = new int [x][2] ;
		
		System.out.println(Arrays.deepToString(missionSpace));
		
	}

	
}