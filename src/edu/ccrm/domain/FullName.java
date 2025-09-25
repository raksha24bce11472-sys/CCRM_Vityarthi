// src/main/java/edu/ccrm/domain/FullName.java
package edu.ccrm.domain;

import java.util.Objects;

public final class FullName {
    private final String value;

    public FullName(String value) {
        String v = Objects.requireNonNull(value, "value").trim().replaceAll("\\s+", " ");
        if (v.isEmpty()) throw new IllegalArgumentException("Empty name");
        this.value = v;
    }

    public String value() { return value; }
    @Override public String toString() { return value; }
    @Override public boolean equals(Object o) { return (o instanceof FullName n) && n.value.equals(this.value); }
    @Override public int hashCode() { return value.hashCode(); }
}