package ru.almazrostov.searchdoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.almazrostov.searchdoc.model.Doc;
import ru.almazrostov.searchdoc.repository.DocsRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DocServiceImpl implements DocService {

    private final DocsRepository docsRepository;

    @Autowired
    public DocServiceImpl(DocsRepository docsRepository) {
        this.docsRepository = docsRepository;
    }

    @Override
    @Transactional
    public List<Doc> getAllDocs() {
        return docsRepository.findAll();
    }

    @Override
    @Transactional
    public void saveDoc(Doc doc) {
        docsRepository.save(doc);
    }

    @Override
    @Transactional
    public Doc getDocById(UUID uuid) {
        Optional<Doc> optional = docsRepository.findById(uuid);
        Doc doc = null;
        if (optional.isPresent()) {
            doc = optional.get();
        } else {
            throw new RuntimeException("Doc not found for uuid :: " + uuid);
        }
        return doc;
    }

    @Override
    @Transactional
    public void deleteDocById(UUID uuid) {
        docsRepository.deleteById(uuid);
    }
}
