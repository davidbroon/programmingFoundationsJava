package come.davidbrown.finalproject;


import java.util.Scanner;
import java.util.ArrayList;


public class taskmanager {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
ArrayList<String> tasks = new ArrayList<String> (100);
tasks.add(0, "Do Homework");
tasks.add(1, "Read programming blog");
tasks.add(2, "Spend time with family");
tasks.add(3, "Watch new season of cool new show");

Scanner scanner = new Scanner(System.in);

String elseStatement = "\nNot a valid option please select\na number 1-4 from menu options below\n";

		String taskManager = 
		"\n=============================\n" + 
		"|       TASK MANAGER        |\n" + 
		"=============================\n" +
	    "| Options:                  |\n" + 
		"|        1. Add a task      |\n" + 
	    "|        2. Remove a task   |\n" + 
		"|        3. Mark a task     |\n" + 
	    "|        4. List the tasks  |\n" + 		
	    "=============================\n" +
	    "What would you like to do? ";
	   
		
		
		
		
		while (true) {
			
			System.out.print(taskManager);
			String inputMainMenu = scanner.nextLine();

            if ("1".equals(inputMainMenu)) {
          System.out.println("\nAdd a task");
            	for(int i = 0; i < tasks.size(); i++){
                	System.out.println((i+1)+". " + tasks.get(i));
                }
                String inputAdd = scanner.nextLine();
                tasks.add(inputAdd);

                while (!inputAdd.equals("null")) {
                    inputAdd = scanner.nextLine();
                    tasks.add(inputAdd);
                    break;
                }
                
                                        
               
            }else if ("2".equals(inputMainMenu)) {
                System.out.println("\nRemove a task");
                for(int i = 0; i < tasks.size(); i++){
                	System.out.println((i+1)+". " + tasks.get(i));
                }
                int inputRemove = scanner.nextInt();
                tasks.remove(inputRemove-1);
                
                continue;
                
            }else if ("3".equals(inputMainMenu)) {
	              System.out.println("\nMark a task");
	              for(int i = 0; i < tasks.size(); i++){
	                	System.out.println((i+1)+". " + tasks.get(i));
	                }
	                int inputAmend = scanner.nextInt();
	                tasks.set(inputAmend - 1, tasks.get(inputAmend-1) + " (COMPLETE)");	               	               
	                System.out.println(taskManager);
	                continue;
	              
             }else if ("4".equals(inputMainMenu)) {
	                System.out.println("\nList the tasks");
	                for(int i = 0; i < tasks.size(); i++){
	                	System.out.println((i+1)+". " + tasks.get(i));
	                }	               
	             continue; 	             	         	             
             }else {
            	 System.out.println(elseStatement);
             }
	              

            
        }
		
	}
}
