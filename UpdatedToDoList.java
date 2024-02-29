import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

// Task class representing a to-do item
class Task {
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }

}

public class UpdatedToDoList{
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Map<Integer, Task> todoList = new TreeMap<>();

        while (true){
            System.out.println("The to do list management system. Choose(1-4): ");
            System.out.println("1. ADD the task to the list");
            System.out.println("2. DELETE the task from list");
            System.out.println("3. SHOW ALL the plan for a day");
            System.out.println("4. UPDATE the task");
            System.out.println("5. Exit()");

            int Choice = scanner.nextInt();
            System.out.println(" ");
            
            switch (Choice) {
                case 1:
                    System.out.println("Write the description of the task: ");
                    scanner.nextLine();

                    String desc = scanner.nextLine();
                    Task task = new Task(desc);

                    System.out.println("And it's priority: ");
                    int i = scanner.nextInt();
                    todoList.put(i, task);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Which task do you want to delete?");
                    int number = scanner.nextInt();
                    System.out.println(" ");
                    todoList.remove(number);
                    System.out.println("You've deleted " + number + " task");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("       THE TO DO LIST      ");
                    for (Map.Entry<Integer, Task> entry : todoList.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue().getDescription());
                    }
                    if(todoList.size() == 0){
                        System.out.println("You don't have plans for today!");
                    }
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Which task do you want to update?");
                    int k = scanner.nextInt();
                    System.out.println("Update the task");
                    scanner.nextLine();
                    String setdesc1 = scanner.nextLine();

                    for (Map.Entry<Integer, Task> entry : todoList.entrySet()) {
                        if (entry.getKey() == k){
                            entry.getValue().setDescription(setdesc1);
                            System.out.println("The task updated successfully");
                        }
                    }
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
