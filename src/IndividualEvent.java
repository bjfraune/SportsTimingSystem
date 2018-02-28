import java.time.LocalTime;

public class IndividualEvent {
	Racer[] participants;
	
	public IndividualEvent(){
		participants = new Racer[3];
	}
	public void addRacer(String name){
		int racerSlot = Integer.parseInt(name);
		participants[racerSlot] = new Racer(name);
	}

	public void trigger(int channel, int racerslot, LocalTime time) {
		Racer x;
		if(channel % 2 == 1){	// odd means start time
			x = participants[racerslot];
			x.startRace(time);
		}
		else
			x = participants[racerslot];
			x.finishRace(time);
	}
}