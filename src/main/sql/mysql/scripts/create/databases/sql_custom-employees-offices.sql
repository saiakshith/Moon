CREATE DATABASE IF NOT EXISTS sql_custom;
USE sql_custom;

-- DROP TABLE IF EXISTS employees;
-- DROP TABLE IF EXISTS offices;

CREATE TABLE IF NOT EXISTS offices (
	office_id INT PRIMARY KEY AUTO_INCREMENT,
    address VARCHAR(255) NOT NULL,
    city VARCHAR(55) NOT NULL,
    state VARCHAR(55) NOT NULL
);

DELETE FROM offices;
INSERT INTO offices VALUES (1, 'Kummari Bazar', 'Khammam', 'Telangana');
INSERT INTO offices VALUES (2, 'Subash Nagar, Near Padala Rama Reddy\'s Law College', 'Hyderabad', 'Telangana');
INSERT INTO offices VALUES (3, 'Church Compound', 'Warangal', 'Telangana');

ALTER TABLE offices
RENAME COLUMN new_office_id TO office_id;

CREATE TABLE IF NOT EXISTS employees (
	employee_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(55) NOT NULL,
    last_name VARCHAR(55) NOT NULL,
    joined_date DATETIME NOT NULL DEFAULT NOW(),
    office_id INT NOT NULL,
    CONSTRAINT fk_employees_offices FOREIGN KEY (office_id) REFERENCES offices (office_id)
		ON UPDATE CASCADE 
        ON DELETE NO ACTION
);

DELETE FROM employees;
INSERT INTO employees VALUES (1, 'Veera', 'Narayana', NOW(), 2);
INSERT INTO employees VALUES (2, 'Sai', 'Akshith', NOW(), 1);
INSERT INTO employees VALUES (3, 'Akhil', 'Pappala', NOW(), 3);

ALTER TABLE employees
DROP COLUMN test_column;




