-- Script to be executed on initialization

-- Create a new user called 'replication' with password 'replica' encrypted with caching_sha2_password
CREATE USER 'replication'@'%' IDENTIFIED WITH 'caching_sha2_password' BY 'replica';
GRANT REPLICATION SLAVE ON *.* TO 'replication'@'%';

-- Create 'kindle' table with two columns (id and owner)
CREATE TABLE leader.kindle (
                               id INT AUTO_INCREMENT PRIMARY KEY,
                               owner VARCHAR(255) NOT NULL
);

-- Insert three entries into the 'kindle' table
INSERT INTO leader.kindle (owner) VALUES ('ricky'), ('rafaella'), ('ruddy');