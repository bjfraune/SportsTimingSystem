import java.time.LocalTime;

/**
 * @author bshepard Racers has 3 fields: name, startTime and endTime
 */
public class Racer {

	int bibNum;
	LocalTime startTime, endTime;
	
	public Racer(){
		startTime = endTime = null;
	}
	public void setBib(String name) {
		this.bibNum = Integer.parseInt(name);	
	}

	public void startRace(LocalTime time) {
		startTime = time;
	}

	public void finishRace(LocalTime time) {
		endTime = time;
	}



}