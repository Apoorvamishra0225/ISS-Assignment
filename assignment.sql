#select
select * from customers
#select distict
SELECT DISTINCT Country FROM Customers;
#Select where
SELECT * FROM Customers
WHERE Country='Spain';
#select and,or,not
SELECT * FROM Customers
WHERE Country='Spain' AND City='Madrid';
SELECT * FROM Customers
WHERE Country='Germany' OR Country='Spain';
SELECT * FROM Customers
WHERE NOT Country='USA';
#order by
SELECT * FROM Customers
ORDER BY Country ASC, CustomerName DESC;
#insert
INSERT INTO Customers (CustomerName, City, Country)
VALUES ('Cardinal', 'Stavanger', 'Norway');
select * from customers where Country='Norway'
#update
UPDATE Customers
SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'
WHERE CustomerID = 1;
select * from customers where CustomerID='1'
#delete
DELETE FROM Customers WHERE CustomerID='1';
select * from customers where CustomerID='1'
#top
SELECT * FROM Customers
WHERE Country='USA'
LIMIT 3;
#like
SELECT * FROM Customers
WHERE ContactName LIKE 'a%o';
#wildcards
SELECT * FROM Customers
WHERE City LIKE '_ondon';
#in
SELECT * FROM Customers
WHERE Country IN ('Germany', 'France', 'UK');
#between
SELECT * FROM Orders
WHERE OrderDate BETWEEN '1996-07-01' AND '1996-07-31';
#alisases
SELECT CustomerName, CONCAT(Address,', ',PostalCode,', ',City,', ',Country) AS Address
FROM Customers;
SELECT o.OrderID, o.OrderDate, c.CustomerName
FROM Customers AS c, Orders AS o
WHERE c.CustomerName='Around the Horn' AND c.CustomerID=o.CustomerID;
#joim
SELECT Orders.OrderID, Customers.CustomerName, Orders.OrderDate
FROM Orders
INNER JOIN Customers ON Orders.CustomerID=Customers.CustomerID;
SELECT Customers.CustomerName, Orders.OrderID
FROM Customers
LEFT JOIN Orders ON Customers.CustomerID = Orders.CustomerID
ORDER BY Customers.CustomerName;
SELECT Orders.OrderID, Employees.LastName, Employees.FirstName
FROM Orders
RIGHT JOIN Employees ON Orders.EmployeeID = Employees.EmployeeID
ORDER BY Orders.OrderID;
SELECT Customers.CustomerName, Orders.OrderID
FROM Customers
FULL JOIN Orders ON Customers.CustomerID=Orders.CustomerID
ORDER BY Customers.CustomerName;
#union
SELECT City, Country FROM Customers
WHERE Country='Germany'
UNION
SELECT City, Country FROM Suppliers
WHERE Country='Germany'
ORDER BY City;
#insert into select
INSERT INTO Customers (CustomerName, City, Country)
SELECT SupplierName, City, Country FROM Suppliers
WHERE Country='Germany';
#create database
CREATE DATABASE testDB;
show databases;
#create table
CREATE TABLE TestTable AS
SELECT customername, contactname
FROM customers;
select * from Testtable
#primary key,constraints,not null
CREATE TABLE Person (
    Id int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    PRIMARY KEY (Id)
);
select * from Person;
#foreignkey
CREATE TABLE Orders (
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    PersonID int,
    PRIMARY KEY (OrderID),
    FOREIGN KEY (PersonID) REFERENCES Person(Id)
);
select * from Orders
#check,default,autoincrement,Notnull
CREATE TABLE Student (
    ID int NOT NULL AUTO_INCREMENT,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
	City varchar(255) DEFAULT 'Sandnes',
    Age int,
    CHECK (Age>=18),
    Primary key(Id)
);

