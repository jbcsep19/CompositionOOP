# CompositionOOP

Classes include:
  - CompositionBasics.java
  - Person.java
  - Job.java
  - Education.java
  
 If in my Main (CompositionBasics) class I run this command:
 ```java
 Person luke = new Person(); 
 ```
 A Person object called `luke` is created. The constructor of Person class sets the salary at a default value of $50,000, so Luke's default salary will be $50K.
 You can check this by running:
  ```java
System.out.println(luke.getSalary());
 ```
Let's say Luke got a raise and his new salary is $60K. We can use the the `setSalary()` function. Notice how we have to first use `getJob()` to retrieve the `job` object in order to change the value of one of its attributes, `salary`.
 ```java
 long newSalary = 60000L;
 luke.getJob().setSalary(newSalary);
 ```
 ![WhiteBoard Image1](https://res.cloudinary.com/jihyunle/image/upload/v1568915308/tp-whiteboard-2_2.jpg)
 In the same way, if we want to access the list of schools in Luke's education class, the correct call is
 ```java
 luke.getEducation().getSchools();
 ```
 The incorrect call would be the following:
  ```java
 luke.getSchools();
 ```
 See the below picture.
![WhiteBoard Image2](https://res.cloudinary.com/jihyunle/image/upload/v1568909536/tp-whiteboard-2.jpg)
