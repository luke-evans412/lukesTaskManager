//variable declarations
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task{
	//variable declarations
	
	public int freeTime = 900;
	public int hour = 0;
	public int remainingHours = 15;
	public int actualMinutes = 900;
	public int remainingMinutes = 0;
	public int minuteDifference = 0;
	public int freeTimeHolder = 0;
	
	//array and list declarations for task list and names
	public static String[] taskList={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4"};
	public static String[] printedTaskList= {"Wake up(arise): A ", "Breakfast: B", "Lunch: C", "Dinner: D", "Exercise: E", "Shower: F", "AET 2: G", "Electronic and Circuit Theory: H", "Physics for Audio Engineering: I",
			"Sound Reinforcement: J", "Desk Shift: K", "PHY Lab: L", "RA Duty: M", "One on One Meeting: N", "Tutoring Tuesday: O", "Tutoring Thursday: P", "Food Delivery: Q", "Call and text family: R", "Call and text friends: S", "Program: T"
			,"Study/Do Homework: U", "Read Spanish: V", "Anki Flashcards Spanish: W", "Listen Spanish: X", "Hang out with friends: Y", "Organize things and clean room: Z", "Laundry: 1", "Work on Music: 2" };
	
	public static String[] taskNames = {"Wake up(arise): ", "Breakfast: ", "Lunch: ", "Dinner: ", "Exercise: ", "Shower: ", "AET 2: 7:45-10:15", "Electronic and Circuit Theory: 12:00-12:50", "Physics for Audio Engineering: 15:00-15:50",
		"Sound Reinforcement: ", "Desk Shift: ", "PHY Lab: ", "RA Duty: ", "One on One Meeting: ", "Tutoring Tuesday: ", "Tutoring Thursday: ", "Food Delivery: ", "Call and text family: ", "Call and text friends: ", "Program: "
		,"Study/Do Homework: ", "Read Spanish: ", "Anki Flashcards Spanish: ", "Listen Spanish: ", "Hang out with friends: ", "Organize things and clean room: ", "Laundry: ", "Work on Music: "};
	
	List<String> chosenList = new ArrayList<String>();
	List<String> nameList = new ArrayList<String>();
	List<String> exactAgenda = new ArrayList<String>();
	
	//enables user to choose day of the week. Determines fixed items
	//of day according and subtracts hours from freeTime variable. 
	//Nullifies tasks that can't be done on certain days.
	public void chooseDay() {
		int monday = 1;
		int tuesday = 2;
		int wednesday = 3;
		int thursday = 4;
		int friday = 5;
		int saturday = 6;
		int sunday = 7;
		
	System.out.println("Enter the appropriate number for the day of the week: " + "\n" + "1: Monday" + "\n" + "2: Tuesday" + "\n" + "3: Wednesday" + "\n" + "4: Thursday" + "\n" + "5: Friday" + "\n" + "6: Saturday" + "\n" + "7: Sunday");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if (number == monday) {
			exactAgenda.add("Wake up(arise)");
			printedTaskList[0] = null;
			taskList[0] = null;
			exactAgenda.add("Breakfast");
			printedTaskList[1] = null;
			taskList[1] = null;
			printedTaskList[3] = null;
			taskList[3] = null;
			exactAgenda.add("AET 2: 7:45-10:15");
			printedTaskList[6] = null;
			taskList[6] = null;
			exactAgenda.add("Electronic and Circuit Theory: 12:00-12:50");
			printedTaskList[7] = null;
			taskList[7] = null;
			exactAgenda.add("Physics for Audio Engineering: 15:00-15:50");
			printedTaskList[8] = null;
			taskList[8] = null;
			printedTaskList[9] = null;
			taskList[9] = null;
			printedTaskList[11] = null;
			taskList[11] = null;
			printedTaskList[12] = null;
			taskList[12] = null;
			printedTaskList[13] = null;
			taskList[13] = null;
			printedTaskList[14] = null;
			taskList[14] = null;
			printedTaskList[15] = null;
			taskList[15] = null;
			printedTaskList[16] = null;
			taskList[16] = null;
			freeTime = 575;
			System.out.println("Typical Monday Events have been added");	
		}
		else if (number == tuesday) {
			exactAgenda.add("Wake up(arise)");
			printedTaskList[0] = null;
			taskList[0] = null;
			exactAgenda.add("Breakfast");
			printedTaskList[1] = null;
			taskList[1] = null;
			printedTaskList[9] = null;
			taskList[9] = null;
			exactAgenda.add("Sound Reinforcement 2: 9:30-10:45");
			printedTaskList[11] = null;
			taskList[11] = null;
			exactAgenda.add("Tutoring: 12:00-14:00");
			printedTaskList[10] = null;
			taskList[10] = null;
			printedTaskList[13] = null;
			taskList[13] = null;
			exactAgenda.add("Circuit Theory Lab: 14:30-16:20");
			printedTaskList[14] = null;
			taskList[14] = null;
			printedTaskList[6] = null;
			taskList[6] = null;
			printedTaskList[7] = null;
			taskList[7] = null;
			printedTaskList[8] = null;
			taskList[8] = null;
			printedTaskList[13] = null;
			taskList[13] = null;
			freeTime = 900;
			System.out.println("Typical Tuesday Events have been added");

		}
		else if (number == wednesday) {
			exactAgenda.add("Wake up(arise)" + "\n");
			printedTaskList[0] = null;
			taskList[0] = null;
			exactAgenda.add("Breakfast" + "\n");
			printedTaskList[1] = null;
			taskList[1] = null;
			exactAgenda.add("AET 2: 7:45-10:15" + "\n");
			printedTaskList[6] = null;
			taskList[6] = null;
			exactAgenda.add("Electronic and Circuit Theory: 12:00-12:50" + "\n");
			printedTaskList[7] = null;
			taskList[7] = null;
			exactAgenda.add("Sound Reinforcement: 13:00-14:20" + "\n");
			printedTaskList[8] = null;
			taskList[8] = null;
			exactAgenda.add("Physics for Audio Engineering: 15:00-15:50" + "\n");
			printedTaskList[9] = null;
			taskList[9] = null;
			printedTaskList[10] = null;
			taskList[10] = null;
			printedTaskList[13] = null;
			taskList[13] = null;
			printedTaskList[14] = null;
			taskList[14] = null;
			printedTaskList[15] = null;
			taskList[15] = null;
			freeTime = 485;
			System.out.println("Typical Wednesday Events have been added" + "\n");
			
			
			
		}
		else if (number == thursday) {
			exactAgenda.add("Wake up(arise)");
			exactAgenda.add("Breakfast");
			exactAgenda.add("Dinner");
			printedTaskList[0] = null;
			taskList[0] = null;
			printedTaskList[1] = null;
			taskList[1] = null;
			printedTaskList[1] = null;
			taskList[1] = null;
			printedTaskList[3] = null;
			taskList[3] = null;
			printedTaskList[10] = null;
			taskList[10] = null;
			printedTaskList[11] = null;
			taskList[11] = null;
			printedTaskList[13] = null;
			taskList[13] = null;
			
			exactAgenda.add("Sound Reinforcement: 9:30-10:45" + "\n");
			exactAgenda.add("Study: 11:00-1:00" + "\n");
			exactAgenda.add("PHY Lab: 13:00-14:50" + "\n");
			exactAgenda.add("Tutoring: 15:00-17:30");
			printedTaskList[14] = null;
			taskList[14] = null;
			printedTaskList[15] = null;
			taskList[15] = null;
			freeTime = 320;
			System.out.println("Typical Thursday Events have been added");
			
			
		}
		else if (number == friday) {
			exactAgenda.add("Wake up(arise)" + "\n");
			exactAgenda.add("Breakfast");
			printedTaskList[0] = null;
			taskList[0] = null;
			printedTaskList[1] = null;
			taskList[1] = null;
			exactAgenda.add("Electronic and Circuit Theory: 12:00-12:50" + "\n");
			printedTaskList[7] = null;
			taskList[7] = null;
			exactAgenda.add("Physics for Audio Engineering: 12:00-12:50" + "\n");
			printedTaskList[8] = null;
			taskList[8] = null;
			printedTaskList[9] = null;
			taskList[9] = null;
			printedTaskList[10] = null;
			taskList[10] = null;
			printedTaskList[11] = null;
			taskList[11] = null;
			printedTaskList[13] = null;
			taskList[13] = null;
			printedTaskList[14] = null;
			taskList[14] = null;
			printedTaskList[15] = null;
			taskList[15] = null;
			freeTime = 720;
			System.out.println("Typical Friday Events have been added" + "\n");
			
			
		}
		else if (number == saturday) {
			exactAgenda.add("Wake up(arise)" + "\n");
			printedTaskList[0] = null;
			taskList[0] = null;
			exactAgenda.add("Breakfast" + "\n");
			printedTaskList[1] = "";
			taskList[1] = "";
			printedTaskList[0] = null;
			taskList[0] = null;
			printedTaskList[1] = null;
			taskList[1] = null;
			printedTaskList[9] = null;
			taskList[9] = null;printedTaskList[10] = null;
			taskList[10] = null;
			printedTaskList[11] = null;
			taskList[11] = null;
			printedTaskList[13] = null;
			taskList[13] = null;
			printedTaskList[14] = null;
			taskList[14] = null;
			printedTaskList[15] = null;
			taskList[15] = null;
			freeTime = 860;
			System.out.println("Typical Saturday Events have been added");
			
		}
		else if (number == sunday) {
			exactAgenda.add("Wake up(arise)" + "\n");
			exactAgenda.add("Breakfast" + "\n");
			printedTaskList[0] = null;
			taskList[0] = null;
			printedTaskList[1] = null;
			taskList[1] = null;
			printedTaskList[9] = null;
			taskList[9] = null;
			printedTaskList[11] = null;
			taskList[11] = null;
			printedTaskList[9] = null;
			taskList[9] = null;
			printedTaskList[10] = null;
			taskList[10] = null;
			printedTaskList[14] = null;
			taskList[14] = null;
			printedTaskList[15] = null;
			taskList[15] = null;
			freeTime = 860;
			System.out.println("Typical Sunday Events have been added");		
		} else{
			System.out.println("Invalid Input: please try again.");
		}
	}
		
	
	//updates amount of free hours
	public void updateFreeHours() {
		hour = freeTime - minuteDifference;
		remainingHours = hour / 60;
	}
	
	//updates amount of free minutes
	public void updateFreeMinutes() {
		actualMinutes = freeTime - minuteDifference;
		remainingMinutes = actualMinutes % 60;
	}
	
	
	//adds chosen tasks to chosenList in order to be assigned times
	//prepares chosen tasks to be assigned times
	public void getTotal() {
		Scanner scan = new Scanner(System.in);
		String userinput = scan.nextLine();
		for (int i = 0; i < taskList.length; i++) {
			if(taskList[i] == null) {
				continue;
			}
			 if (userinput.contains(taskList[i])) {
				chosenList.add(taskList[i]);
				nameList.add(taskNames[i]);
				
		}
		}	
	}
	
	//turns a task index blank
	public void nullify() {
		
		for (int i = 0; i < printedTaskList.length; i++) {
			if(printedTaskList[i].contains(null)) {
				printedTaskList[i] = " ";
			}
			
		}
	}
	//subtracts times for chosen tasks
	public void subtractTimes() {
		if(chosenList.contains(taskList[0])) {
			freeTime = freeTime - 10;
			minuteDifference = minuteDifference + 10;
			exactAgenda.add("Wake up(arise)");
		}
		if(chosenList.contains(taskList[1])) {
			freeTime = freeTime - 30;
			minuteDifference = minuteDifference + 30;
			exactAgenda.add("Breakfast");
		}
		if(chosenList.contains(taskList[2])) {
			freeTime = freeTime - 25;
			minuteDifference = minuteDifference + 25;
			
		}
		if(chosenList.contains(taskList[3])) {
			freeTime = freeTime - 30;
			minuteDifference = minuteDifference + 30;
			
		}
		if(chosenList.contains(taskList[4])) {
			freeTime = freeTime - 60;
			minuteDifference = minuteDifference + 60;
			
			
		}
		if(chosenList.contains(taskList[5])) {
			freeTime = freeTime - 10;
			minuteDifference = minuteDifference + 10;
			
		}
		if(chosenList.contains(taskList[6])) {
			freeTime = freeTime - 150;
			minuteDifference = minuteDifference + 150;
			exactAgenda.add("AET 2: 7:45-10:15");
		}
		if(chosenList.contains(taskList[7])) {
			freeTime = freeTime - 65;
			minuteDifference = minuteDifference + 65;
			exactAgenda.add("Electronic and Circuit Theory: 12:00-12:50");
		}
		if(chosenList.contains(taskList[8])) {
			freeTime = freeTime - 70;
			minuteDifference = minuteDifference + 70;
			exactAgenda.add("Physics for Audio Engineering: 12:00-12:50");
		}
		if(chosenList.contains(taskList[9])) {
			freeTime = freeTime - 100;
			minuteDifference = minuteDifference + 100;
			exactAgenda.add("Sound Reinforcement 2: 9:30-10:45");
		}
		if(chosenList.contains(taskList[10])) {
			freeTime = freeTime - 250;
			minuteDifference = minuteDifference + 250;
			exactAgenda.add("Desk Shift: 15:55-20:05");
		}
		if(chosenList.contains(taskList[11])) {
			freeTime = freeTime - 135;
			minuteDifference = minuteDifference + 135;
			exactAgenda.add("PHY Lab: 13:00-14:50");
		}
		if(chosenList.contains(taskList[12])) {
			freeTime = freeTime - 320;
			minuteDifference = minuteDifference + 320;
			exactAgenda.add("RA Duty: 17:55-23:15");
		}
		if(chosenList.contains(taskList[13])) {
			freeTime = freeTime - 30;
			minuteDifference = minuteDifference + 30;
			
		}

		if(chosenList.contains(taskList[14])) {
			freeTime = freeTime - 135;
			minuteDifference = minuteDifference + 135;
			exactAgenda.add("Tutoring: 12:00-14:00");
		}
		if(chosenList.contains(taskList[15])) {
			freeTime = freeTime - 160;
			minuteDifference = minuteDifference + 160;
			exactAgenda.add("Tutoring: 15:00-17:30");
		}
		if(chosenList.contains(taskList[16])) {
			freeTime = freeTime - 250;
			minuteDifference = minuteDifference + 250;
			
		}
		if(chosenList.contains(taskList[17])) {
			freeTime = freeTime - 30;
			minuteDifference = minuteDifference + 30;
			
		}
		if(chosenList.contains(taskList[18])) {
			freeTime = freeTime - 30;
			minuteDifference = minuteDifference + 30;
			
		}
		if(chosenList.contains(taskList[19])) {
			freeTime = freeTime - 120;
			minuteDifference = minuteDifference + 120;
			
		}
		if(chosenList.contains(taskList[20])) {
			freeTime = freeTime - 120;
			minuteDifference = minuteDifference + 120;
			
		}
		if(chosenList.contains(taskList[21])) {
			freeTime = freeTime - 120;
			minuteDifference = minuteDifference + 120;
			
		}
		if(chosenList.contains(taskList[22])) {
			freeTime = freeTime - 60;
			minuteDifference = minuteDifference + 60;
			
		}
		if(chosenList.contains(taskList[23])) {
			freeTime = freeTime - 60;
			minuteDifference = minuteDifference + 60;
			
		}
		if(chosenList.contains(taskList[24])) {
			freeTime = freeTime - 250;
			minuteDifference = minuteDifference + 250;
			
		}
		if(chosenList.contains(taskList[25])) {
			freeTime = freeTime - 60;
			minuteDifference = minuteDifference + 60;
			
		}
		if(chosenList.contains(taskList[26])) {
			freeTime = freeTime - 0;
			
		}
		if(chosenList.contains(taskList[27])) {
			freeTime = freeTime - 120;
			minuteDifference = minuteDifference + 120;
			
		}
		if(chosenList.contains(taskList[28])) {
			
		}
	}
	
	//prints Welcome information
	public void printWelcome() {
		System.out.println("Enter the tasks you want to complete for today based on the list below: "); 
		System.out.println("Type in your chosen tasks like this: A B C D");
	}
	
	//prints task list
	public void printTasks() {
		for (int i = 0; i < printedTaskList.length; i++)
		{
			if(printedTaskList[i] != null){
		    System.out.println(printedTaskList[i]);
		    }
		}
		System.out.println("\n");
	}
	
	//sorts the lists of tasks
	public void sortList() {
		for (int i = 0; i < taskList.length; i++)
		{
		    if (chosenList.contains(taskList[i]))
		    {
		        taskList[i] = null;
		        break;
		    }
		}
		
	}
	//prints current free time and current list of tasks	
	public void printCurrent() {
		System.out.println("You have: " + remainingHours + " hours and " + remainingMinutes + " minutes of free time remaining.");
		System.out.println("Here is your task list for today: " + "\n");
		for (String agendaItem: exactAgenda) {
			System.out.println(agendaItem + "\n");
		}
	}
	//prints final list of tasks
		public void printResults() {
			System.out.println("You have: " + remainingHours + " hours and " + remainingMinutes + " minutes of free time remaining.");
			System.out.println("Here is your task list for today: " + "\n");
			for (String agendaItem: exactAgenda) {
				System.out.println(agendaItem + "\n");
			}
		} 
		//enables time to be set for chosen tasks
		public void determineTime() {
			System.out.println("Designate times for each selected task (Ex: 14:00-15:30): ");
			for (int i = 0; i < chosenList.size(); i++)
			{
				Scanner scan = new Scanner(System.in);
				System.out.println(chosenList.get(i));
				String time = scan.nextLine();
			
				exactAgenda.add(nameList.get(i) + time);
			}
		}

		

		
		
		
		
	}


