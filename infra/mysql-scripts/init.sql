-- Create replication user
CREATE USER 'replication'@'%' IDENTIFIED WITH sha256_password BY 'replica';
GRANT REPLICATION SLAVE ON *.* TO 'replication'@'%';

-- Create the kindle table
USE leader;
CREATE TABLE kindle (id INT AUTO_INCREMENT PRIMARY KEY, owner VARCHAR(255) NOT NULL);

-- Insert data into the kindle table
INSERT INTO kindle (owner) VALUES
                               ('ricky'),
                               ('rafaella'),
                               ('ruddy');
