# 📚 Java Study Tracker

A **console-based Study Tracker application built using Core Java** to help users record their daily study activities, view study logs, generate summaries, and export study data to a CSV file.

The project demonstrates practical implementation of **Object-Oriented Programming, Java Collections Framework, Date and Time API, File Handling, Exception Handling, and CSV Export**.

---

## 🚀 Features

* 📝 Add a new study log
* 📋 View all study logs
* 📅 Automatically record the current study date
* 📊 Generate study summary by date
* 📚 Generate study summary by subject
* 📄 Export study logs to a CSV file
* ⚠️ Handle file-related exceptions
* 🖥️ Menu-driven console interface

---

## 🛠️ Technologies Used

* **Java**
* **Java Collections Framework**

  * `ArrayList`
  * `TreeMap`
* **Java Date and Time API**

  * `LocalDate`
* **Java File Handling**

  * `FileWriter`
* **Exception Handling**

  * `try-with-resources`
  * `IOException`

---

## 📁 Project Structure

```text
Java-Study-Tracker/
│
├── src/
│   ├── StudyLog.java
│   ├── StudyTracker.java
│   └── StudyTrackerApp.java
│
├── README.md
├── LICENSE
└── .gitignore
```

---

## 🏗️ Project Architecture

```text
StudyTrackerApp
       │
       │ Creates and Controls
       ▼
StudyTracker
       │
       │ Stores and Manages
       ▼
ArrayList<StudyLog>
       │
       ▼
StudyLog
```

### `StudyLog`

Represents a single study session and stores:

* Date
* Subject
* Study Duration
* Study Description

### `StudyTracker`

Manages the study logs and provides operations such as:

* Insert a new study log
* Display all logs
* Export data to CSV
* Generate date-wise summaries
* Generate subject-wise summaries

### `StudyTrackerApp`

Contains the `main()` method and provides the menu-driven user interface.

---

## 📋 Application Menu

```text
1 : Insert New Study Log
2 : View All Study Logs
3 : Export Study Log To CSV
4 : Summary Of Study Log By Date
5 : Summary Of Study Log By Subject
6 : Exit The Application
```

---

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone <repository-url>
```

### 2. Navigate to the Source Directory

```bash
cd Java-Study-Tracker/src
```

### 3. Compile the Project

```bash
javac *.java
```

### 4. Run the Application

```bash
java StudyTrackerApp
```

---

## 💻 Sample Output

```text
-------------------------------------------------------
-------------- Welcome to Study Tracker ---------------
-------------------------------------------------------

1 : Insert New Study Log
2 : View All Study Logs
3 : Export Study Log To CSV
4 : Summary Of Study Log By Date
5 : Summary Of Study Log By Subject
6 : Exit The Application

Enter your choice :
```

---

## 📊 Study Log Example

```text
2026-08-22 | Java | 3.0 Hours | Studied ArrayList and TreeMap
2026-08-22 | C++ | 2.0 Hours | Practiced Data Structures
```

---

## 📈 Summary Example

### Summary by Date

```text
Date : 2026-08-22 Total Study Duration : 5.0
```

### Summary by Subject

```text
Subject : C++ Total Study Duration : 2.0
Subject : Java Total Study Duration : 3.0
```

---

## 📄 CSV Export

The application allows users to export all study logs into a CSV file.

The exported CSV file contains:

```text
Date,Subject,Duration of Study,Description of Study
2026-08-22,Java,3.0,Studied ArrayList and TreeMap
2026-08-22,C++,2.0,Practiced Data Structures
```

The CSV file can be opened using applications such as spreadsheet software or any compatible CSV viewer.

---

## 🧠 Concepts Demonstrated

* Object-Oriented Programming
* Classes and Objects
* Encapsulation
* Constructors
* Method Overriding
* Java Collections Framework
* `ArrayList`
* `TreeMap`
* Enhanced For Loop
* Date and Time API
* File Handling
* Exception Handling
* Try-With-Resources
* Menu-Driven Programming

---

## 🔮 Future Enhancements

* [ ] Search study logs by date
* [ ] Search study logs by subject
* [ ] Update an existing study log
* [ ] Delete a study log
* [ ] Calculate total study duration
* [ ] Generate weekly summaries
* [ ] Generate monthly summaries
* [ ] Import study logs from CSV
* [ ] Add persistent data storage using a database
* [ ] Develop a graphical user interface
* [ ] Convert the application into a Spring Boot REST API

---

## 🎯 Learning Objective

This project was developed to practice and strengthen Core Java concepts by building a practical console-based application involving:

> **OOP + Collections + Date/Time API + File Handling + Exception Handling**

---

## 📜 License

This project is licensed under the **MIT License**.

---

## 👨‍💻 Author

**Shubham Gadhe**

---

⭐ If you found this project useful, consider giving the repository a star!
