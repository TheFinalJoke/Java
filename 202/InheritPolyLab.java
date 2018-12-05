/*  Creates an Employee Object
 *
 *  This object extends Student (student extends Person)
 */

/*
 *
You will use the Person, Student, and Employee objects/classes.

Inheritance:
Write a test class/program, InheritPolyLab.java, which creates an employee "Polly" who works in the CS department making $7.50 an hour.  Polly's major is Computer Science and will graduate in 2018; she was born in 1997.

Polymorphism:
•	Create an employee "Easton", then create a Student, student, assigning it Easton, and then create a Person, person, assigning it to Easton.
•	Set all the data in the employee object's data fields/state
•	Repeat this statement again:
System.out.println (person.toString());
•	Tell me in a comment what happened & why!


Input:  Hard coded in
Output:	to the screen

Sample Run:
	Name:  Polly Sex:  female Birth Year: 1997
		Graduation Year: 2018
		Major: CS
		Works in the dept:  Computer Science
		Earning wage:  7.5

	Name: Easton Sex: nullBirth Year: 0
		Graduation Year: 0
		Major: null
		Works in the dept:  null
		Earning wage:  0.0
 */


import java.*;
import java.util.*;

public class InheritPolyLab {
  public static void main (String [] args) {

	//Create Employee Polly
	Employee Polly = new Employee("Polly", "Female ", 1997, 2018, "Computer Science", 7.50, "CS Department");
	System.out.println(Polly.toString());

    // Create Employee Easton
		Employee employee = new Employee("Easton");

		Student student = easton;

		Person person = easton;

		System.out.println (person.toString());
	//set the Data fields/ the states for easton


	easton.setSex("male");
	easton.setBirth(1995);
	easton.setGradYear(2019);
	easton.setMajor("Business");
	easton.setWage(21.50);
	easton.setDept("Emergency");
	System.out.println(person.toString());

  }// end main
}// end InheritPolyLab
/* Creates a Person Object
 *
 * use with Student -> Employee Objects
 *     and with Instructor Objects
 */


 class Person {

  private String name;
  private String sex;
  private int birthYear;

  public Person(){}

  public Person(String name){
  	this.name = name;
  }

  public Person(String name, String sex, int birthYear) {
    this.name = name;
    this.sex = sex;
    this.birthYear = birthYear;
  }// close public Person

  public void setName (String name) {
    this. name = name;
  }// close name

  public void setSex (String sex) {
    this. sex = sex;
  }// close sex

  public void setBirthYear (int birthYear) {
    this. birthYear = birthYear;
  }// close birthYear

    //getters

  public String getName (){
    return this. name;
  }// close getname

  public String getSex () {
    return this. sex;
  }// close getsex

  public int getBirthYear (){
    return this. birthYear;
  }// close getbirthYear


  @Override
 public String toString () {
    return "Name: " + this. name + "Sex: " + this. sex + "Birth Year: " + this. birthYear;
 }
}// close main


 class Student extends Person {

  private int gradYear;
  private String major;

  public Student(){}

  public Student (String name){
  	super(name);
  }

  public Student (String name, String sex, int birthYear, int gradYear, String major) {
    super(name, sex, birthYear);
    this.gradYear = gradYear;
    this.major = major;
  }// close public student

  // setters
    public void setMajor (String major){
    this. major = major;
    }// close major

    public void setGradYear (int gradYear){
    this. gradYear = gradYear;
    }// close gradYear

    // getters
    public String getMajor() {
      return this. major;
    }// close major

     public int getGradYear() {
      return this. gradYear;
    }// close gradYear

     //override
     @Override
  public String toString () {
       return super.toString() + "\n\tGraduation Year: " + ""+ this.gradYear + " \n\tMajor: "+ ""+ this.major;

  }// close toString
}// close main



 class Employee extends Student {

  private double wage;
  private String dept;

  public Employee (String name){
  	super(name);
  }

  public Employee (String name, String sex, int birthYear, int gradYear, String major, double wage, String dept) {
    super(name, sex, birthYear, gradYear, major);
    this.wage = wage;
    this.dept = dept;
  }// close Employee

  // setters
    public void setDept (String dept){
    	this. dept = dept;
    }// close dept

    public void setWage (double wage){
    	this. wage = wage;
    }// close wage

    // getters
    public String getDept() {
      return this. dept;
    }// close dept

     public double getWage() {
      return this. wage;
    }// close wage

     //override
     @Override
  public String toString () {
       return super.toString() + " \n\tWorks in the dept: " + " " + this.dept + " \n\tEarning wage: " + " " + this.wage;

  }// close toString
}// close main

// i couldnt do it because i got a compiler error saying that there is already to many eastons. Also i had to comment all of easton out for some reason.
