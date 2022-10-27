DROP TABLE IF EXISTS Exchange_Value;  
CREATE TABLE Exchange_Value (  
id INT AUTO_INCREMENT  PRIMARY KEY,  
currency_from VARCHAR(50) NOT NULL,  
currency_to VARCHAR(50) NOT NULL,
currency_multiple Decimal(10,2) NOT NULL, 
port INT
);