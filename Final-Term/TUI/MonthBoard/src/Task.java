
//Task 클래스 생성 (가장 밑단) //추가가능
public class Task {
    private String title; //할 일 제목
    private String description; //할 일 내용
    private String dueDate; //마감일
    private String priority; //우선순위


    //생성자 //추가가능
    public Task(String title, String description, String dueDate, String priority) {
        this.title = title; //this는 위에 변수와 이름이 같기 때문에 사용
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getPriority() {
        return priority;
    }

    // 가독성 메서드
    public void printTask() {
        System.out.println("제목 : " + title);
        System.out.println("내용 : " + description );
        System.out.println("마감일 : " + dueDate );
        System.out.println("우선순위 : " + priority );
    }

}