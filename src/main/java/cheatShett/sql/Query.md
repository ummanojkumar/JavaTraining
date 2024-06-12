
## Data Definition Language (DDL)
CREATE TABLE users (
id INT PRIMARY KEY,
username VARCHAR(50) NOT NULL,
email VARCHAR(100) UNIQUE,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE users ADD COLUMN age INT;

DROP TABLE users;

TRUNCATE TABLE users;

COMMENT ON TABLE users IS 'Table containing user information';

##Data Manipulation Language (DML)
INSERT INTO users (id, username, email) VALUES (1, 'john_doe', 'john@example.com');

UPDATE users SET username = 'johndoe' WHERE id = 1;

DELETE FROM users WHERE id = 1;

##Data Control Language (DCL)
GRANT SELECT ON users TO user1;

REVOKE INSERT ON users FROM user2;

## Data Query Language (DQL)
SELECT * FROM users;

## SQL Functions
SELECT COUNT(*) FROM users;

SELECT SUM(age) FROM users;

SELECT AVG(age) FROM users;

SELECT MIN(age) FROM users;

SELECT MAX(age) FROM users;

SELECT LOWER(username) FROM users;

SELECT UPPER(username) FROM users;

SELECT CONCAT(first_name, ' ', last_name) AS full_name FROM users;

SELECT SUBSTRING(username, 1, 3) FROM users;

SELECT DATE_FORMAT(created_at, '%Y-%m-%d') AS formatted_date FROM users;

## SQL Operators
SELECT * FROM users WHERE age = 25;

SELECT * FROM users WHERE age <> 25;

SELECT * FROM users WHERE age < 30;

SELECT * FROM users WHERE age > 30;

SELECT * FROM users WHERE age <= 30;

SELECT * FROM users WHERE age >= 30;

SELECT * FROM users WHERE age BETWEEN 20 AND 30;

SELECT * FROM users WHERE age IN (20, 25, 30);

SELECT * FROM users WHERE username LIKE 'joh%';

## SQL Constraints
CREATE TABLE orders (
id INT PRIMARY KEY,
user_id INT,
total_amount DECIMAL(10, 2) CHECK (total_amount > 0),
FOREIGN KEY (user_id) REFERENCES users(id)
);

## SQL Joins
SELECT * FROM users INNER JOIN orders ON users.id = orders.user_id;

## SQL Transactions
BEGIN TRANSACTION;
INSERT INTO users (id, username) VALUES (2, 'janedoe');
COMMIT;

BEGIN TRANSACTION;
DELETE FROM users WHERE id = 2;
ROLLBACK;

## SQL Views
CREATE VIEW active_users AS
SELECT * FROM users WHERE status = 'active';

## SQL Indexes
CREATE INDEX idx_username ON users(username);

## SQL Stored Procedures
CREATE PROCEDURE get_user(IN user_id INT)
BEGIN
SELECT * FROM users WHERE id = user_id;
END;

## SQL Triggers
CREATE TRIGGER update_timestamp
BEFORE UPDATE ON users
FOR EACH ROW
BEGIN
SET NEW.updated_at = NOW();
END;