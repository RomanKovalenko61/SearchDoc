INSERT INTO docs(uuid, owner_document, decimal_number, part, creation_date, expiration_date, type_doc,
                 product, status, of_parts)
VALUES ('2c8bd985-8767-4f37-97c9-cfb565ff54ff', 'SOZVEZDIE', 464856, '023', '2022-08-19', '2022-08-29', 'DETAIL',
        'AVSKU', 'ACTIVE', 0);

INSERT INTO docs_version(doc_uuid, version, description, href)
VALUES ('2c8bd985-8767-4f37-97c9-cfb565ff54ff', 0, 'descript0', 'href0');
INSERT INTO docs_version(doc_uuid, version, description, href)
VALUES ('2c8bd985-8767-4f37-97c9-cfb565ff54ff', 1, 'descript1', 'href1');
INSERT INTO docs_version(doc_uuid, version, description, href)
VALUES ('2c8bd985-8767-4f37-97c9-cfb565ff54ff', 2, 'descript2', 'href2');
INSERT INTO docs_version(doc_uuid, version, description, href)
VALUES ('2c8bd985-8767-4f37-97c9-cfb565ff54ff', 3, 'descript3', 'href3');

INSERT INTO docs_actual_version(doc_uuid, actual_version)
VALUES ('2c8bd985-8767-4f37-97c9-cfb565ff54ff', 2);