public class Task {
    private int Number;
    private String description;
    private String status;
    private  int daysInProcessing;

    public Task(int number, String description, String status, int daysInProcessing) {
        Number = number;
        this.description = description;
        this.status = status;
        this.daysInProcessing = daysInProcessing;
    }

    public int getNumber() {
        return Number;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public int getDaysInProcessing() {
        return daysInProcessing;
    }

    @Override
    public String toString() {
        return "Task{" +
                "Number=" + Number +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", daysInProcessing=" + daysInProcessing +
                '}';
    }
}
