import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskProcessor {
    public static List<Task> getAllTasks(List<Programmer> programmers){
        List<Task> allTasks = new ArrayList<>();
        for (Programmer programmer : programmers){
            allTasks.addAll(programmer.getTasks());
        }
        return allTasks;
    }
    public static List<Task> getTasksFromBerlinInProgressMoreThen5Days(List<Programmer> programmers){
        return programmers.stream()
                .filter(p ->"Berlin".equalsIgnoreCase(p.getCity()))
                .flatMap(p ->p.getTasks().stream())
                .filter(t ->!"done".equalsIgnoreCase(t.getStatus()))
                .filter(t ->t.getDaysInProcessing() >5)
                .collect(Collectors.toList());
    }

    public static List<Task> getTasksFromBerlinInProgressMoreThan5Days(List<Programmer> programmers) {
        return null;
    }
}
