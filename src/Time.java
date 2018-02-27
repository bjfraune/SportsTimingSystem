import java.time.format.DateTimeFormatter;
// NEED TO USE DATE API TO BUILD TIME CLASS
public class Time {
	private Time currentTime;
	private final DateTimeFormatter formatTime=DateTimeFormatter.ofPattern("HH:mm:ss.SSS");;
	
	public void setTime(Time time){
		currentTime = time;
	}
	public Time getTime(){
		return currentTime;
	}
	public String time2formattedString(Time time){
		return time.formatTime.toString();
	}
	
}