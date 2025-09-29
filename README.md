# 📚 Sprint 1 - Java Collections, JUnit & AssertJ - Level 1 & Level 2

## 📄 Description

This repository contains exercises for **Level 1** and **Level 2** focused on Java collections, exception handling, and unit testing with **JUnit** and **AssertJ**.

The exercises follow best practices from Sprint 0, using Maven as the build tool and dependency manager. All code is structured in separate packages for production and test classes.

---

## 🧩 Level 1 - JUnit Exercises

### Exercise 1 - Library Book Management

- Create a Java class to manage a collection of books in a library.
- Functionalities:
  - Add books to the collection.
  - Retrieve the full list of books.
  - Get a book title by its position.
  - Add a book at a specific position.
  - Remove a book by its title.
- Verified by JUnit tests that:
  - The book list is not null after creation.
  - The list size updates correctly when adding/removing books.
  - Books appear in the correct position.
  - No duplicate book titles are allowed.
  - The list remains sorted alphabetically after modifications.

### Exercise 2 - DNI Letter Calculation

- Create a class named `CalculoDni` that calculates the DNI letter given a number.
- Parametrized JUnit tests verify the calculation correctness for 10 predefined DNI numbers.

### Exercise 3 - Exception Handling

- Create a class with a method that throws `ArrayIndexOutOfBoundsException`.
- Verify the exception is thrown correctly with JUnit.

---

## 🧩 Level 2 - AssertJ Exercises

### Exercise 1

- Assertion to verify two integer objects are equal and another to verify they are not.

### Exercise 2

- Assertion to verify two object references are the same and another that they are different.

### Exercise 3

- Assertion to verify two integer arrays are identical.

### Exercise 4

- Create an `ArrayList` containing various types of objects.
- Assertions to verify:
  - The order of objects as inserted.
  - The list contains the objects regardless of order.
  - One object appears only once.
  - One object that is not added does not exist in the list.

### Exercise 5

- Create a `Map` and verify it contains a specific key.

### Exercise 6

- Provokes an `ArrayIndexOutOfBoundsException` in any class.
- Assertion to validate that the exception is thrown as expected.

### Exercise 7

- Create an empty `Optional` object.
- Assertion to verify that the `Optional` is indeed empty.

  ---

## 📝 Notes

- Follow the project structure: production code in `src/main/java`, tests in `src/test/java`.
- All code is written in English.
- Make sure to adhere to the Sprint 0 coding guidelines.
- Maven handles all dependencies; no manual jar downloads needed.

---

## 💻 Technologies Used

- Java 17+
- Maven
- JUnit 5
- AssertJ
- IntelliJ IDEA
- Git & GitHub

---

## 🚀 How to Compile and Run

1. **Clone the repository:**

   ```bash
   git clone https://github.com/christo256/S1.04---Testing---Level-1-2--
   cd S1.04---Testing---Level-1-2--
