import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 * @author BS
 * Lets the user set a current time and retrieve updated time
 */
public class Time {
	static LocalTime startTime;
	static LocalTime userTime;
	final DateTimeFormatter formatTime=DateTimeFormatter.ofPattern("HH:mm:ss.SS");;
	/**
	 * Lets the user set a new local time
	 */
	public static void startTimer(){
		startTime = LocalTime.now();
	}
	/**
	 * @return a the local time(setTime must be called before you can get this time)
	 */
	public static LocalTime getCurrentSetTime(){
		return LocalTime.ofNanoOfDay(LocalTime.now().toNanoOfDay() - startTime.toNanoOfDay());
	}
	public static LocalTime string2LocalTime(String[] time) {
		return LocalTime.of(Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2]), Integer.parseInt(time[3]));
	}
	/**
	 * @param time
	 * @return a string of the time in HH:mm:ss.SS format
	 */
	/*
	public String time2formattedString(LocalTime time){
		if(time == null)return null;
		return LocalTime.ofNanoOfDay((userTime.toNanoOfDay() + (LocalTime.now().toNanoOfDay() - currentTime.toNanoOfDay()))).format(formatTime).toString();
	}
	 */

}