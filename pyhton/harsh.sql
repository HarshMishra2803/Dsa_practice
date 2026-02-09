SELECT 'HELLO CHAUHAN';

CREATE DATABASE sql_Harsh;

USE sql_Harsh;

CREATE TABLE students (
	id int primary key auto_increment,
    name varchar(50)  not null,
    email varchar(50) unique not null,
    gender enum ('male','female','other'),
    date_of_birth date
);