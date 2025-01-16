//they are powerful tools in java used to store constants eg seasons,directions,months,days
//they store a collection of realated constants
public class TrafficLightState{
	public static void main(String[]args){
		enum TrafficLight{RED,YELLOW,GREEN;}//primitivie datatypr
		TrafficLight currentLight=TrafficLight.RED;
		switch(currentLight){
			case RED:
				System.out.println("Stop");
			break;
			case YELLOW:
				System.out.println("Prepare to stop");
			break;
			case GREEN:
				System.out.println("Go");
			break;	
		}
	}
}