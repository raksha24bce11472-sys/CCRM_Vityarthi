// src/main/java/edu/ccrm/domain/CourseCode.java
package edu.ccrm.domain;

import java.util.Objects;

public final class CourseCode {
    private final String value;

    public CourseCode(String value) {
        String v = Objects.requireNonNull(value, "value").trim().toUpperCase();
        if (!v.matches("[A-Z]{2,4}\\d{3}")) {
            throw new IllegalArgumentException("Invalid course code: " + value);
        }
        this.value = v;
    }

    public String value() { return value; }
    @Override public String toString() { return value; }
    @Override public boolean equals(Object o) { return (o instanceof CourseCode cc) && cc.value.equals(this.value); }
    @Override public int hashCode() { return value.hashCode(); }
}