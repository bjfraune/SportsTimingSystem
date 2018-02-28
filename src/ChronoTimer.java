import java.util.ArrayList;

public class ChronoTimer {

	private ArrayList<Racer> participants;
	private Time timer;
	int ch1 = 0,ch2 = 0,ch3 = 0,ch4 = 0;
	public ChronoTimer(){
		participants = new ArrayList<Racer>();
		timer = new Time();
	}
	public void power() {
		//Starts the clock

	}
	
	public void reset() {
		//start the clock over
		//call start again?
	}
	
	public void time() {
		
	}
	
	public void dnf() {
		
	}
	
	public void cancel() {
		
	}

	public void toggle(int channel) {
		
	}

	public void trigger(int channel) {
		if (channel == 1)
		{
			//call printer with channel from here
		
		}
		else if (channel == 2)
		{
			
		}
	}

	public void swap() {
		//swap positions of the racers
	}

	public void keypad(int number) {

	}
	

	public void exit() {
		//stop the time and exit the simulation?
	}
}
