import java.util.ArrayList;

public abstract class ChronoTimer {

	protected ArrayList<Racer> participants;
	protected Time timer;

	public static void power() {

	}

	public abstract void toggle(int channel);

	public abstract void trigger(int channel);

	public abstract void swap();

	public static void keypad(int number) {

	}

}
