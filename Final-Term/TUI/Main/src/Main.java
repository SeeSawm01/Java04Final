public class Main {
    public static void main(String[] args) {
        // 1. Task 생성
        Task task1 = new Task("자바 과제", "칸반보드만들기", "2025-06-23", "높음");
        Task task2 = new Task("스터디 준비", "현대암호학 퀴즈 공부", "2025-06-03", "중간");
        Task task3 = new Task("코딩테스트", "Bandit 또는 백준 해보기", "2025-06-05", "높음");

        // 2. Board(컬럼) 생성
        Board todo = new Board("To Do");
        Board inProgress = new Board("In Progress");

        //할 일, 우선순위 등으로 한국어 작성 가능

        // 3. Task를 컬럼에 추가
        todo.addTask(task1);
        todo.addTask(task2);
        inProgress.addTask(task3);

        // 4. MonthBoard 생성
        MonthBoard june = new MonthBoard("2025년 6월");
        // january, february, march .... 이제 곧 6월이라 6월 로 설정
        // 년도는 따로 클래스를 만들까 하다 MonthBoard와 별 차이가 없어서 직접 작성으로 변경


        // 5. 컬럼들을 MonthBoard에 추가
        june.addBoard(todo);
        june.addBoard(inProgress);

        // 6. 출력
        june.printAllBoards();  // 전체 보드 출력!
    }
}