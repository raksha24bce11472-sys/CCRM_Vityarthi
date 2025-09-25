// ccrm/src/main/java/edu/ccrm/domain/Instructor.java
package edu.ccrm.domain;

import java.util.Objects;

public class Instructor extends Person {
    private final FullName name;

    public Instructor(String id, FullName name, String email) {
        super(id, email);
        this.name = Objects.requireNonNull(name, "name");
    }

    @Override public String fullName() { return name.value(); }
}