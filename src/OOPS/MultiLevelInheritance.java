package OOPS;

import java.util.Scanner;

class Student {
    String Name;

    void setName() {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter Name");
        Name = name.next();
    }
}

    class Rollnumber extends Student {
        int rollno;

        void setRollno() {
            Scanner rolno = new Scanner(System.in);
            System.out.println("Enter RollNumber");
            rollno = rolno.nextInt();
        }
    }
        class Marks extends Rollnumber {
            int Marks;

            void setMarks() {
                Scanner marks = new Scanner(System.in);
                System.out.println("Enter Marks");
                Marks = marks.nextInt();
            }
        }

        public class MultiLevelInheritance {
            public static void main(String[] args) {
                Marks m = new Marks();
                m.setRollno();
                m.setName();
                m.setMarks();

                System.out.println("Student Name: " + m.Name);
                System.out.println("Student Roll Number: " + m.rollno);
                System.out.println("Student Marks:" + m.Marks);


            }
        }


