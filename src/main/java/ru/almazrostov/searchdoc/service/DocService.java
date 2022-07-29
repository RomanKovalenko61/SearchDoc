package ru.almazrostov.searchdoc.service;

import ru.almazrostov.searchdoc.model.Doc;
import ru.almazrostov.searchdoc.model.Product;

import java.util.List;
import java.util.UUID;

public interface DocService {

    List<Doc> getAllDocs();

    void saveDoc(Doc doc);

    Doc getDocById(UUID uuid);

    void deleteDocById(UUID uuid);

    List<Doc> findAllByProduct(Product product);
}
