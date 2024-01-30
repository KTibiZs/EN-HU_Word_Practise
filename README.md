-- in mySQL --

CREATE SCHEMA word_exersice;

CREATE TABLE word_pairs (
id INT AUTO_INCREMENT,
eng varchar(255),
hun varchar(255),
PRIMARY KEY (id)
);


INSERT INTO word_pairs (id, eng, hun)
VALUES(0, '', ''),
	(0, '', ''),
	(0, '', '');

SELECT * FROM word_pairs;
