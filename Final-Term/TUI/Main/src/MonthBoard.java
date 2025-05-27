import java.util.ArrayList;

public class MonthBoard {
    private String monthName; // 1월,2월,3월 ...
    private ArrayList<Board> boards; // 컬럼 목록

    // 생성자
    public MonthBoard(String monthName) {
        this.monthName = monthName;
        this.boards = new ArrayList<>();
    }

    // Getter & Setter
    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public ArrayList<Board> getBoards() {
        return boards;
    }

    // Board(컬럼) 추가
    public void addBoard(Board board) {
        boards.add(board);
    }

    // Board 삭제 (컬럼 이름 기준)
    public void removeBoard(String columnName) {
        boards.removeIf(board -> board.getColumnName().equals(columnName));
    }

    // 전체 Board + 그 안의 Task 출력
    public void printAllBoards() {
        System.out.println("==== " + monthName + "의 보드 ====");
        for (Board board : boards) {
            board.printAllTasks(); // Board 클래스에서 만든 출력 메서드 활용
            System.out.println(); // 컬럼 사이 구분을 위한 공백
        }
    }
}
