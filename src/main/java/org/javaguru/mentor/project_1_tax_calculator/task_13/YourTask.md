# 🔍 Сравнение переменных `BigDecimal` в Java

В Java нельзя сравнивать два `BigDecimal` с помощью 
операторов `==`, `<`, `>`, `<=`, `>=`. Это связано с тем, 
что `BigDecimal` — **объект**, а не примитивный тип 
(как `int` или `double`).

---

## 🚫 Что не работает

```java
BigDecimal a = new BigDecimal("2.0");
BigDecimal b = new BigDecimal("2.00");

System.out.println(a == b);      // ❌ НЕ РАБОТАЕТ
System.out.println(a < b);       // ❌ НЕ РАБОТАЕТ
System.out.println(a >= b);      // ❌ НЕ РАБОТАЕТ
```

* `==` сравнивает **ссылки на объекты**, а не значения.
* `<`, `>` и т.п. вообще не работают с объектами — Java 
* не разрешит это на этапе компиляции.

---

## ✅ Как правильно сравнивать `BigDecimal`

### 1. **Метод `compareTo()`**

```java
a.compareTo(b)
```

Возвращает:

| Результат | Значение сравнения     |
| --------- | ---------------------- |
| `-1`      | `a < b`                |
| `0`       | `a == b` (по значению) |
| `1`       | `a > b`                |

### Примеры:

```java
BigDecimal a = new BigDecimal("2.0");
BigDecimal b = new BigDecimal("2.00");

System.out.println(a.compareTo(b)); // 0 → Значения равны
```

---

### 2. **Проверка равенства по значению**

```java
if (a.compareTo(b) == 0) {
    System.out.println("Равны по значению");
}
```

> Важно: `a.equals(b)` ❗ сравнивает **и значение, и масштаб** (scale)!

```java
System.out.println(a.equals(b)); // false, т.к. scale разный (1 vs 2)
```

---

## 💡 Как реализовать `<`, `>`, `<=`, `>=`

```java
// a < b
if (a.compareTo(b) < 0) {}

// a > b
if (a.compareTo(b) > 0) {}

// a <= b
if (a.compareTo(b) <= 0) {}

// a >= b
if (a.compareTo(b) >= 0) {}
```

---

## 📌 Итого

| Операция    | Правильный способ            |
| ----------- | ---------------------------- |
| `==`        | `a.compareTo(b) == 0`        |
| `<`         | `a.compareTo(b) < 0`         |
| `>`         | `a.compareTo(b) > 0`         |
| `<=`        | `a.compareTo(b) <= 0`        |
| `>=`        | `a.compareTo(b) >= 0`        |
| `.equals()` | Только если важен scale тоже |

---

## ✅ Резюме для новичка

> **Никогда не используй `==` для `BigDecimal`!**
 
> Всегда используй `.compareTo()` для сравнения значений, 
  особенно если работаешь с деньгами или точными числами.

---

# 📊 Сравнение `BigDecimal` — `compareTo()` vs `equals()`

| `a`      | `b`      | `a.compareTo(b)` | `a.equals(b)` | Комментарий                                    |
| -------- | -------- | ---------------- | ------------- | ---------------------------------------------- |
| `"2.0"`  | `"2.00"` | `0`              | `false`       | Значения равны, но масштабы (`scale`) разные   |
| `"1.5"`  | `"1.50"` | `0`              | `false`       | То же самое — `.equals()` сравнивает и `scale` |
| `"1.00"` | `"1.00"` | `0`              | `true`        | И значение, и масштаб совпадают                |
| `"1.00"` | `"1"`    | `0`              | `false`       | Значения равны, масштабы разные                |
| `"1.01"` | `"1.02"` | `-1`             | `false`       | `a` меньше `b`                                 |
| `"5.5"`  | `"5.4"`  | `1`              | `false`       | `a` больше `b`                                 |
| `"0"`    | `"0.00"` | `0`              | `false`       | Значения равны, масштабы — нет                 |

---

## 📘 Как правильно сравнивать?

```java
BigDecimal a = new BigDecimal("2.0");
BigDecimal b = new BigDecimal("2.00");

System.out.println(a.compareTo(b) == 0); // ✅ true — по значению равны
System.out.println(a.equals(b));         // ❌ false — масштаб разный
```

---

## 🔁 Если хочешь сравнение "и по значению, и по масштабу":

```java
if (a.equals(b)) {
    System.out.println("Полное совпадение: и значение, и масштаб");
}
```

## 🔁 Если интересует только числовое сравнение:

```java
if (a.compareTo(b) == 0) {
    System.out.println("Значения равны (масштаб не важен)");
}
```

---

Вот мини-программа на Java, которая принимает два `BigDecimal`, 
сравнивает их с помощью `.compareTo()` и `.equals()`, 
и выводит подробный результат сравнения:

---

## 💻 Java-код: сравнение двух `BigDecimal`

Скопируйте эту программу и запустите. 
Попробуйте выполнить ее несколько раз 
сравнивая разные числа. 

```java
import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalComparer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значений
        System.out.print("Введите первое число (a): ");
        String inputA = scanner.nextLine();
        BigDecimal a = new BigDecimal(inputA);

        System.out.print("Введите второе число (b): ");
        String inputB = scanner.nextLine();
        BigDecimal b = new BigDecimal(inputB);

        // Сравнение
        System.out.println("\n📊 Результаты сравнения:");
        System.out.println("a = " + a.toPlainString());
        System.out.println("b = " + b.toPlainString());

        // compareTo
        int cmp = a.compareTo(b);
        if (cmp < 0) {
            System.out.println("🔸 a < b (по значению)");
        } else if (cmp > 0) {
            System.out.println("🔸 a > b (по значению)");
        } else {
            System.out.println("🔸 a == b (по значению)");
        }

        // equals
        if (a.equals(b)) {
            System.out.println("✅ a.equals(b) → true (и значение, и масштаб совпадают)");
        } else {
            System.out.println("❌ a.equals(b) → false (масштаб или значение отличаются)");
        }
    }
}
```

---

## 📥 Пример работы программы

```
Введите первое число (a): 2.0
Введите второе число (b): 2.00

📊 Результаты сравнения:
a = 2.0
b = 2.00
🔸 a == b (по значению)
❌ a.equals(b) → false (масштаб или значение отличаются)
```

---

## 🧠 Что можно изучить на этой программе?

* Разницу между `compareTo()` и `equals()`
* Как `BigDecimal` точно сохраняет введённые числа
* Как масштаб влияет на сравнение

---

#### Поддержка, вопросы и обратная связь по проекту
* [Телеграмм группа проекта](https://t.me/+mvRhG9YECTlkZjQ0)
* [Телеграмм автора курса] (@javagurulv)
* [Емейл автора курса] (itguruby@mail.ru)
