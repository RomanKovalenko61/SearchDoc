package ru.almazrostov.searchdoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.almazrostov.searchdoc.entity.Doc;

import java.util.UUID;

public interface DocsRepository extends JpaRepository<Doc, UUID> {

}
