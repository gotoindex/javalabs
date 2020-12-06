# javalabs

## Description

This project was created within a course of learning the **java** programming language.
Each package inside the *src/main/java* folder represents each task of the course.

The project was created using the IntelliJ IDEA Community Edition (version 2020.2.2 x64) and maven-14.

## Installation

You can directly clone this project and try it for yourself:

    git clone https://github.com/gotoindex/javalabs.git

## Usage

To test the project, clone it and build it.

Next, execute the Run.java file in the folder of the package you want to test.

If the package doesn't have such a file, use the test files in *src/test/java*.

### Goals
During the development of the project following goals were achieved:
- Learned how to use following software and services:
  - [x] [Git](https://git-scm.com/)
  - [x] [GitHub](https://github.com/)
- Learned **Java**:
  - [x] Syntax & Variables
  - [x] Functions & Algorithms
  - [x] Classes & OOP
  - [x] Working with JSON files
  - [x] View-Controller-Model concept
  - [x] Working with the PostgreSQL database

Additional software and services used during the development:
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)

### Task description

Here is a full description of all tasks:

> Note that this text was roughly translated to english and thus may contain simple mistakes.

    Laboratory work number 0. Hello world
     Install Intelliji Idea and Java jdk latest version. Create a maven project and develop a typical Hello world program in this project. The program should display Hello world and finish its work.
    
    Laboratory work number 1. CVS. GIT
     Connect the CVS system to intellij Idea. Namely GIT. Create an account in the github cloud, connect your project in intellij Idea to your github account and upload zero lab work to the github account.
    Starting with this laboratory work on the title page in paper form indicate the link to the project of laboratory works GitHub in this discipline.
    Be sure to check that your lab project on GitHub has free access to your code. Restricting access to your lab work will be considered a mistake when doing lab work
    
    Laboratory work number 2. Basics
     Develop a program that will allow you to create, both from the keyboard and randomly a matrix of integers of type int of a given width and height (enter from the keyboard), but not more than 20 by 20. Create the ability to search in this matrix minimum and maximum element and calculate the arithmetic mean . The program can be written in one class, necessarily breaking down into methods. Mandatory use of the keyboard when choosing a manual or random matrix creation. Create a system of reading from the keyboard to do in any way, for example, thanks to the Scanner class. Scanner is the simplest keyboard scanning system. The range of random numbers to create the elements of the matrix must be verified in special constants.
     As a task of increased complexity add the calculation of the geometric mean of the matrix elements.
    
    Laboratory work number 3. OOP
     Create a program that will create and process a complex object called a university. The program should consist of three parts: a model view and a controller according to the mvc (Model View Controller) paradigm. Each of these groups must match a package with a corresponding name. The model should include all classes responsible for the structural units of the university. Among them: university, faculty, department, group, student, person (Human). They must all contain a string name and a Human header. The student must also be born of a Human. Human must have the fields first name, last name, patronymic and gender. All fields must be urgent except the gender field. Gender must use a special enum type Sex.
    We do not need the View group in this lab.
     As for the controller group, it should contain managers that allow us to create appropriate departments such as StudentCreator, FacultyCreator, GroupCreator and others, each of which must use the capabilities of the lower level of the creator. The program should also contain a Run class, which will contain the entry point and methods that should allow you to create a university. The process of creating a university must be done in the createTypycalUniversity method.
      The program actively recommends the use of abstract classes and interfaces
    
    Laboratory work number 4. JUnit. Json
     Add to the laboratory work 3 the ability to write the university in json format, write this format to a file, read this file format, and create an object from the text format json. The JUnit test should be made in the project which will look as follows: to create object university (oldUniversity) in which in each division there are two divisions of lower level. For example, there are two departments at the faculty, two groups at each department, and two students at each group. This object must be written to a file in json format. It is then read from this file and restored as newUniversity. The test should compare newUniversity and oldUniversity using the equals method. If everything is done correctly then the universities should be equivalent and the equals method should return True. To write and read the university in json format, the JsonManager class must be created. To directly convert the university to the json format and restore it to this format, it is possible to use third-party libraries such as Gson, Jackson or any other.
    To begin the development of laboratory work number 4 completely copy the program code of laboratory work number 3. Do not mix these works in any case.
    
    Laboratory work number 5. Black Jack
     Create a game Black Jack (Known as 21). Card game. One standard deck of 52 cards is used. Detailed rules of the game can be read in the public domain or on Wikipedia. Briefly about the rules of the game: a person plays against the computer. The person is given two cards. The aim of the game is to score the highest number of points, but not more than 21. After receiving two cards, a person must make a choice, either stop the game and leave the number of points, or take another card.
    
    Laboratory work number 6. Jdbc
     Create a database on any database server. Create a table with a list of students to indicate their last name, first name, patronymic, birthday, record number and ID.
     Create a program that will display information about students born in a given month of the year. The program must use the jdbc system to connect to your database and make requests to it. There are no requirements for database development. The program must be written according to all OOP standards. But it can be designed on two principles:
    - in any situation, the entire list of students will be removed, and on the java side will be searched for the necessary
     - SQL query will be generated according to the query made by the user and already the server of management of databases will decide, what students were born in this or that month.
     In conclusion, it is necessary to explain why they chose this or that principle, what are its advantages and disadvantages. The score does not depend on which database management server you choose. The list of students make at least 20 people. Make June the month when none of the students has a birthday.
     SQL code to create a database to place project 6 lab work in a database file in the resources package. To use this laboratory work, it is recommended to actively use the knowledge gained in the discipline related to database development.
     Be sure to include a print screen from the program in which you view your database management server information, showing the created table, its name, and general database information, such as name, username, administrator name, password, and so on. We recommend using jetbrains datagrip software to work with the database management server. Or the built-in database usage panel contained in the intellij Idea environment, which today supports almost all database management servers.

> Full description in the original language can be found in the *tasks.docx* file.

### Dependencies

All dependencies used in the project can be found in the *pom.xml* file.
    
### Credentials
 
[<img src="https://avatars0.githubusercontent.com/u/49559296?s=460&v=4" width="16" height="16" />](https://github.com/gotoindex) [@gotoindex](https://github.com/gotoindex)
