import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ResultsBoard {
    private final List<Student> students; // Список студентов

    // Конструктор класса ResultsBoard
    public ResultsBoard() {
        this.students = new ArrayList<>(); // Инициализация списка студентов
    }

    // Метод для добавления студента
    public void addStudent(String name, Float score) {
        // Создание нового студента и добавление его в список
        students.add(new Student(name, score));

        // Сортировка списка студентов по возрастанию среднего балла
        students.sort(Comparator.comparing(Student::score));
    }

    // Метод для получения имен трех самых успешных студентов
    public List<String> top3() {
        // Сортировка студентов по убыванию среднего балла
        Collections.sort(students, (s1, s2) -> s2.score().compareTo(s1.score()));

        List<String> top3 = new ArrayList<>();
        // Добавление имен трех самых успешных студентов в список
        for (int i = 0; i < Math.min(3, students.size()); i++) {
            top3.add(students.get(i).name()); // Используем метод name() для доступа к имени
        }
        return top3; // Возврат списка имен
    }
}
