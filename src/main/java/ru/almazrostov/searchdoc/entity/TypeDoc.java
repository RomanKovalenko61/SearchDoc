package ru.almazrostov.searchdoc.entity;

public enum TypeDoc {
    NOTIFICATION("ПИ"),
    MODIFICATION("ИИ"),
    OFFERING("ПР"),
    DETAIL("Деталь"),
    SPECIFICATION("Спецификация"),
    ASSEMBLY("СБ"),
    ELECTRIC_SCHEME("Э3"),
    SHOPPING_LIST("ВП"),
    LETTER("Письмо"),
    ACT("Акт"),
    SERVICE("Служебная записка"),
    TECHNOLOGY("ТП"),
    DEVIATION("КРО"),
    OTHER("НЕ ВЫБРАНО");

    private final String description;

    TypeDoc(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
