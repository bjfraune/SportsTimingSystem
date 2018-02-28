import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.Scanner;

public class Simulator{
	int racerCount; 
	Time clock;
	ChronoTimer ct;
	boolean simulatorOn = true;
	
	/**
	 * Constructor
	 */
	public Simulator(){
		racerCount=1;
		ct = new ChronoTimer();
		Scanner s = new Scanner(System.in);
		System.out.println("Read file from consol or file (c/f): ");
		String input = s.next();
		if(input.equalsIgnoreCase("f")) {
			System.out.print("Enter the file name: ");
			String fileName = s.nextLine();
			try(Scanner sc = new Scanner (new File(fileName))){
				while(sc.hasNextLine() && simulatorOn){
					generalParser(sc.nextLine().trim().split(" "));
				}
			}
			catch(FileNotFoundException e){
				System.out.println("File not found!");
			}
		}
		else if(input.equalsIgnoreCase("c")){
			String uInput;
			System.out.println("Start entering information, enter (Q) to quit:");
			uInput = s.next();
			while(!uInput.equals("Q")) {
				String consoleRead [] = new String [3];
				consoleRead = s.nextLine().trim().split(" ");
				generalParser(consoleRead);
			}			

		}
		s.close();
	}

	private void generalParser(String tokens[]) {
		switch(tokens[1]){
		case "POWER":
			ct.power();
			break;
		case "NEWRUN":
			clock = new Time();
			LocalTime t = LocalTime.now();
			clock.setTime(t.getHour(), t.getMinute(), t.getSecond(), t.getNano());
			break;
		case "TOG":
			ct.toggle(tokens[2]);
			break;
		case "TRIG":
			ct.trigger(tokens[2]);
			break;
		case "PRINT":
			//TODO
			break;
		case "ENDRUN":
			//TODO
			break;
		case "TIME":
			//tokens[2] to set time 
			break;
		case "NUM":
			ct.setBib(tokens[2], racerCount++);
			break;
		case "EVENT":
			ct.initiateNewEvent();
			break;
		case "EXIT":
			simulatorOn = false;
			break;
		}	
	}
}