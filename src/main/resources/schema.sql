DROP TABLE IF EXISTS Relation;
DROP TABLE IF EXISTS Passion;
DROP TABLE IF EXISTS CreditCard;
DROP TABLE IF EXISTS relation;
DROP TABLE IF EXISTS passion;
DROP TABLE IF EXISTS credit_card;

CREATE TABLE passion (
  id_passion INT AUTO_INCREMENT PRIMARY KEY,
  name_passion NVARCHAR(64) NOT NULL
);

CREATE TABLE credit_card (
  id_card INT AUTO_INCREMENT PRIMARY KEY,
  name_card NVARCHAR(64) NOT NULL
);

CREATE TABLE relation (
  id INT AUTO_INCREMENT PRIMARY KEY,
  salary_from DECIMAL(8,2) NOT NULL,
  salary_to DECIMAL(8,2) NOT NULL,
  age_from INT NOT NULL,
  age_to INT NOT NULL,
  id_passion INT NOT NULL,
  FOREIGN KEY (id_passion) REFERENCES passion(id_passion),
  id_card INT NOT NULL,
  FOREIGN KEY (id_card) REFERENCES credit_card(id_card)
);