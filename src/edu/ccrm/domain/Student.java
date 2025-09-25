// ccrm/src/main/java/edu/ccrm/domain/Student.java
package edu.ccrm.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends Person {
    private final String regNo;
    private String status; // ACTIVE / INACTIVE
    private final List<String> enrolledCourseCodes = new ArrayList<>();
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private final FullName name;

    public Student(String id, String regNo, FullName name, String email) {
        super(id, email);
        this.regNo = Objects.requireNonNull(regNo, "regNo");
        this.name = Objects.requireNonNull(name, "name");
        this.status = "ACTIVE";
        this.createdAt = LocalDateTime.now();
        this.updatedAt = this.createdAt;
    }

    public String getRegNo() { return regNo; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = Objects.requireNonNull(status, "status"); this.updatedAt = LocalDateTime.now(); }
    public List<String> getEnrolledCourseCodes() { return enrolledCourseCodes; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    @Override public String fullName() { return name.value(); }
}