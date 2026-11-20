package com.example._models;

public class Person {

    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getInitials() {
        String[] parts = name.trim().split(" ");
        if (parts[0].isEmpty()) {
            return "?";
        }
        String initials = parts[0].substring(0, 1);
        if (parts.length > 1 && !parts[1].isEmpty()) {
            initials += parts[1].substring(0, 1);
        }
        return initials.toUpperCase();
    }

    @Override
    public String toString() {
        return name;
    }
}
