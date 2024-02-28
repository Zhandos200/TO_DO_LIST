// I decided to create To-do list manager and use the strategy pattern to sort by priority and description.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Task class representing a to-do item
class Task {
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}

// Strategy interface
interface TaskSortingStrategy {
    void sort(List<Task> tasks);
}

// Concrete strategy for priority
class PrioritySortingStrategy implements TaskSortingStrategy {
    @Override
    public void sort(List<Task> tasks) {
        // Sort tasks by priority
        tasks.sort(Comparator.comparingInt(Task::getPriority));
    }
}

// Concrete strategy for description
class DescriptionSortingStrategy implements TaskSortingStrategy {
    @Override
    public void sort(List<Task> tasks) {
        // Sort tasks by description
        tasks.sort(Comparator.comparing(Task::getDescription));
    }
}

// Context class 
class TodoListSorter {
    private TaskSortingStrategy sortingStrategy;

    public TodoListSorter(TaskSortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(TaskSortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sortTasks(List<Task> tasks) {
        sortingStrategy.sort(tasks);
    }
}

public class StrategyPatternExample {
    public static void main(String[] args) {
        // Create tasks
        Task task1 = new Task("Complete assignment", 2);
        Task task2 = new Task("Read a book", 1);
        Task task3 = new Task("Go to the gym", 3);

        // Create a to-do list
        List<Task> todoList = new ArrayList<>();
        todoList.add(task1);
        todoList.add(task2);
        todoList.add(task3);

        // Use different sorting strategies
        TodoListSorter sorter = new TodoListSorter(new PrioritySortingStrategy());
        sorter.sortTasks(todoList);
        printTasks("Sorted by Priority:", todoList);

        sorter.setSortingStrategy(new DescriptionSortingStrategy());
        sorter.sortTasks(todoList);
        printTasks("Sorted by Description:", todoList);
    }

    private static void printTasks(String message, List<Task> tasks) {
        System.out.println(message);
        for (Task task : tasks) {
            System.out.println("Task: " + task.getDescription() + ", Priority: " + task.getPriority());
        }
        System.out.println();
    }
}
