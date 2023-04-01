# Тема: Клас `Arrays`, Garbage collector, пакет `java.time`

#### Клас `Arrays`
#### Var-args
#### Garbage collector.
#### `API` `Java SE8` для роботи із датами та часом. Класи пакету `java.time`: `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`. Клас `java.time.format.DateTimeFormatter`

<hr>

`Програмні завдання:`
1. Дано клас `Car` з полем `String model` (наприклад, `“BMW”`, `“Opel”`, `“Ford”`, etc). Використовуючи перевизначення
    методу `finalize()`, забезпечити виведення на екран значень полів `model` трьох об’єктів класу `Car` після скидання в
    `null` їх посилань:
      Car car1 = new Car(“BMW”); // ...
      car1 = null; 
2. Додати до коду, наведеного в `Cay S. Horstmann. Core Java, Volume I - Fundamentals, 136...141 pp.`, наступні ДОДАТКОВІ можливості (завдання режимів – за
    вибором студента):
   - завдання довільних року та місяця, крім поточного місяця
   - вибір формату виведення: `Sun-Mon-Tue-Wen-Thu-Fri-Sat` або `Пн-Вт-Ср-Чт-Пт-Сб-Нд`

[Відео урок](https://youtu.be/9cHtXvqyMtQ) 10.01.2023
