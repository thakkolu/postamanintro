CREATE TABLE batch
(
    id            BIGINT       NOT NULL,
    name          VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    CONSTRAINT pk_batch PRIMARY KEY (id)
);

CREATE TABLE products
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255)          NULL,
    category      VARCHAR(500)          NULL,
    `description` TEXT                  NULL,
    CONSTRAINT pk_products PRIMARY KEY (id)
);

CREATE TABLE students
(
    id   BIGINT       NOT NULL,
    name VARCHAR(255) NULL,
    b_id BIGINT       NULL,
    CONSTRAINT pk_students PRIMARY KEY (id)
);

ALTER TABLE students
    ADD CONSTRAINT FK_STUDENTS_ON_B FOREIGN KEY (b_id) REFERENCES batch (id);