// ccrm/src/main/java/edu/ccrm/domain/Course.java
package edu.ccrm.domain;

import java.util.Objects;

public class Course {
    private final CourseCode code;
    private String title;
    private int credits;
    private Instructor instructor;
    private Semester semester;
    private String department;

    private Course(Builder b) {
        this.code = Objects.requireNonNull(b.code, "code");
        this.title = Objects.requireNonNull(b.title, "title");
        this.credits = b.credits;
        this.instructor = b.instructor;
        this.semester = Objects.requireNonNull(b.semester, "semester");
        this.department = Objects.requireNonNull(b.department, "department");
    }

    public CourseCode getCode() { return code; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = Objects.requireNonNull(title, "title"); }
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }
    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }
    public Semester getSemester() { return semester; }
    public void setSemester(Semester semester) { this.semester = Objects.requireNonNull(semester, "semester"); }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = Objects.requireNonNull(department, "department"); }

    @Override public String toString() {
        return code + " - " + title + " (" + credits + " credits, " + semester + ", " + department + ")";
    }

    // Static nested Builder (design pattern requirement)
    public static class Builder {
        private CourseCode code;
        private String title;
        private int credits = 3;
        private Instructor instructor;
        private Semester semester = Semester.FALL;
        private String department = "GENERAL";

        public Builder code(CourseCode code) { this.code = code; return this; }
        public Builder title(String title) { this.title = title; return this; }
        public Builder credits(int credits) { this.credits = credits; return this; }
        public Builder instructor(Instructor instructor) { this.instructor = instructor; return this; }
        public Builder semester(Semester semester) { this.semester = semester; return this; }
        public Builder department(String dept) { this.department = dept; return this; }

        public Course build() { return new Course(this); }
    }
}