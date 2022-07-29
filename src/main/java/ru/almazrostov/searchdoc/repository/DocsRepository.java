package ru.almazrostov.searchdoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.almazrostov.searchdoc.model.Doc;
import ru.almazrostov.searchdoc.model.Product;

import java.util.List;
import java.util.UUID;

@Repository
public interface DocsRepository extends JpaRepository<Doc, UUID> {
    List<Doc> findAllByProduct(Product product);
}
