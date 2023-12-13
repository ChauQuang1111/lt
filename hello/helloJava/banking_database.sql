create database banking;
use banking;

CREATE TABLE Branch (
  branch_id INT PRIMARY KEY,
  branch_city VARCHAR(50) NOT NULL,
  assets DECIMAL(15,2) NOT NULL
);

CREATE TABLE Person_Phone (
  ssn VARCHAR(11) PRIMARY KEY,
  phone VARCHAR(15) NOT NULL
);

CREATE TABLE Customer (
  customer_id INT PRIMARY KEY,
  credit_rating INT NOT NULL,
  ssn VARCHAR(11) NOT NULL REFERENCES Person_Phone(ssn),
  name VARCHAR(50) NOT NULL,
  dob DATE NOT NULL,
  street VARCHAR(50) NOT NULL,
  city VARCHAR(50) NOT NULL,
  province VARCHAR(50) NOT NULL
);

CREATE TABLE Employee (
  employee_id INT PRIMARY KEY,
  salary DECIMAL(10,2) NOT NULL,
  joining_date DATE NOT NULL,
  manager_id INT REFERENCES Employee(employee_id),
  customer_id INT REFERENCES Customer(customer_id),
  ssn VARCHAR(11) NOT NULL REFERENCES Person_Phone(ssn),
  name VARCHAR(50) NOT NULL,
  dob DATE NOT NULL,
  street VARCHAR(50) NOT NULL,
  city VARCHAR(50) NOT NULL,
  province VARCHAR(50) NOT NULL
);

CREATE TABLE Employee_Dependents (
  employee_id INT PRIMARY KEY REFERENCES Employee(employee_id),
  dependents INT NOT NULL
);

CREATE TABLE Savings_Account (
  account_number INT PRIMARY KEY,
  balance DECIMAL(15,2) NOT NULL,
  branch_id INT NOT NULL REFERENCES Branch(branch_id),
  interest_rate DECIMAL(5,2) NOT NULL
);

CREATE TABLE Current_Account (
  account_number INT PRIMARY KEY,
  balance DECIMAL(15,2) NOT NULL,
  branch_id INT NOT NULL REFERENCES Branch(branch_id),
  overdrafts INT NOT NULL
);

CREATE TABLE Savings_Account_Customer (
  account_number INT PRIMARY KEY REFERENCES Savings_Account(account_number),
  customer_id INT NOT NULL REFERENCES Customer(customer_id),
  last_access_date DATE NOT NULL
);

CREATE TABLE Current_Account_Customer (
  account_number INT PRIMARY KEY REFERENCES Current_Account(account_number),
  customer_id INT NOT NULL REFERENCES Customer(customer_id),
  last_access_date DATE NOT NULL
);

CREATE TABLE Loan (
  loan_number INT PRIMARY KEY,
  loan_amount DECIMAL(15,2) NOT NULL,
  branch_id INT NOT NULL REFERENCES Branch(branch_id)
);

CREATE TABLE Customer_Loan (
  customer_id INT NOT NULL REFERENCES Customer(customer_id),
  loan_number INT NOT NULL REFERENCES Loan(loan_number),
  PRIMARY KEY (customer_id, loan_number)
);

CREATE TABLE Payment (
  loan_number INT NOT NULL REFERENCES Loan(loan_number),
  loan_payment_number INT NOT NULL,
  payment_date DATE NOT NULL,
  amount DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (loan_number, loan_payment_number)
);

