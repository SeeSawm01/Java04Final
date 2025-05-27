import java.util.ArrayList;

public class Board {
    private String columnName; // 컬럼 이름 (예: TO DO, Develop 등)
    private ArrayList<Task> tasks; // 이 컬럼에 속한 할 일 목록

    // 생성자
    public Board(String columnName) {
        this.columnName = columnName;
        this.tasks = new ArrayList<>();
    }

    // Getter & Setter
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    // Task 추가
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Task 삭제 (제목 기준)
    public void removeTask(String title) {
        tasks.removeIf(task -> task.getTitle().equals(title));
    }

    // 전체 Task 출력
    public void printAllTasks() {
        System.out.println("=== " + columnName + " 컬럼 ===");
        for (Task task : tasks) {
            task.printTask(); // 아까 만든 Task의 printTask() 활용!
            System.out.println("--------------");
        }
    }
}
