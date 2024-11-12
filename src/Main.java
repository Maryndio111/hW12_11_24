import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void main(String[] args) {
        List<Task> tasks1 = Arrays.asList(
                new Task(1,"Fix bug", "in progress",6),
                new Task(2,"Write unit tests", "done", 3)

        );
        List<Task> tasks2 = Arrays.asList(
                new Task(3, "Develop feature X", "in progress", 7),
                new Task(4, "Code review", "in progress",4)
        );
        List<Task> tasks3 = Arrays.asList(
                new Task(5, "Implement login", "in progress", 8),
                new Task(6, "Deploy to prod", "done", 2)
        );
        List<Programmer> programmers =Arrays.asList(
                new Programmer("John", "Berlin", tasks1),
                new Programmer("Alex","Berlin", tasks2),
                new Programmer("Maria", "Munich", tasks3)
        );
        List<Task> allTasks = TaskProcessor.getAllTasks(programmers);
        System.out.println("Все задачи:  ");
        allTasks.forEach(System.out::println);

        List<Task> berlinTasks = getClass(programmers);
        System.out.println("\nЗадачи из Берлина, которые не завершены и более 5 дней в обработке:  ");
        berlinTasks.forEach(System.out::println);

    }

    private List<Task> getClass(List<Programmer> programmers) {
        return null;
    }
}