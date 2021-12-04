DROP TABLE IF EXISTS contact;
CREATE TABLE contact(
    contact_id INT(10) NOT NULL AUTO_INCREMENT,
    contact_name VARCHAR(30) NOT NULL,
    contact_address VARCHAR(30) NOT NULL,
    contact_phone VARCHAR(30) NOT NULL,
    PRIMARY KEY(contact_id)
);