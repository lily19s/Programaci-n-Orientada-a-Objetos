package com.example._models;

public class TeamMember extends Person {

    private String role;

    public TeamMember(String role, String name, String email) {
        super(name, email);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return getName() + "( " + role + ")";
    }

}
