CREATE TABLE Authors (
 author_id SERIAL PRIMARY KEY,
 name VARCHAR(25),
 fname VARCHAR(25)
);

CREATE TABLE Publishers (
 publisher_id SERIAL PRIMARY KEY,
 name VARCHAR(30),
 url VARCHAR(80)
);

CREATE TABLE Books (
 title VARCHAR(60),
 isbn CHAR(13) PRIMARY KEY,
 publisher_id INT,
 price DECIMAL(10,2),
 FOREIGN KEY (publisher_id) REFERENCES Publishers(publisher_id)
);

CREATE TABLE BooksAuthors (
 isbn CHAR(13),
 author_id INT,
 seq_no INT,
 FOREIGN KEY (isbn) REFERENCES Books (isbn),
 FOREIGN KEY (author_id) REFERENCES Authors(author_id),
 PRIMARY KEY (isbn, author_id)
);