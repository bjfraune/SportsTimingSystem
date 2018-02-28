import java.time.LocalTime;

public class ChronoTimer {
	
	Time time;
	IndividualEvent indEvent;
	boolean power= false;
	int ch1 = 1;
	int ch2 = 2;
	int ch3 = 3;
	int ch4 = 4;

	public void power() {
		power = !power;
		if(power){ 
			LocalTime t = LocalTime.now();
			time.setTime(t.getHour(), t.getMinute(), t.getSecond(), t.getNano());
		}
		
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

	public void trigger(String tokens) {
		int channel = Integer.parseInt(tokens);
		switch(tokens){
		case "1" :
			indEvent.trigger(channel, 1, time.getCurrentSetTime());
			break;
		case "2" :
			indEvent.trigger(channel, 1, time.getCurrentSetTime());
			break;
		case "3" :
			indEvent.trigger(channel, 2, time.getCurrentSetTime());
			break;
		case "4" :
			indEvent.trigger(channel, 2, time.getCurrentSetTime());
			break;
		}
	}
	public void print(){
		//TODO Process all racers and print their times
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

	public void initiateNewEvent() {
		indEvent = new IndividualEvent();
		
	}

	public void toggle(String name) {
		indEvent.addRacer(name);
		
	}

	public void setBib(String string, int i) {
		indEvent.participants[i].setBib(string);
	}
}