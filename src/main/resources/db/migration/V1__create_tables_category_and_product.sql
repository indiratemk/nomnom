CREATE TABLE product (
   product_id INT NOT NULL AUTO_INCREMENT,
   product_title VARCHAR(45) NULL,
   product_description VARCHAR(255) NULL,
   product_image VARCHAR(45) NULL,
   product_price INT NULL,
   category_id INT NULL,
   PRIMARY KEY (product_id));

CREATE TABLE category (
   category_id INT NOT NULL AUTO_INCREMENT,
   category_title VARCHAR(45) NULL,
   PRIMARY KEY (category_id));

ALTER TABLE product
ADD INDEX fk_product_1_idx (category_id ASC);
ALTER TABLE product
ADD CONSTRAINT fk_product_1
  FOREIGN KEY (category_id)
  REFERENCES category (category_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;