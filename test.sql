SELECT Passengers.passenger_firstname, Passengers.passenger_lastname,
Tickets.ticket_type, Flights.departure_date, Flights.arrival_date, Tickets.ticket_price
FROM Tickets
INNER JOIN Passengers
ON Tickets.passenger_id = Passengers.passenger_id
INNER JOIN Flights
ON Tickets.flight_id = Flights.flight_id;

SELECT Customers.customer_email, Orders.date_created as order_date_created, Orders.total_price, Payments.date_created as payment_date_created, Payments.payment_amount, Payments.status
FROM Customers
INNER JOIN Orders
ON Customers.customer_id = Orders.customer_id
INNER JOIN Payments
ON Orders.order_id = Payments.order_id;

SELECT Airports.airport_title, Cities.city_title, Countries.country_title
FROM Airports
INNER JOIN Cities
ON Airports.city_id = Cities.city_id
INNER JOIN Countries
ON Cities.country_id = Countries.country_id;

SELECT Employees.employee_firstname, Employees.employee_lastname, Employees.employee_birth_date, Employees.employee_salary, Employees.icao_level, Pilots.flight_hours, Companies.company_title
FROM Employees
INNER JOIN Pilots
ON Employees.employee_id = Pilots.employee_id
INNER JOIN Companies
ON Employees.company_id = Companies.company_id;

SELECT Employees.employee_firstname, Employees.employee_lastname, Employees.employee_birth_date, Employees.employee_salary, Employees.icao_level, Dispatchers.class, Companies.company_title
FROM Employees
INNER JOIN Dispatchers
ON Employees.employee_id = Dispatchers.employee_id
INNER JOIN Companies
ON Employees.company_id = Companies.company_id;

SELECT Employees.employee_firstname, Employees.employee_lastname, Employees.employee_birth_date, Employees.employee_salary, Employees.icao_level, Stewards.height, Companies.company_title
FROM Employees
INNER JOIN Stewards
ON Employees.employee_id = Stewards.employee_id
INNER JOIN Companies
ON Employees.company_id = Companies.company_id;


