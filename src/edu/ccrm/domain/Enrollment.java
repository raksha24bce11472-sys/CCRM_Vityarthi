// ccrm/src/main/java/edu/ccrm/domain/Enrollment.java
package edu.ccrm.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Enrollment {
    private final String studentId;
    private final CourseCode courseCode;
    private final Semester semester;
    private final LocalDateTime enrolledAt;
    private Integer marks;        // nullable until graded
    private Grade letterGrade;    // nullable until graded

    public Enrollment(String studentId, CourseCode courseCode, Semester semester) {
        this.studentId = Objects.requireNonNull(studentId, "studentId");
        this.courseCode = Objects.requireNonNull(courseCode, "courseCode");
        this.semester = Objects.requireNonNull(semester, "semester");
        this.enrolledAt = LocalDateTime.now();
    }

    public String getStudentId() { return studentId; }
    public CourseCode getCourseCode() { return courseCode; }
    public Semester getSemester() { return semester; }
    public LocalDateTime getEnrolledAt() { return enrolledAt; }
    public Integer getMarks() { return marks; }
    public Grade getLetterGrade() { return letterGrade; }

    public void recordMarks(int marks) { this.marks = marks; }
    public void assignGrade(Grade grade) { this.letterGrade = grade; }

    @Override public String toString() {
        return studentId + " -> " + courseCode + " (" + semester + "), marks=" + marks + ", grade=" + letterGrade;
    }
}