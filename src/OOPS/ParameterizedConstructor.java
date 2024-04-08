package OOPS;

class Studentdata {
    int id;
    String name;

    Studentdata(int i, String j) {//Parameterized constructor with no return type
        id = i;
        name = j;
    }


    void display() {
        System.out.println("Student ID-" + id);
        System.out.println("Student Name-" + name);
    }
}

    public class ParameterizedConstructor {

        public static void main(String[] args) {


            Studentdata sd1 = new Studentdata(11,"ShilpaJ");//calling constructor s1->reference variable  default constructor
            Studentdata sd2 = new Studentdata(12,"ShilpaJu");
            sd1.display();// Calling method
            sd2.display();
            sd1.id=10;
            sd1.name="arti";
            sd1.display();


        }
    }

    //Queries-

//If we try sd.is =10 its not working we have to explicitly pass the values to object


