Давай разберёмся — **что такое масштаб (scale)** 
и **округление (rounding)** у типа `BigDecimal` в Java, 
и как с ними работать.

---

# 📏 Масштаб и округление у `BigDecimal` в Java

---

## 🧠 Что такое **scale** (масштаб)?

**Масштаб** — это количество знаков после запятой у числа `BigDecimal`.

### Примеры:

```java
BigDecimal a = new BigDecimal("2.00");   // scale = 2
BigDecimal b = new BigDecimal("3.5");    // scale = 1
BigDecimal c = new BigDecimal("4");      // scale = 0
```

```java
System.out.println(a.scale()); // 2
System.out.println(b.scale()); // 1
System.out.println(c.scale()); // 0
```

---

## 🔁 Зачем использовать масштаб?

Масштаб часто важен в:

* финансовых расчетах (например, 2 знака для копеек)
* расчётах с точностью до тысячных/миллионных
* выравнивании формата перед выводом

---

## ✂️ Установка масштаба вручную

### Метод: `setScale(int scale, RoundingMode mode)`

```java
BigDecimal value = new BigDecimal("2.4567");

BigDecimal scaled = value.setScale(2, RoundingMode.HALF_UP); // 2.46
System.out.println(scaled); // 2.46
```

---

## 🧾 Поддерживаемые режимы округления (`RoundingMode`)

| Режим         | Что делает (просто)                               |
| ------------- | ------------------------------------------------- |
| `HALF_UP`     | Округляет вверх, если >= .5 (обычное округление)  |
| `HALF_DOWN`   | Округляет вниз, если ровно .5                     |
| `UP`          | Всегда вверх                                      |
| `DOWN`        | Всегда вниз (обрезка, как `truncate`)             |
| `CEILING`     | Вверх к +∞                                        |
| `FLOOR`       | Вниз к -∞                                         |
| `HALF_EVEN`   | "банковское" округление (.5 к ближайшему чётному) |
| `UNNECESSARY` | Ошибка, если требуется округление                 |

---

## 📘 Примеры округления

```java
BigDecimal x = new BigDecimal("2.456");

System.out.println(x.setScale(2, RoundingMode.HALF_UP));   // 2.46
System.out.println(x.setScale(2, RoundingMode.DOWN));      // 2.45
System.out.println(x.setScale(2, RoundingMode.UP));        // 2.46
```

---

## ⚠️ Без указания `RoundingMode` — ошибка!

```java
BigDecimal x = new BigDecimal("1.999");
x.setScale(2); // ❌ ArithmeticException
```

> Потому что Java не знает, **как округлять** — ты должен указать `RoundingMode`.

---

## ✅ Вывод значения с нужной точностью

```java
BigDecimal price = new BigDecimal("123.4567");
System.out.println(price.setScale(2, RoundingMode.HALF_UP)); // 123.46
```

---

## 🧠 Когда использовать `setScale()`?

* Перед выводом или сохранением
* При расчётах с фиксированной точностью (например, 2 знака — копейки)
* После деления `divide()`, если не указал `scale` напрямую

---

## 🔄 Альтернатива: задать `scale` сразу при создании

```java
BigDecimal amount = new BigDecimal("123.4567").setScale(2, RoundingMode.HALF_UP);
```

---

## 💡 Совет новичку

> **Всегда указывай `scale` и `RoundingMode` при делении или округлении.**
> Это защитит тебя от неожиданных ошибок и обеспечит точный результат.

---

#### Поддержка, вопросы и обратная связь по проекту
* [Телеграмм группа проекта](https://t.me/+mvRhG9YECTlkZjQ0)
* [Телеграмм автора курса] (@javagurulv)
* [Емейл автора курса] (itguruby@mail.ru)
