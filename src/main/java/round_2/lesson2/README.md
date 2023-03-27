# Тема: Конструктори. Методи
#### Типи методів. Конструктори. Перезавантажені конструктори.
#### Перезавантаження методів.
#### Mетод `main()`. Аргументи в методі `main()`.

`Програмне завдання`: Із використанням циклічного оператору `for` та вкладеного оператору `switch/case` реалізувати за допомогою аргументів методу `main()` та відповідне виведення даних згідно таблиці:

| WEEK_DAYS |           | MARKS |                | PLANETS |         |
|:---------:|:---------:|:-----:|:--------------:|:-------:|:-------:|
|   Input   |   Print   | Input |     Print      |  Input  |  Print  |
|     1     |  Monday   |   0   | Unsatisfactory |    1    | Mercury |
|     2     |  Tuesday  |   1   | Unsatisfactory |    2    |  Venus  |
|     3     | Wednesday |   2   | Unsatisfactory |    3    |  Earth  |
|     4     | Thursday  |   3   |  Satisfactory  |    4    |  Mars   |
|     5     |  Friday   |   4   |      Good      |    5    | Jupiter |
|     6     | Saturday  |   5   |   Excellent    |    6    | Saturn  |
|     7     |  Sunday   |       |                |    7    |  Uran   |
|           |           |       |                |    8    | Neptune |

Наприклад, введеним даним: `MARKS 3 5 2 3 4 4 3 4` <br>
має відповідати виведення: `Satisfactory` `Excellent` `Unsatisfactory` `Satisfactory` `Good` `Good` `Satisfactory` `Good`

Реалізувати код в шаблоні `MVC` (для даного завдання клас `View` можна не створювати, а його функції доручити іншим класам).
Використати масиви `String` із заданими в таблиці відповідними текстовими значеннями.
Утворити відповідні `ArrayList<String> weekDays`, `ArrayList<String> marks`, `ArrayList<String> planets`.

[Відео урок](https://youtu.be/sCzoeH9gEng) 09.12.2022
