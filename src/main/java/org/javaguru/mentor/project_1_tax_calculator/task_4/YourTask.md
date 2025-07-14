### 🔁 Как использовать метод в программе?

Пример использования:

```java
TaxCalculator calculator = new TaxCalculator();
double tax = calculator.calculateTax(40000);
System.out.println("Tax: " + tax);
```

Что происходит:

1. Мы создаём объект `TaxCalculator`.
2. Вызываем метод `calculateTax` и передаём туда значение дохода — `40000`.
3. Метод сам рассчитывает, какой налог положен при этом доходе.
4. Возвращает нам результат (например, `16000.0`), и мы его выводим на консоль.

---

Наш метод (`calculateTax`) — это как **калькулятор в коробке**:
вы даёте ему число (доход), он считает и отдаёт результат (налог).

Такой подход делает код **модульным, читаемым и лёгким для повторного использования**.

Один раз создав метод, его можно вызывать сколько угодно раз:

```java
TaxCalculator calculator = new TaxCalculator();

double tax1 = calculator.calculateTax(40000);
System.out.println("Tax: " + tax1);

double tax2 = calculator.calculateTax(50000);
System.out.println("Tax: " + tax2);

double tax3 = calculator.calculateTax(60000);
System.out.println("Tax: " + tax3);

```

Создайте класс TaxCalculatorApplication и в его main() 
методе покажите как можно вызвать метод calculateTax() 
у объекта класса TaxCalculator.

На данный момент любой вывод на консоль результата работы 
метода будет выдавать 0.0. Это нормально, так как логика
расчета налога в самом методе еще не реализована.

#### Поддержка, вопросы и обратная связь по проекту
* [Телеграмм группа проекта](https://t.me/+mvRhG9YECTlkZjQ0)
* [Телеграмм автора курса] (@javagurulv)
* [Емейл автора курса] (itguruby@mail.ru)
