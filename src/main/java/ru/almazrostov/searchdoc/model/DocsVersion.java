package ru.almazrostov.searchdoc.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "docs_version")
public class DocsVersion {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(name = "doc_uuid", insertable = false, updatable = false)
    private UUID uuid;

    @Column(name = "version")
    private int version;

    @Column(name = "description")
    private String description;

    @Column(name = "href")
    private String href;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doc_uuid")
    private Doc doc;

    public DocsVersion() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "DocsVersion{" +
                "uuid=" + uuid +
                ", version=" + version +
                ", description='" + description + '\'' +
                ", href='" + href + '\'' +
                '}';
    }
}
