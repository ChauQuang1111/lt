-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: project
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `branch`
--

DROP TABLE IF EXISTS `branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branch` (
  `branch_id` int NOT NULL,
  `branch_city` varchar(255) DEFAULT NULL,
  `assets` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch`
--

LOCK TABLES `branch` WRITE;
/*!40000 ALTER TABLE `branch` DISABLE KEYS */;
INSERT INTO `branch` VALUES (1,'New York',1000000.00),(2,'San Francisco',800000.00),(3,'Chicago',1200000.00);
/*!40000 ALTER TABLE `branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `current_account`
--

DROP TABLE IF EXISTS `current_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `current_account` (
  `account_number` int NOT NULL,
  `balance` decimal(10,2) DEFAULT NULL,
  `branch_id` int DEFAULT NULL,
  `overdrafts` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`account_number`),
  KEY `branch_id` (`branch_id`),
  CONSTRAINT `current_account_ibfk_1` FOREIGN KEY (`branch_id`) REFERENCES `branch` (`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `current_account`
--

LOCK TABLES `current_account` WRITE;
/*!40000 ALTER TABLE `current_account` DISABLE KEYS */;
INSERT INTO `current_account` VALUES (2001,3000.00,1,1000.00),(2002,7000.00,2,2000.00),(2003,4000.00,3,1500.00);
/*!40000 ALTER TABLE `current_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `current_account_customer`
--

DROP TABLE IF EXISTS `current_account_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `current_account_customer` (
  `account_number` int NOT NULL,
  `customer_id` int NOT NULL,
  `last_access_date` date DEFAULT NULL,
  PRIMARY KEY (`account_number`,`customer_id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `current_account_customer_ibfk_1` FOREIGN KEY (`account_number`) REFERENCES `current_account` (`account_number`),
  CONSTRAINT `current_account_customer_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `current_account_customer`
--

LOCK TABLES `current_account_customer` WRITE;
/*!40000 ALTER TABLE `current_account_customer` DISABLE KEYS */;
INSERT INTO `current_account_customer` VALUES (2001,1,'2023-01-05'),(2002,2,'2023-02-18'),(2003,3,'2023-03-25');
/*!40000 ALTER TABLE `current_account_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `customer_id` int NOT NULL,
  `credit_rating` int DEFAULT NULL,
  `ssn` varchar(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `ssn` (`ssn`),
  CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`ssn`) REFERENCES `person_phone` (`ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,700,'111-11-1111','John Doe','1980-01-01','123 Main Str','New York','NYhg'),(2,800,'222-22-2222','Jane Smith','1985-02-15','456 Oak St','San Francisco','CA'),(3,750,'333-33-3333','Bob Johnson','1975-10-20','789 Elm St','Chicago','IL');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_loan`
--

DROP TABLE IF EXISTS `customer_loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_loan` (
  `customer_id` int NOT NULL,
  `loan_number` int NOT NULL,
  PRIMARY KEY (`customer_id`,`loan_number`),
  KEY `loan_number` (`loan_number`),
  CONSTRAINT `customer_loan_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`),
  CONSTRAINT `customer_loan_ibfk_2` FOREIGN KEY (`loan_number`) REFERENCES `loan` (`loan_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_loan`
--

LOCK TABLES `customer_loan` WRITE;
/*!40000 ALTER TABLE `customer_loan` DISABLE KEYS */;
INSERT INTO `customer_loan` VALUES (1,3001),(2,3002),(3,3003);
/*!40000 ALTER TABLE `customer_loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `employee_id` int NOT NULL,
  `salary` decimal(10,2) DEFAULT NULL,
  `joining_date` date DEFAULT NULL,
  `manager_id` int DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  `ssn` varchar(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `ssn` (`ssn`),
  KEY `manager_id` (`manager_id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`ssn`) REFERENCES `person_phone` (`ssn`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`manager_id`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `employee_ibfk_3` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (101,90000.00,'2010-05-15',NULL,3,'444-44-4444','Alice Brown','1982-08-30','111 Pine St','San Francisco','CA'),(102,80000.00,'2015-03-10',101,1,'555-55-5555','Chris Davis','1990-06-25','222 Cedar St','New York','NY'),(103,95000.00,'2018-09-20',101,2,'666-66-6666','Eva White','1988-04-12','333 Maple St','Chicago','IL');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_dependents`
--

DROP TABLE IF EXISTS `employee_dependents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_dependents` (
  `employee_id` int NOT NULL,
  `dependents` int NOT NULL,
  PRIMARY KEY (`employee_id`,`dependents`),
  CONSTRAINT `employee_dependents_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_dependents`
--

LOCK TABLES `employee_dependents` WRITE;
/*!40000 ALTER TABLE `employee_dependents` DISABLE KEYS */;
INSERT INTO `employee_dependents` VALUES (101,2),(102,1),(103,0);
/*!40000 ALTER TABLE `employee_dependents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loan`
--

DROP TABLE IF EXISTS `loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loan` (
  `loan_number` int NOT NULL,
  `loan_amount` decimal(10,2) DEFAULT NULL,
  `branch_id` int DEFAULT NULL,
  PRIMARY KEY (`loan_number`),
  KEY `branch_id` (`branch_id`),
  CONSTRAINT `loan_ibfk_1` FOREIGN KEY (`branch_id`) REFERENCES `branch` (`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loan`
--

LOCK TABLES `loan` WRITE;
/*!40000 ALTER TABLE `loan` DISABLE KEYS */;
INSERT INTO `loan` VALUES (3001,10000.00,1),(3002,15000.00,2),(3003,12000.00,3);
/*!40000 ALTER TABLE `loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `loan_number` int NOT NULL,
  `loan_payment_number` int NOT NULL,
  `payment_date` date DEFAULT NULL,
  `amount` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`loan_number`,`loan_payment_number`),
  CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`loan_number`) REFERENCES `loan` (`loan_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (3001,1,'2023-01-10',2000.00),(3002,1,'2023-02-20',2500.00),(3003,1,'2023-03-15',2000.00);
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person_phone`
--

DROP TABLE IF EXISTS `person_phone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person_phone` (
  `ssn` varchar(11) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person_phone`
--

LOCK TABLES `person_phone` WRITE;
/*!40000 ALTER TABLE `person_phone` DISABLE KEYS */;
INSERT INTO `person_phone` VALUES ('111-11-1111','555-1111'),('222-22-2222','555-2222'),('333-33-3333','555-3333'),('444-44-4444','555-1111'),('555-55-5555','555-2222'),('666-66-6666','555-3333');
/*!40000 ALTER TABLE `person_phone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `savings_account`
--

DROP TABLE IF EXISTS `savings_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `savings_account` (
  `account_number` int NOT NULL,
  `balance` decimal(10,2) DEFAULT NULL,
  `branch_id` int DEFAULT NULL,
  `interest_rate` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`account_number`),
  KEY `branch_id` (`branch_id`),
  CONSTRAINT `savings_account_ibfk_1` FOREIGN KEY (`branch_id`) REFERENCES `branch` (`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `savings_account`
--

LOCK TABLES `savings_account` WRITE;
/*!40000 ALTER TABLE `savings_account` DISABLE KEYS */;
INSERT INTO `savings_account` VALUES (1001,5000.00,1,0.02),(1002,8000.00,2,0.03),(1003,6000.00,3,0.03);
/*!40000 ALTER TABLE `savings_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `savings_account_customer`
--

DROP TABLE IF EXISTS `savings_account_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `savings_account_customer` (
  `account_number` int NOT NULL,
  `customer_id` int NOT NULL,
  `last_access_date` date DEFAULT NULL,
  PRIMARY KEY (`account_number`,`customer_id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `savings_account_customer_ibfk_1` FOREIGN KEY (`account_number`) REFERENCES `savings_account` (`account_number`),
  CONSTRAINT `savings_account_customer_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `savings_account_customer`
--

LOCK TABLES `savings_account_customer` WRITE;
/*!40000 ALTER TABLE `savings_account_customer` DISABLE KEYS */;
INSERT INTO `savings_account_customer` VALUES (1001,1,'2023-01-01'),(1002,2,'2023-02-15'),(1003,3,'2023-03-20');
/*!40000 ALTER TABLE `savings_account_customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-08 15:42:56
