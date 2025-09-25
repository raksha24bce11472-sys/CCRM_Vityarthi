package edu.ccrm.domain;
import java.util.Objects;

public abstract class Person {
    private final String id;
    private String email;

    protected Person(String id, String email) {
        this.id = Objects.requireNonNull(id, "id");
        this.email = Objects.requireNonNull(email, "email");
    }

    public String getId() { return id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = Objects.requireNonNull(email, "email"); }

    public abstract String fullName();

    @Override public String toString() { return fullName() + " <" + email + ">"; }
}