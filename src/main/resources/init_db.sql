CREATE DATABASE db_search_doc;

CREATE TABLE IF NOT EXISTS db_search_doc.public.docs (
    uuid CHARACTER VARYING(36),
    owner_document CHARACTER VARYING(36),
    decimal_number INTEGER,
    part CHARACTER VARYING(3),
    creation_date DATE,
    expiration_date DATE,
    type_doc CHARACTER VARYING(36),
    product CHARACTER VARYING(36),
    status CHARACTER VARYING(36),
    of_parts INTEGER,

    PRIMARY KEY(uuid)
);

CREATE TABLE IF NOT EXISTS db_search_doc.public.docs_version (
    id BIGINT,
    uuid CHARACTER VARYING(36),
    version INTEGER,
    description TEXT,
    href TEXT,

    PRIMARY KEY (id),
    FOREIGN KEY (uuid) REFERENCES db_search_doc.public.docs(uuid)
);

DROP TABLE db_search_doc.public.docs;
DROP TABLE db_search_doc.public.docs_version;
