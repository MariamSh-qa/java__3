# Java – Lecture 3

## 1. For Loop
Used to repeat code a specific number of times.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

- `int i = 0` – starting point.
- `i < 5` – condition.
- `i++` – increases by 1.
- `i--` – decreases by 1.
- `i = i + 2` – increases by 2.
- `i <= 5` – includes 5.

### Even Numbers
```java
for (int i = 2; i <= 10; i = i + 2) {
    System.out.println(i);
}
```

## 2. While Loop
Repeats code while the condition is true.

```java
int i = 0;

while (i <= 3) {
    System.out.println(i);
    i++;
}
```

**Remember:** Always update the variable (`i++`) to avoid an infinite loop.

## 3. Nested Loops
A loop inside another loop. The inner loop completes all its iterations before the outer loop continues.

```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.println(j);
    }
}
```

## 4. Break and Continue

- `break` – stops the entire loop.
- `continue` – skips the current iteration and moves to the next one.

```java
if (i == 3) {
    break;
}
```

```java
if (i == 3) {
    continue;
}
```

## 5. Scanner with While Loop
Used to receive input from the user.

```java
Scanner scanner = new Scanner(System.in);

int number = scanner.nextInt();

while (number != 0) {
    System.out.println(number);
    number = scanner.nextInt();
}

scanner.close();
```

- `nextInt()` – reads an integer.
- `number != 0` – continues while the number is not zero.
- When the user enters `0`, the loop stops.

## 6. String: length() and charAt()

```java
String text = "Test";

text.length();  // Returns the number of characters (4).
text.charAt(0); // Returns the character at index 0 (T).
```

- `length()` – counts characters starting from 1.
- `charAt()` – gets a character at a specific index.
- String indexes start from 0.

**Printing characters separately:**

```java
for (int i = 0; i < text.length(); i++) {
    System.out.println(text.charAt(i));
}
```

## 7. Arrays (Massives)

An array stores multiple values of the same data type.

**Creating an array:**
```java
int[] ages = {2, 4, 8};
```

| Index | Value |
|---|---|
| 0 | 2 |
| 1 | 4 |
| 2 | 8 |

**Accessing elements:**
```java
System.out.println(ages[0]);
```

**Array length:**
```java
System.out.println(ages.length);
```

**Printing all elements:**
```java
for (int i = 0; i < ages.length; i++) {
    System.out.println(ages[i]);
}
```

**Changing an element:**
```java
String[] names = {"Mariami", "nino", "ana"};
names[1] = "Lela";
```

### Creating an Array with a Fixed Size

```java
int[] numbers = new int[5];
```

Default array values:

| Data type | Default value |
|---|---|
| int | 0 |
| double | 0.0 |
| boolean | false |
| String | null |

## 8. Boolean Arrays

Boolean stores only `true` or `false`.

```java
boolean[] array = new boolean[5];
```

All elements are initially `false`.

**Changing even indexes to true:**

```java
for (int i = 0; i < array.length; i++) {
    if (i % 2 == 0) {
        array[i] = true;
    }
    System.out.println(array[i]);
}
```

- `%` – returns the remainder.
- `i % 2 == 0` – checks even indexes.
- `i % 2 != 0` – checks odd indexes.

## 9. Array Sum and Counting

**Calculate the sum of elements:**

```java
int[] array = {3, 7, 2};
int sum = 0;

for (int i = 0; i < array.length; i++) {
    sum = sum + array[i];
}

System.out.println(sum);
```

**Count even numbers (excluding zero):**

```java
int[] array1 = {3, 7, 2, 4, 8};
int count = 0;

for (int i = 0; i < array1.length; i++) {
    if (array1[i] % 2 == 0 & array1[i] != 0) {
        count++;
    }
}
System.out.println(count);
```

- `sum = sum + array[i]` – adds array elements.
- `count++` – increases the counter by 1.

## 10. Printing an Array Backwards

```java
int[] numbers = {7, 18, 0, 8, -19};

for (int i = numbers.length - 1; i >= 0; i--) {
    System.out.println(numbers[i]);
}
```

- `length - 1` – last index.
- `i >= 0` – continues until the first index.
- `i--` – moves backwards.

## 11. compareTo()

Compares two Strings lexicographically (based on character values).

```java
String text4 = "Apple";
String text5 = "Banana";
String text6 = "Apple";

System.out.println(text4.compareTo(text5));
System.out.println(text5.compareTo(text4));
System.out.println(text4.compareTo(text6));
```

| Result | Meaning |
|---|---|
| Negative number | First String comes before the second |
| Positive number | First String comes after the second |
| 0 | Both Strings are equal |

**Important:** The result is not always exactly -1 or 1.

---

## Important Java Symbols

| Symbol | Meaning |
|---|---|
| `=` | Assign a value |
| `==` | Compare equality |
| `!=` | Not equal |
| `%` | Modulus (remainder) |
| `++` | Increase by 1 |
| `--` | Decrease by 1 |
| `&&` | AND |
| `||` | OR |
| `<` | Less than |
| `>` | Greater than |
| `<=` | Less than or equal |
| `>=` | Greater than or equal |
