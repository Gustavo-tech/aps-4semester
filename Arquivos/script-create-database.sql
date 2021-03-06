-- Caso ainda não tenha o banco comenta a linha drop database
drop database livraria_amazonia;
create database livraria_amazonia;
use livraria_amazonia;

CREATE TABLE Authors (
	author_id INT PRIMARY KEY AUTO_INCREMENT, 
    name CHAR(25), fname CHAR(25)
);

CREATE TABLE Publishers ( 
	publisher_id INT PRIMARY KEY AUTO_INCREMENT, 
    name CHAR(30), 
    url CHAR(80) 
);

CREATE TABLE Books ( 
	title CHAR(60), 
    isbn CHAR(13) PRIMARY KEY, 
    publisher_id INT, 
    price DECIMAL(10,2), 
    FOREIGN KEY (publisher_id) REFERENCES Publishers (publisher_id) 
);

CREATE TABLE BooksAuthors ( 
	isbn CHAR(13), 
    author_id INT, 
    seq_no INT, 
    FOREIGN KEY (isbn) REFERENCES Books (isbn), 
    FOREIGN KEY (author_id) REFERENCES Authors (author_id), 
    PRIMARY KEY (isbn, author_id) 
);