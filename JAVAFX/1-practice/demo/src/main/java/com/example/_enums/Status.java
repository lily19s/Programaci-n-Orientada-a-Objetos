package com.example._enums;

public enum Status {

    TODO("Pendiente"), 
    INPROGRESS("En progreso"),
    COMPLETED("Completada");

    private final String label;

    private Status(String label) {
        this.label = label;
    }

    @Override 
    public String toString(){
        return label;
    }
    


}
