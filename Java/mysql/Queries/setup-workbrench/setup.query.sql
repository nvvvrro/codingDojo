CREATE DATABASE setup;

USE setup; 

CREATE TABLE IF NOT EXISTS setup.users (
	id INT NOT NULL auto_increment,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    handle VARCHAR(100),
    age INT,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP, 
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

INSERT INTO `users`(`id`, `first_name`, `last_name`, `handle`, `age`) 
VALUES (NULL,"francriso","mella","rrhh",43);

INSERT INTO `users`(`id`, `first_name`, `last_name`, `handle`, `age`) 
VALUES (NULL,"raul","cardoza","rrhh",33);

INSERT INTO `users`(`id`, `first_name`, `last_name`, `handle`, `age`) 
VALUES (NULL,"Jonathan","Smith","socio",37);

INSERT INTO `users`(`id`, `first_name`, `last_name`, `handle`, `age`) 
VALUES (NULL,"francisco","fuentes","comercial",38);

SELECT * FROM users where age >= 35;

DELETE FROM `users` WHERE YEAR(created_at) > "2010";

SELECT * FROM users;

UPDATE `users` SET `first_name`="Coding",`last_name`="Dojo",`handle`="boss",`age`=7 WHERE id=3;

SELECT * FROM users;



