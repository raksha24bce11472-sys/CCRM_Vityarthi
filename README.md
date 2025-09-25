# Campus Course Records Manager (CCRM)

## Made by 

Name : Raksha Vindya A
Registration Number: 24BCE11472
Course : Programming in Java
Course Code: CSE2006
Institution:VIT Bhopal University
Submission Platform: Vityarthi

## About This Project

This is my Java programming project for managing campus courses and student records. I built this application to learn object-oriented programming and file handling in Java. This project is part of my Programming in Java course this semester, submitted through Vityarthi platform.

## 📌 Overview
Campus Course Records Manager (CCRM) is a **Java SE console-based application** that demonstrates the use of **Object-Oriented Programming (OOP) concepts** and advanced Java features.  
It allows management of:
- Students (add, list, update, deactivate)  
- Courses (add, list, search, assign instructors)  
- Enrollments & Grades (record marks, calculate GPA, transcripts)  
- File operations (import/export, backups, recursion-based utilities)  

This project was built as part of the **Programming in Java course project**.  

---

## 🚀 How to Run
1. Compile all Java files:
   ```sh
   javac -d out src/edu/ccrm/**/*.java

java -cp out edu.ccrm.cli.Main

👉 If you are using VS Code, right-click on Main.java → Run Java.

🖥️ Features Implemented
Student Management (add, list, deactivate students)
Course Management (create, list, search courses)
Enrollment & GPA (enroll students, assign grades, calculate GPA)
Transcripts (print student transcripts with grades & GPA)
Import/Export data (CSV/JSON-like simulation)
Backup System (timestamped folder creation using NIO.2)
Recursion Utilities (calculate folder size recursively)
Menu-Driven CLI (user-friendly interface)

📘 Java Basics (as required in project)
Evolution of Java
1995 – Java 1.0 (Sun Microsystems, applets & portability)
2004 – Java 5 (Generics, Enums, Annotations)
2014 – Java 8 (Streams, Lambdas)
2017 – Java 9+ (Modules, JShell)
Present – Java 17/21 (LTS, Records, Switch enhancements)

| Edition                          | Use Case                      |
| -------------------------------- | ----------------------------- |
| **Java ME (Micro Edition)**      | Mobile/embedded devices       |
| **Java SE (Standard Edition)**   | Desktop & console apps        |
| **Java EE (Enterprise Edition)** | Web servers & enterprise apps |

JDK vs JRE vs JVM
JDK (Java Development Kit) → tools for developers (compiler, debugger, libraries)
JRE (Java Runtime Environment) → runs Java programs, contains JVM + libraries
JVM (Java Virtual Machine) → engine that executes Java bytecode

🛠️ Project Setup
Installation
1.Install JDK 17 or later → verify:
java -version
2.Install VS Code + Extension Pack for Java.
3.Clone this repo:
git clone <your-repo-link>
cd CampusCourseRecordsManager

Screenshots
✅ java -version output
✅ VS Code folder structure
✅ Running CLI menu in terminal
✅ Backup folder created

🏗️ OOP & Advanced Concepts Mapping
| Concept                           | Where Implemented                                        |
| --------------------------------- | -------------------------------------------------------- |
| **Encapsulation**                 | `Person.java`, `Student.java`                            |
| **Inheritance**                   | `Student`, `Instructor` extend `Person`                  |
| **Abstraction**                   | `Person` (abstract class)                                |
| **Polymorphism**                  | Transcript printing (`TranscriptServiceImpl`)            |
| **Method Overloading/Overriding** | Services, domain classes                                 |
| **Interfaces**                    | `StudentService`, `CourseService`, etc.                  |
| **Immutability**                  | `CourseCode.java`                                        |
| **Nested Classes**                | (Add inner/static class if required)                     |
| **Enums**                         | `Grade.java`, `Semester.java`                            |
| **Lambdas & Streams**             | Filtering/searching courses                              |
| **Singleton**                     | `AppConfig.java`                                         |
| **Builder Pattern**               | `CourseBuilder.java`                                     |
| **Exception Handling**            | Custom exceptions (e.g., `DuplicateEnrollmentException`) |
| **Assertions**                    | Data validation                                          |
| **Recursion**                     | `RecursionUtils.java`                                    |
| **NIO.2**                         | `BackupService.java`, `ImportExportService.java`         |

📂 Repository Structure
src/edu/ccrm/
 ├─ cli/        → Main.java (menu-driven UI)
 ├─ domain/     → Entities (Student, Instructor, Course, etc.)
 ├─ service/    → Business logic (StudentService, CourseService)
 ├─ io/         → Import/Export, Backup handling
 ├─ util/       → Validators, Comparators, Recursion
 └─ config/     → Singleton & Builder classes

 📷 Sample Screenshots
