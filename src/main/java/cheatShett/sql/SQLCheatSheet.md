# SQL Cheat Sheet

## Data Definition Language (DDL)
- **CREATE**: Used to create a new table, view, index, or other database object.
- **ALTER**: Used to modify an existing database object, such as a table.
- **DROP**: Used to delete an existing database object.
- **TRUNCATE**: Used to delete all records from a table, but keeps the table structure intact.
- **COMMENT**: Used to add comments to the data dictionary.

## Data Manipulation Language (DML)
- **SELECT**: Used to retrieve data from one or more tables.
- **INSERT**: Used to insert new records into a table.
- **UPDATE**: Used to modify existing records in a table.
- **DELETE**: Used to delete records from a table.
- **MERGE**: Used to perform insert, update, or delete operations based on a condition.

## Data Control Language (DCL)
- **GRANT**: Used to grant privileges to users or roles.
- **REVOKE**: Used to revoke privileges from users or roles.

## Data Query Language (DQL)
- **SELECT**: Used to retrieve data from one or more tables based on specified criteria.

## SQL Functions
- **COUNT()**: Returns the number of rows that match a specified criterion.
- **SUM()**: Calculates the sum of a set of values.
- **AVG()**: Calculates the average of a set of values.
- **MIN()**: Returns the smallest value in a set of values.
- **MAX()**: Returns the largest value in a set of values.
- **LOWER()**: Converts a string to lowercase.
- **UPPER()**: Converts a string to uppercase.
- **CONCAT()**: Concatenates two or more strings.
- **SUBSTRING()**: Extracts a substring from a string.
- **DATE_FORMAT()**: Formats a date value based on a specified format.

## SQL Operators
- **=**: Equal to
- **<>**: Not equal to
- **<**: Less than
- **>**: Greater than
- **<=**: Less than or equal to
- **>=**: Greater than or equal to
- **AND**: Logical AND
- **OR**: Logical OR
- **NOT**: Logical NOT
- **IN**: Specifies multiple values for a column
- **BETWEEN**: Specifies a range of values

## SQL Constraints
- **PRIMARY KEY**: Uniquely identifies each record in a table.
- **FOREIGN KEY**: Establishes a relationship between two tables.
- **UNIQUE**: Ensures that all values in a column are unique.
- **NOT NULL**: Ensures that a column does not contain NULL values.
- **CHECK**: Specifies a condition that must be met for a column.
- **DEFAULT**: Specifies a default value for a column.

## SQL Joins
- **INNER JOIN**: Retrieves records that have matching values in both tables.
- **LEFT JOIN**: Retrieves all records from the left table and the matched records from the right table.
- **RIGHT JOIN**: Retrieves all records from the right table and the matched records from the left table.
- **FULL OUTER JOIN**: Retrieves all records when there is a match in either the left or right table.

## SQL Transactions
- **BEGIN TRANSACTION**: Starts a new transaction.
- **COMMIT**: Saves the changes made during the current transaction.
- **ROLLBACK**: Reverts the changes made during the current transaction.

## SQL Views
- **CREATE VIEW**: Creates a virtual table based on the result of a SELECT query.
- **DROP VIEW**: Deletes an existing view.

## SQL Indexes
- **CREATE INDEX**: Creates an index on one or more columns of a table to improve query performance.
- **DROP INDEX**: Deletes an existing index.

## SQL Stored Procedures
- **CREATE PROCEDURE**: Creates a stored procedure.
- **DROP PROCEDURE**: Deletes an existing stored procedure.

## SQL Triggers
- **CREATE TRIGGER**: Creates a trigger, which is a set of SQL statements that are automatically executed when a specified event occurs.
- **DROP TRIGGER**: Deletes an existing trigger.

This SQL cheat sheet covers common SQL operations, functions, operators, constraints, joins, transactions, views, indexes, stored procedures, and triggers. It serves as a quick reference for SQL developers and database administrators.
