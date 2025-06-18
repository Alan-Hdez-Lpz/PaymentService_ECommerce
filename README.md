# PaymentService_ECommerce
Project: Building a Microservices-Based E-Commerce Application - Payment Service

How to set up the project:
Update the DataBase configuration properties in the application.properties file

How to run the application:
1. Create the DB in MySQL
2. Verify the properties of this microservice in the config-repo
3. Run the config-server and eureka-server
4. Run this microservice project

NOTE: The server port will change according server port value in the config-repo properties

API endpoints and sample requests for testing:

READ:
- GET ->  http://localhost:8083/payments/1 (pay process for the order with this ID, it returns true or false)
