package ru.almazrostov.searchdoc.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "docs_actual_version")
public class DocActualVersion {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "doc_uuid", insertable = false, updatable = false)
    private UUID uuid;

    @Column(name = "actual_version")
    private Integer actualVersion;

    @OneToOne
    @JoinColumn(name = "doc_uuid")
    private Doc doc;

    public DocActualVersion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getActualVersion() {
        return actualVersion;
    }

    public void setActualVersion(Integer actualVersion) {
        this.actualVersion = actualVersion;
    }

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }
}
