# Fintech-app-spring-boot

Spring Boot project providing users the facility to lend loans to the other users. Concepts used like REST API, AMQP, principles of Object Oriented Programming, H2 database, etc.

About the Project:

The user first signs up on the Lennding application with all the details. the user gets the option of balance topup and withdrwal. All the users registered on the Lending application can lend each other loans based on the loan applications they raise. A user in need of money can fill a loan application which will be visible to other users on the platform.

The user mentions details of loan like no. of days of repayment, interest rate, amount which gets converted to a loan application which is visible to other users on the platform with the status of loan application which can be ongoing or completed. Other users get a option of selecting from the loan applications to whom they want to lend the money. Once the user accepts a loan application, that amount gets deducted from the loan approvers balance and gets transferred to the loan applier. The loan applier has to repay amount with interest back to the loan approver.The loan applier can repay its loan in whole and also in some parts depending on his wish.


Technical Details:

The project consists of two Microservices : LendingEngine and SecurityApp

SecurityApp microservice is used for the purpose of signing up new user with all the details. 

LendingEngine Microservice contains all the business logic, repositories, and Controller classes which are behind the implementation of the project.



RabbitMQ is one of the most popular open source message brokers. In this project, it has been used between the two microservices.  
It has been used in our project in the following manner:

1) SecurityApp is the Producer which publishes message to the exchange. Here message is the User details which are required to sign up for the application
2) Exchange redirects the message to the queue.
3) Exchange is linked to Queue using a Routing Key 
4) the Consumer (LendingEngine Microservice) consumes the message and the new User gets registered 

H2 is an embedded, open-source, and in-memory database. It is a relational database management system written in Java. It is a client/server application. H2 database has been used in this project for the purpose of creating repositories of Users, Loan requests and Loan applications.


The service classes contain the logical operations which are performed. Service classes contain business logic in a different layer, separated from @RestController classes

The endpoints or the point of contact for the application are defined in the RESTCONTROLLER classes.

I have tested the various services using the POSTMAN software where I feed the JSON inputs and get the JSON output.
