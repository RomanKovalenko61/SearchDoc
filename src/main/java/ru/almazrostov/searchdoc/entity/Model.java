package ru.almazrostov.searchdoc.entity;

public enum Model {
    BG("БГ"),
    MS4("МС4"),
    MS401("МС4-01"),
    MS3("МС3"),
    MS301("МС3-01"),
    MS302("МС3-02"),
    MS2("МС2"),
    MS201("МС2-01"),
    MS1("МС1"),
    MS101("МС1-01"),
    MS102("МС1-02"),
    MS103("МС1-03"),
    MS5("МС5"),
    MS501("МС5-01"),
    MS504("МС5-04"),
    MSNCH("МСНЧ"),
    MSNCH01("МСНЧ-01"),
    MSVKU("МСВКУ"),
    MSVKU2020("MСВКУ после 2020"),
    BK("БК"),
    BK02("БК-02"),
    BK04("БК-04"),
    BSHM("БШМ"),
    BSHM01("БШМ-01"),
    PUDL("ПУДЛ"),
    PUDL01("ПУДЛ-01"),
    PUDL02("ПУДЛ-02"),
    PUDL03("ПУДЛ-03"),
    PUR("ПУР"),
    PUR01("ПУР-01"),
    PUR02("ПУР-02"),
    PUMV("ПУМВ"),
    PUMV01("ПУМВ-01"),
    PUKM("ПУКМ"),
    PUKM01("ПУКМ-01"),
    PUN("ПУН"),
    PUN01("ПУН-01"),
    MS6("МС6"),
    BKBP("БКБП"),
    BKBP01("БКБП-01"),
    TKOM("ТКОМ"),
    TKOM02("ТКОМ-02"),
    AVSKU("АВСКУ"),
    IP50V12AB("ИП50В-12-АБ"),
    AMU5("АМУ-5"),
    AIK("АИК"),
    VOSHOD("Восход"),
    BSHMR("БШМР"),
    KSHMR("КШМР"),
    KR100U("КП-100У"),
    SKM08("СКМ-08"),
    STOIKA71("Э31586Э-71-1"),
    R142("Р-142"),
    FILTR("Фильтр"),
    BAZELIT("БАЗЕЛИТ"),
    OTHER("ДРУГОЕ");

    private String description;

    Model(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
