import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Simulator{
	boolean simulatorOn = true;
	public Simulator(){
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
			ChronoTimer.power();
			break;
		case "NEWRUN":
			//TODO
			break;
		case "TOG":
			ChronoTimer.toggle(Integer.parseInt(tokens[2]));
			break;
		case "TRIG":
			ChronoTimer.trigger(Integer.parseInt(tokens[2]));
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
			break;
		case "EVENT":
			break;
		case "EXIT":
			simulatorOn = false;
			break;
		}	
	}
}
