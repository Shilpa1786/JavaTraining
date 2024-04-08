package Variables;

import javax.lang.model.element.Name;

//Assignment 4: this Keyword
//Create a class called Person with instance variables for name and age.
// Write a constructor that takes parameters to initialize these variables and a method to display
// the details of a person object using the this keyword.
public class Assignment4 {
    public String Name;
    public int age;

    public Assignment4(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }
       public void personsdetails()
        {
            System.out.println(this.Name+ " Persons Details " + this.age);
        }


        public static void main (String[]args){

            Assignment4 assign = new Assignment4("Shilpa",17);
            assign.personsdetails();




        }
    }

