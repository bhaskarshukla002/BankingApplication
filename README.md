# Banking Application
## Overview
### This project is a Spring Boot-based web application that allows users to view a list of bank branches and the services offered by individual banks. It includes two main functionalities:

* Displaying a list of branches for a specific bank in Bangalore.
* Displaying the services offered by a specific branch.

## Features
* Bank Branches Listing: View a list of branches for a specific bank located in Bangalore.
* Branch Services: View a list of services offered by a specific branch.
* Thymeleaf Templates: HTML pages dynamically rendered using Thymeleaf.
* Responsive Design: Basic CSS styling for a clean and responsive UI.

## Technologies Used
* Java 17
* Spring Boot 3.0.0
* Thymeleaf
* MySql Database (for in-memory data storage during development)
* Maven (for dependency management)
* Lombok (for reducing boilerplate code)

## Project Structure
> Folder structure options and naming conventions for software projects

### A typical top-level directory layout
```bash
src/
├── main/
│   ├── java/com/example/Bank/
│   │   ├── controller/ApplicationController.java
│   │   ├── model/
│   │   │   ├── Bank.java
│   │   │   ├── Branch.java
│   │   │   ├── Service.java
│   │   ├── repository/
│   │   │   ├── BankRepository.java
│   │   │   ├── BranchRepository.java
│   │   │   ├── ServiceRepository.java
│   │   ├── service/ApplicationService.java
│   ├── resources/
│   │   ├── templates/
│   │   │   ├── branches.html
│   │   │   ├── services.html
│   │   ├── application.properties
│   └── test/
│       ├── java/com/example/Bank/
│       │   ├── BankApplicationTests.java
```
## Installation & Setup
* Clone the Repository:
```bash
git clone https://github.com/your-username/banking-application.git
cd banking-application
* Ensure you have Java 17 installed. Then, you can run the application using Maven:
Run the Application:
mvn spring-boot:run
```

Access the Application:
Once the application is running, you can access it via:
```
Bank Branches: http://localhost:8080/{bankName}
Branch Services: http://localhost:8080/service/{bankName}?branchName={branchName}
```
Database Initialization
The application uses an MySql database for demonstration purposes.

Example Data
Banks:
- Bank of India
- HDFC Bank
- ICICI Bank
- State Bank of India
- Branches: Includes multiple branches across different cities, with 10 branches in Bangalore.
- Services: Each branch offers a set of services like Account Opening, Loan Services, etc.

## Deployment
The application can be deployed on any platform that supports Java applications, such as Heroku, AWS, or Azure. The project includes a Maven build configuration, so you can build a .jar file using:

## mvn clean package
After building, you can deploy the .jar file to your chosen environment.

## Testing
To verify the functionality of the URLs and data display:

## Use a browser to access the URLs.
Ensure the correct data is displayed as per the dummy data initialization.
## Video Demonstration
A video demonstration explaining the application can be found here.

## License
This project is licensed under the MIT License. See the LICENSE file for details.
