Давай разберёмся — **как правильно выполнять арифметические операции 
с двумя переменными `BigDecimal` в Java**. Ниже — объяснение, с примерами и подсказками.

---

# 🔢 Арифметика с `BigDecimal` в Java

Тип `BigDecimal` — это **объект**, а не примитив, 
поэтому для операций `+`, `-`, `*`, `/` нельзя использовать 
обычные операторы. Вместо них используются **методы**:

| Операция  | Метод в `BigDecimal` | Пример вызова                      |
| --------- | -------------------- | ---------------------------------- |
| Сложение  | `add()`              | `a.add(b)`                         |
| Вычитание | `subtract()`         | `a.subtract(b)`                    |
| Умножение | `multiply()`         | `a.multiply(b)`                    |
| Деление   | `divide(...)`        | `a.divide(b, scale, roundingMode)` |

---

## 📘 Примеры кода

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMathExample {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10.00");
        BigDecimal b = new BigDecimal("3");

        BigDecimal sum = a.add(b);                      // 10.00 + 3
        BigDecimal diff = a.subtract(b);                // 10.00 - 3
        BigDecimal product = a.multiply(b);             // 10.00 * 3
        BigDecimal quotient = a.divide(b, 2, RoundingMode.HALF_UP); // 10.00 / 3 → округляем до 2 знаков

        System.out.println("Сумма: " + sum);            // 13.00
        System.out.println("Разность: " + diff);        // 7.00
        System.out.println("Произведение: " + product); // 30.00
        System.out.println("Частное: " + quotient);     // 3.33
    }
}
```

---

## 🔍 Деление: будьте внимательны!

Метод `divide()` требует указания:

* **scale** — количество знаков после запятой
* **roundingMode** — метод округления

```java
BigDecimal result = a.divide(b, 2, RoundingMode.HALF_UP);
```

### ❗ Если этого не сделать, возможна ошибка:

```java
BigDecimal a = new BigDecimal("1");
BigDecimal b = new BigDecimal("3");
BigDecimal result = a.divide(b); // ❌ ArithmeticException: Non-terminating decimal expansion
```

> Ошибка возникает, когда результат — бесконечная десятичная дробь, например `1 / 3 = 0.333...`

---

## ✅ Поддерживаемые округления (`RoundingMode`)

| Режим       | Что делает                                             |
| ----------- | ------------------------------------------------------ |
| `HALF_UP`   | Округляет к ближайшему, 0.5 вверх (обычное округление) |
| `HALF_DOWN` | 0.5 вниз                                               |
| `UP`        | Всегда вверх                                           |
| `DOWN`      | Всегда вниз                                            |
| `CEILING`   | К +∞                                                   |
| `FLOOR`     | К -∞                                                   |

---

## 📌 Пример: деление с округлением

```java
BigDecimal a = new BigDecimal("5");
BigDecimal b = new BigDecimal("3");
BigDecimal result = a.divide(b, 4, RoundingMode.HALF_UP); // 1.6667
```

---

## 🧪 Можно ли делать цепные вычисления?

Да!

```java
BigDecimal total = a.add(b).multiply(new BigDecimal("2"));
```

---

## 🛑 Чего не делать:

```java
BigDecimal a = new BigDecimal("2.5");
BigDecimal b = new BigDecimal("1.5");

BigDecimal result = a + b; // ❌ ОШИБКА компиляции: нельзя использовать `+` с объектами
```

---

## 🧠 Итого

| Операция        | Используй                 | Пример                                 |
| --------------- | ------------------------- | -------------------------------------- |
| `+` (сложение)  | `add()`                   | `a.add(b)`                             |
| `-` (вычитание) | `subtract()`              | `a.subtract(b)`                        |
| `*` (умножение) | `multiply()`              | `a.multiply(b)`                        |
| `/` (деление)   | `divide(scale, rounding)` | `a.divide(b, 2, RoundingMode.HALF_UP)` |

---

Вот мини-программа на Java — **интерактивный калькулятор 
с `BigDecimal`**, который позволяет вводить два числа 
и выбрать арифметическую операцию (`+`, `-`, `*`, `/`). 

Попробуйте скопировать и запустить эту программу.
Выполните с помощью этой программы разные операции.

---

## 💻 Java-код: BigDecimal-калькулятор

```java
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BigDecimalCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел
        System.out.print("Введите первое число: ");
        BigDecimal a = new BigDecimal(scanner.nextLine());

        System.out.print("Введите второе число: ");
        BigDecimal b = new BigDecimal(scanner.nextLine());

        // Ввод операции
        System.out.print("Введите операцию (+, -, *, /): ");
        String op = scanner.nextLine();

        BigDecimal result = null;

        switch (op) {
            case "+":
                result = a.add(b);
                break;
            case "-":
                result = a.subtract(b);
                break;
            case "*":
                result = a.multiply(b);
                break;
            case "/":
                System.out.print("Введите точность (кол-во знаков после запятой): ");
                int scale = Integer.parseInt(scanner.nextLine());
                result = a.divide(b, scale, RoundingMode.HALF_UP);
                break;
            default:
                System.out.println("❌ Неизвестная операция: " + op);
                return;
        }

        System.out.println("✅ Результат: " + result.toPlainString());
    }
}
```

---

## 📥 Пример запуска

```
Введите первое число: 10.00
Введите второе число: 3
Введите операцию (+, -, *, /): /
Введите точность (кол-во знаков после запятой): 2
✅ Результат: 3.33
```

---

## 📌 Что делает эта программа

* Принимает два `BigDecimal` числа
* Принимает знак арифметической операции
* Делает нужную операцию через методы `add`, `subtract`, `multiply`, `divide`
* Для деления запрашивает `scale` и округляет результат

---

#### Поддержка, вопросы и обратная связь по проекту
* [Телеграмм группа проекта](https://t.me/+mvRhG9YECTlkZjQ0)
* [Телеграмм автора курса] (@javagurulv)
* [Емейл автора курса] (itguruby@mail.ru)
