CREATE DATABASE IF NOT EXISTS autoservis;
USE autoservis;

CREATE TABLE IF NOT EXISTS clients(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
lastname VARCHAR(20) NOT NULL,
name VARCHAR(20) NOT NULL,
surname VARCHAR(20),
birthday DATE,
phone BIGINT NOT NULL,
gender CHAR NOT NULL,
discount INT);

INSERT INTO clients
(lastname, name, surname, birthday, phone, gender, discount)
VALUES
('Петров', 'Степан', 'Игоревич', '2001.05.24', 89137776456, 'm', 0),
('Сидоров', 'Игорь', 'Петрович', '1995.05.23', 89137776456, 'm', 10);

CREATE TABLE IF NOT EXISTS employees(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
lastname VARCHAR(20) NOT NULL,
name VARCHAR(20) NOT NULL,
surname VARCHAR(20),
birthday DATE,
phone BIGINT NOT NULL,
gender CHAR NOT NULL,
address VARCHAR(50),
speciality VARCHAR(20)
);

INSERT INTO employees
(lastname, name, surname, birthday, phone, gender, address, speciality)
VALUES
('Попов', 'Степан', 'Игоревич', '2001.05.24', 89137776456, 'm', 'ул. Мира, д.19, кв.23', 'слесарь'),
('Сидорчук', 'Игорь', 'Петрович', '1995.05.23', 89137776456, 'm', 'ул. Мира, д.34, кв.56', 'слесарь');

CREATE TABLE IF NOT EXISTS passenger_cars(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
brand VARCHAR(20) NOT NULL,
model VARCHAR(20) NOT NULL,
year_issue INT,
mileage BIGINT,
vin VARCHAR(17) NOT NULL,
color VARCHAR(45),
state_number VARCHAR(10) NOT NULL,
bodyType VARCHAR(50),
client_id INT REFERENCES client (id) ON DELETE CASCADE);

INSERT INTO passenger_cars
(brand, model, year_issue, mileage, vin, color, state_number, bodyType, client_id)
VALUES
('toyota', 'rav4',2012 , 100000, 'ieyy345689utrr', 'черный', 'А714ЕН', '5-дверная', 1);

CREATE TABLE IF NOT EXISTS trucks(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
brand VARCHAR(20) NOT NULL,
model VARCHAR(20) NOT NULL,
year_issue INT,
mileage BIGINT,
vin VARCHAR(17) NOT NULL,
color VARCHAR(45),
state_number VARCHAR(10) NOT NULL,
loadCapacity INT,
client_id INT REFERENCES users (client) ON DELETE CASCADE);

INSERT INTO trucks
(brand, model, year_issue, mileage, vin, color, state_number, loadCapacity, client_id)
VALUES
('mitsubishi', 'canter', 2019, 80000, 'ieyy345689utrr', 'белый', 'П700ДН', 3500, 2);

CREATE TABLE IF NOT EXISTS buses(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
brand VARCHAR(20) NOT NULL,
model VARCHAR(20) NOT NULL,
year_issue INT,
mileage BIGINT,
vin VARCHAR(17) NOT NULL,
color VARCHAR(45),
state_number VARCHAR(10) NOT NULL,
passengerSeats INT,
client_id INT REFERENCES users (client) ON DELETE CASCADE);

INSERT INTO buses
(brand, model, year_issue, mileage, vin, color, state_number, passengerSeats, client_id)
VALUES
('toyota', 'hiace', 2000, 180000, 'ieyy345689utrr', 'белый', 'B460PН', 11, 2);

CREATE TABLE IF NOT EXISTS repair(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
repairDescription TEXT NOT NULL,
date DATE NOT NULL,
price REAL NOT NULL,
state_number VARCHAR(10) NOT NULL);

INSERT INTO repair(
repairDescription, date, price, state_number)
VALUES
('Замена шаровой опоры', '2023-05-07', 800, 'А714ЕН'),
('Замена ресоры', '2023-05-06', 3500, 'П700ДН'),
('Покраска', '2023-05-01', 110000, 'B460PН');

-- SELECT --

SELECT buses.brand, buses.model, buses.mileage, clients.lastname, repair.repairDescription,
repair.date, repair.price, repair.state_number
FROM clients JOIN repair JOIN buses
ON buses.state_number = repair.state_number AND clients.id = buses.client_id;

SELECT lastname, name, surname, birthday, gender, phone, discount
FROM clients
WHERE lastname = 'Петров';

SELECT cli
FROM clients JOIN buses
ON clients.id = buses.client_id;
WHERE lastname = 'Петров';

INSERT INTO passenger_cars
(brand, model, year_issue, mileage, vin, color, state_number, bodyType, client_id)
VALUES
('toyota', 'camry',2022 , 2000, 'ieyy345689utrr', 'белый перламутр', 'Т345НР', 'седан', 2);

INSERT INTO clients
(lastname, name, surname, birthday, phone, gender, discount)
VALUES
(?,?,?,?,?,?,?);

INSERT INTO employees
(lastname, name, surname, birthday, phone, gender, address, speciality)
VALUES
('Бопков', 'Максим', 'Игоревич', '2005-03-24', 89137776456, 'm', 'Ломоносова', 'жестянщик');

INSERT INTO employees
(lastname, name, surname, birthday, phone, gender, address, speciality)
VALUES
('Криваруков', 'Иван', 'Иванович', '2002-04-24', 89137776456, 'm', 'Лермонтово', 'жестянщик');

INSERT INTO employees
(lastname, name, surname, birthday, phone, gender, address, speciality)
VALUES
('Тресков', 'Илья', 'Игоревич', '1975-03-24', 89137776456, 'm', 'Говорово', 'маляр');

INSERT INTO employees
(lastname, name, surname, birthday, phone, gender, address, speciality)
VALUES
('Беспалов', 'Андрей', 'Серреевич', '1978-05-22', 89137776456, 'm', 'Фрунзе', 'менеджер');