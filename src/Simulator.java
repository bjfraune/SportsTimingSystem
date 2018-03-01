import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Simulator{
	int racerCount; 

	ChronoTimer ct;
	Channel chan;
	boolean simulatorOn;

	/**
	 * Constructor
	 * @throws IOException 
	 */
	public Simulator() throws IOException{
		racerCount=1;
		simulatorOn = true;
		ct = new ChronoTimer();
		chan = new Channel();
		Scanner s = new Scanner(System.in);
		System.out.println("Read file from consol or file (c/f): ");
		String input = s.nextLine();
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
			uInput = s.nextLine();
			while(!uInput.equals("Q")) {
				String consoleRead [] = new String [3];
				consoleRead = s.nextLine().trim().split(" ");
				generalParser(consoleRead);
			}			

		}
		s.close();
	}
	/**
	 * parses input text file and executes commands
	 * @param tokens
	 * @throws IOException
	 */
	private void generalParser(String[] tokens) throws IOException {
		switch(tokens[1]){
		case "POWER":
			ct.power();
			break;
		case "NEWRUN":
			ct.startNewRun();
			break;
		case "TOG" :
			chan.Toggle(Integer.parseInt(tokens[2]));
			break;
		case "TRIG":
			String[] holder = new String[4];
			String[] time = tokens[0].split(":");
			holder[0] = time[0];
			holder[1] = time[1];
			holder[2] = time[2];
			holder[3] = time[2].substring(3);
			holder[2] = time[2].substring(0, 2);
			ct.trigger(Time.string2LocalTime(holder),tokens[2]);
			break;
		case "PRINT":
			ct.printResults();
			break;
		case "ENDRUN":
			ct.endRun();
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
		case "CONN" :
			chan.connectSensor(tokens[2], Integer.parseInt(tokens[3]));
		}	

	}
	public static void main(String[] s) throws IOException {
		new Simulator();
	}
}