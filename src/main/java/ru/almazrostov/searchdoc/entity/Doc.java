package ru.almazrostov.searchdoc.entity;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "docs")
public class Doc {
    @Id
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(name = "uuid")
    private UUID uuid;

    @Enumerated(EnumType.STRING)
    @Column(name = "owner_document")
    private OwnerDoc ownerDoc;

    @Column(name = "decimal_number")
    private int decimalNumber;

    @Column(name = "part")
    private String part;

    @Column(name ="creation_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;

    public Doc() {
    }

    public Doc(OwnerDoc owner, int i, String s) {
        this.ownerDoc = owner;
        this.decimalNumber = i;
        this.part = s;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getDecimalNumber() {
        return decimalNumber;
    }

    public void setDecimalNumber(int decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public OwnerDoc getOwnerDoc() {
        return ownerDoc;
    }

    public void setOwnerDoc(OwnerDoc ownerDoc) {
        this.ownerDoc = ownerDoc;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate date) {
        this.creationDate = date;
    }

    @Override
    public String toString() {
        return "Doc{" +
                "uuid=" + uuid +
                ", ownerDoc=" + ownerDoc +
                ", decimalNumber=" + decimalNumber +
                ", part='" + part + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}


