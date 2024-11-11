import java.util.List;

public class Main {
    public static void main(String[] args) {
        ResultsBoard resultsBoard = new ResultsBoard(); // Создание экземпляра ResultsBoard

        // Добавление студентов с их средними баллами
        resultsBoard.addStudent("Алиса", 85.5f);
        resultsBoard.addStudent("Николай", 92.0f);
        resultsBoard.addStudent("Сергей", 78.0f);
        resultsBoard.addStudent("Диана", 88.0f);
        resultsBoard.addStudent("Алексей", 95.0f);

        // Получение имен трех самых успешных студентов
        List<String> topStudents = resultsBoard.top3();

        System.out.println("\nТоп 3 студента:");
        // Выводим имена трех самых успешных студентов
        for (String name : topStudents) {
            System.out.println(name);
        }
    }
}