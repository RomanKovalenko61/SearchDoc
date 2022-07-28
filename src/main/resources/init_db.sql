CREATE TABLE IF NOT EXISTS db_search_doc.public.docs (
    uuid CHARACTER VARYING(36),
    owner_document CHARACTER VARYING(36),
    decimal_number INTEGER,
    part CHARACTER VARYING(3),
    creation_date DATE,

    PRIMARY KEY(uuid)
);

DROP TABLE db_search_doc.public.docs;

