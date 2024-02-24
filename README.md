Create Local instance MySQL in MySQL WorkBench
Create DB Business with Table CustomerInfo executing script:

CREATE DATABASE Business;
use Business;
CREATE TABLE CustomerInfo
(CourseName varchar(50),customerinfo
PurchasedDate date,
Amount int(50),
Location varchar(50));

INSERT INTO CustomerInfo values("selenium",CURRENT_DATE(),120,'Africa');
INSERT INTO CustomerInfo values("Protractor",CURRENT_DATE(),45,'Africa');
INSERT INTO CustomerInfo values("Appium",CURRENT_DATE(),99,'Asia');
INSERT INTO CustomerInfo values("WebServices",CURRENT_DATE(),21,'Asia');
INSERT INTO CustomerInfo values("Jmeter",CURRENT_DATE(),76,'Asia');
INSERT INTO CustomerInfo values("Rest-assured",'2024-02-18',82,'Asia');

SELECT * FROM CustomerInfo WHERE purchasedDate=CURRENT_DATE() AND Location ='Asia';

Connect to DB MySQL with Java code and get data from DB.
Create class for data objects to save the Table's data
Saving data from Table raws in separate json files
Using StringEscapeUtils you can convert json object to json string and delete unnecessary quotation marks
Convert all data from DB into a single Json file.
