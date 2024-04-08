package OOPS;

 class Studenta { //Object is Student

    int rollno = 20; //Datamembers
    String studentname = "shilpa";

    void display() //method has void because nothing returned
    {
        System.out.println("rollno is:" + rollno);
        System.out.println("studentname:" + studentname);
    }


     public static void main(String[]args){
             Studenta s1 = new Studenta(); //declare object
             s1.display();

    }
    }


