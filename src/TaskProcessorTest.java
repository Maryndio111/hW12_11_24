

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

    class TaskProcessorTest {

        @Test
        void testGetAllTasks() {
            List<Task> tasks1 = Arrays.asList(
                    new Task(1, "Fix bug", "in progress", 6),
                    new Task(2, "Write unit tests", "done", 3)
            );

            List<Task> tasks2 = Arrays.asList(
                    new Task(3, "Develop feature X", "in progress", 7),
                    new Task(4, "Code review", "in progress", 4)
            );

            List<Programmer> programmers = Arrays.asList(
                    new Programmer("John", "Berlin", tasks1),
                    new Programmer("Alex", "Berlin", tasks2)
            );

            List<Task> allTasks = TaskProcessor.getAllTasks(programmers);
            assertEquals(4, allTasks.size());
        }

        @Test
        void testGetTasksFromBerlinInProgressMoreThan5Days() {
            List<Task> tasks1 = Arrays.asList(
                    new Task(1, "Fix bug", "in progress", 6),
                    new Task(2, "Write unit tests", "done", 3)
            );

            List<Task> tasks2 = Arrays.asList(
                    new Task(3, "Develop feature X", "in progress", 7),
                    new Task(4, "Code review", "in progress", 4)
            );

            List<Task> tasks3 = Arrays.asList(
                    new Task(5, "Implement login", "in progress", 8),
                    new Task(6, "Deploy to prod", "done", 2)
            );

            List<Programmer> programmers = Arrays.asList(
                    new Programmer("John", "Berlin", tasks1),
                    new Programmer("Alex", "Berlin", tasks2),
                    new Programmer("Maria", "Munich", tasks3)
            );

            List<Task> berlinTasks = TaskProcessor.getTasksFromBerlinInProgressMoreThan5Days(programmers);
            assertEquals(2, berlinTasks.size());
        }
    }

