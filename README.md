# Система учета студентов

## Описание

Система учета студентов позволяет добавлять студентов с их средними баллами и получать имена трех самых успешных студентов на основе оценки. Код реализован на Java с использованием записи (record) для управления данными студентов.

## Структура проекта

- `Student.java`
    - Описание: Класс, представляющий студента.
    - Поля:
        - `name` (String): Имя студента.
        - `score` (Float): Средний балл студента.
    - Особенности:
        - Использует Java Record для автоматического создания методов доступа.

- `ResultsBoard.java`
    - Описание: Класс, управляющий списком студентов.
    - Поля:
        - `students`: Список студентов (ArrayList).
    - Методы:
        - `addStudent(String name, Float score)`: Добавляет студента в список и сортирует его по возрастанию среднего балла.
        - `top3()`: Возвращает список имён трех студентов с наивысшими средними баллами.

- `Main.java`
    - Описание: Главный класс для выполнения программы.
    - Функции:
        - Создает экземпляр `ResultsBoard`.
        - Добавляет студентов с их средними баллами.
        - Получает и выводит имена трех самых успешных студентов.