import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Simulator{
	ChronoTimer ct = new ChronoTimer();
	boolean simulatorOn = true;

	public Simulator(){
		try(Scanner sc = new Scanner (new File("racers.txt"))){
			while(sc.hasNextLine() && simulatorOn){
				fileParser(sc.nextLine().trim().split(" "));
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File not found!");
		}
	}

	private void fileParser(String tokens[]) {
		switch(tokens[1]){
		case "POWER":
		//	ct.power();
			break;
		case "NEWRUN":
			//TODO
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
			
			break;
		case "EVENT":
			break;
		case "EXIT":
			simulatorOn = false;
			break;
		}	
	}
}
