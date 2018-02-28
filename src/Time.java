import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 * @author BS
 * Lets the user set a current time and retrieve updated time
 */
public class Time {
	private LocalTime currentTime, userTime;
	private final DateTimeFormatter formatTime=DateTimeFormatter.ofPattern("HH:mm:ss.SS");;
	/**
	 * Lets the user set a new local time
	 */
	public void setTime(int hr, int min, int sec, int nanos){
		userTime = LocalTime.of(hr, min, sec, nanos);
		currentTime = LocalTime.now();
	}
	/**
	 * @return a the local time(setTime must be called before you can get this time)
	 */
	public LocalTime getCurrentSetTime(){
		if(userTime == null)return null;
		return LocalTime.ofNanoOfDay((userTime.toNanoOfDay() + (LocalTime.now().toNanoOfDay() - currentTime.toNanoOfDay())));
	}
	/**
	 * @param time
	 * @return a string of the time in HH:mm:ss.SS format
	 */
	public String time2formattedString(LocalTime time){
		if(time == null)return null;
		return LocalTime.ofNanoOfDay((userTime.toNanoOfDay() + (LocalTime.now().toNanoOfDay() - currentTime.toNanoOfDay()))).format(formatTime).toString();
	}
	
}
