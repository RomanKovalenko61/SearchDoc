CREATE DATABASE db_search_doc;

CREATE TABLE IF NOT EXISTS db_search_doc.public.docs (
    uuid CHARACTER VARYING(36),
    owner_document CHARACTER VARYING(36),
    decimal_number INTEGER,
    part CHARACTER VARYING(3),
    creation_date DATE,
    expiration_date DATE,
    type_doc CHARACTER VARYING(36),
    model CHARACTER VARYING(36),
    status CHARACTER VARYING(36),

    PRIMARY KEY(uuid)
);
