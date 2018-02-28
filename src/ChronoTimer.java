import java.util.ArrayList;

public abstract class ChronoTimer {

	protected ArrayList<Racer> participants;
	protected Time timer;
	int ch1 = 1;
	int ch2 = 2;
	int ch3 = 3;
	int ch4 = 4;

	public static void power() {
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
			start();
		}
		else if (channel == 2)
		{
			finish();
		}
	}

	public void swap() {
		//swap positions of the racers
	}

	public void keypad(int number) {

	}
	
	public void start() {
		//trigger on channel 1
		//send current time to the printer
		//print time /t trig ch#
	}
	
	public void finish() {
		//trigger on channel 2
		//send current time to the printer
	}

	public void exit() {
		//stop the time and exit the simulation?
	}
}
