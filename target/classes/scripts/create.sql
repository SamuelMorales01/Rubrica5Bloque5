create table IF NOT EXISTS AUTHOR(
	id IDENTITY PRIMARY KEY NOT NULL,
	name VARCHAR(25) NOT NULL,
	birthday DATE NOT NULL
);

create table IF NOT EXISTS BOOK(
	id IDENTITY PRIMARY KEY NOT NULL ,
	title VARCHAR(25) NOT NULL,
	isbn VARCHAR(13) NOT NULL,
	authorId INT NOT NULL,
	FOREIGN KEY (authorId) REFERENCES AUTHOR(id)
); 