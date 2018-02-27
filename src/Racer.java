/**
 * @author bshepard Racers has 3 fields: name, startTime and endTime
 */
public class Racer {

	private String name;
	private double startTime, endTime;

	public Racer() {
		this(null);
	}

	public Racer(String name) {
		this.name = name;
		startTime = endTime = -1;
	}

	public void setName(String racername) {
		name = racername;
	}

	public void startRace(double time) {
		startTime = time;
	}

	public void finishRace(double time) {
		endTime = time;
	}

	public double timeResult() {
		return endTime - startTime;
	}

	public String formattedResults() {
		return name + " " + Double.toString(endTime - startTime);
	}

}
