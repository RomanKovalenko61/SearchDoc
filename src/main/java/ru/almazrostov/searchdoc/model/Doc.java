package ru.almazrostov.searchdoc.model;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

    @Column(name = "of_parts")
    private int ofParts;

    @Column(name = "creation_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;

    @Column(name = "expiration_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate expirationDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_doc")
    private TypeDoc typeDoc;

    @Enumerated(EnumType.STRING)
    @Column(name = "product")
    private Product product;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "doc")
    private List<DocsVersion> docsVersionList;

    public Doc() {
    }

    public void addDocVersion(DocsVersion docsVersion) {
        if (docsVersionList == null) {
            docsVersionList = new ArrayList<>();
        }
        docsVersionList.add(docsVersion);
        docsVersion.setDoc(this);
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

    public int getOfParts() {
        return ofParts;
    }

    public void setOfParts(int ofParts) {
        this.ofParts = ofParts;
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

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public TypeDoc getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(TypeDoc typeDoc) {
        this.typeDoc = typeDoc;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product model) {
        this.product = model;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<DocsVersion> getDocsVersionList() {
        return docsVersionList;
    }

    public void setDocsVersionList(List<DocsVersion> docsVersionList) {
        this.docsVersionList = docsVersionList;
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


