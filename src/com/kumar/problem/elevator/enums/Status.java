package com.kumar.problem.elevator.enums;

interface BaseEnm {
    String getDescription();
}

public enum Status implements BaseEnm {
    MOVING("Moving"),
    IDLE("IDLE");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
