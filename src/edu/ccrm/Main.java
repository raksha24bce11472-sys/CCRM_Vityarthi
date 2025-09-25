package edu.ccrm.cli;

import edu.ccrm.service.*;
import edu.ccrm.domain.*;
import java.util.Scanner;
import edu.ccrm.io.ImportExportService;
import edu.ccrm.io.BackupService;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();
        CourseService courseService = new CourseServiceImpl();

        ImportExportService ioService = new ImportExportService();
        BackupService backupService = new BackupService();


        int choice;
        do {
            System.out.println("\n===== Campus Course & Records Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Add Course");
            System.out.println("4. List Courses");
            System.out.println("5. Export Students");
            System.out.println("6. Backup Exported File");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Reg No: ");
                    String regNo = sc.nextLine();

                    Student s = new Student(id, name, email, regNo);
                    studentService.addStudent(s);
                    System.out.println("Student added.");
                }
                case 2 -> studentService.listStudents()
                        .forEach(stu -> System.out.println(stu.toString()));
                case 3 -> {
                    System.out.print("Enter Course Code: ");
                    String code = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Credits: ");
                    int credits = sc.nextInt(); sc.nextLine();
                    Course c = new Course(code, title, credits, null, Semester.FALL, "CSE");
                    courseService.addCourse(c);
                    System.out.println("Course added.");
                }
                case 4 -> courseService.listCourses()
                        .forEach(c -> System.out.println(c.toString()));

                case 5 -> {
                  ioService.exportStudents(studentService.listStudents(), "data/exported_students.csv");
                }
                case 6 -> {
                  backupService.backupFile("data/exported_students.csv", "backups");
                }
                case 7 -> System.out.println("Exiting...");
                
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}
