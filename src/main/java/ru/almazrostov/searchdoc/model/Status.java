package ru.almazrostov.searchdoc.model;

public enum Status {
    ACTIVE("В работе"),
    CANCELLED("Отклонено"),
    ACCEPTED("Погашено");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
