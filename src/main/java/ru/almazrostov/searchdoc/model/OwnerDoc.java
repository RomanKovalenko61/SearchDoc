package ru.almazrostov.searchdoc.model;

public enum OwnerDoc {
    ALMAZ("КСДИ"),
    SOZVEZDIE("ИТНЯ"),
    OTHER("...");


    private String name;

    OwnerDoc(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
