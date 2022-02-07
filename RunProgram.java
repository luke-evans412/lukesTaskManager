//Published by: Luke Evans
//Date of Publication: 2/6/2022
public class RunProgram extends Task{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declares Task object and calls methods from tasks
		Task t = new Task();
		t.chooseDay();
		System.out.println("\n");
		t.updateFreeHours();
		t.updateFreeMinutes();
		t.printCurrent();
		t.printWelcome();
		t.printTasks();
		t.getTotal();
		t.subtractTimes();
		t.updateFreeHours();
		t.updateFreeMinutes();
		t.determineTime();
		t.sortList();
		t.printResults();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
