# Weekly Assignment Instructions


### Overview

This week we will be preparing you to begin work on your group projects!  As a Java "Back-end" developer your job will be to build the REpresentational State Transfer (REST) Application Programming Interface (API) middleware between the front-end application your CPT 253 counterparts and the database your CPT 166 classmates will be developing!  YOUR program is the glue that ties all of the pieces together!

### Learning Outcomes

By the end of this assignment you will have learned about REST APIs, the "Spring" framework, interacting to test your APIs in "Postman", and will have learned how to "spin up" a small pre-built Virtual Machine using Vagrant!  Following the reading material you will be working on updating this repository so that the "Classes" controller has the same endpoints as the "Students" Controller!  

### Instructions
1. **Review the following materials**:

   - [What is a REST API?](https://blog.postman.com/rest-api-examples/)
  
     This webpage from Postman provides an overview of what a REST API is and what it's for!  There are MANY platforms that provide REST APIs and it is a common way to pass data back and forth between varying systems and web platforms so this is a very useful concept to know!


   - [Why Spring](https://spring.io/why-spring)
  
     This webpage covers the Java "Spring Framework" and why it's so useful!  Java is one of the most widely used programming languages in the world and many of the people who write Java code today utilize the Spring Frameork!  This webpage covers why it is so useful!


   - [What is Postman?](https://www.postman.com/product/what-is-postman/)
  
     This page covers what the tool "Postman" is and why it's so useful!  You will be using this tool for this week's assignment and I suggest becoming more comfortable with it as you'll find this tool will be helpful in all of your group projects!


   - [Introduction to Vagrant](https://developer.hashicorp.com/vagrant/intro)
  
    This website offers an overview into what Vagrant is and why it's useful.  You may find that I'll attach "Vagrant" machines to various assignments (including this one!) to provide some common resources to develop against.  This week in particular I have provided you with a sample PostgreSQL database [read more about PostgreSQL here](https://www.geeksforgeeks.org/what-is-postgresql-introduction/) to build your REST api "endpoints" (the various URLs you can use to get/post/put/delete data) against.  



2. **Complete the following tasks**:

   - Please go to [Install Vagrant](https://developer.hashicorp.com/vagrant/install) and install Vagrant!  Also be sure you have a type-2 hypervisor (I suggest [Virtualbox](https://www.virtualbox.org)) installed as a "virtualization provider".  You will need these tools to run the PostgreSQL VM that I have included in this project!
  
   - Once installed please "Clone" this project to your local machine
  
   - Then, once you have this project running locally you should be able to open it in VSCode.  Once opened, open a new terminal and run

     ```bash
     vagrant up
     ```
     This will spin up the pre-configured Vagrant machine I have included in this repository!

   - Once this machine is up and running you should be able to start the Spring Boot application with:
  
     ```bash
     ./mvnw spring-boot:run
     ```

     Wait until the Java project has started without error.
     
   - Next, please [install Postman](https://www.postman.com/downloads/).  You will be prompted to create a free account and please do so!  Then you can "import" the "postman.json" file from this repository. This will give you the commands for the "Students" Controller.  With the Vagrant VM and Spring REST API running you should be able to run any of the endpoints given to you in this file and get successful responses!.
  
   - Now that you have validated that the Spring project is running it's time to get to work!  Please update the "ClassesController.java" to have the same GET/POST/PUT/DELETE endpoints using the "StudentsController.java" as a guide.  This will provide you with the basic syntax you need to make the classes endpoint work. As you're developing these endpoints please add new "test" methods in your Postman application (again using the Students endpoints as a guide) so you can validate that your "Classes" endpoints are working well! 
  
   - Once you have modified your ClassesController.java and added the appropriate endpoints to your Postman "collection" please export your updated Postman collection as a .JSON file and overwrite the one in your local project.  Then please commit these changes to a GitHub public repository and submit the link to it in Brightspace!  


   
3. **Please commit your code to a public GitHub repository**
    - Once you have completed all three tasks in your code please commit your updated python code to a public repository in GitHub!
    - Once you have a public repository link submit that link to the week one assignment in Brightspace!
