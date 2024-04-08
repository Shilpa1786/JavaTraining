package OOPS;

import java.util.Scanner;

public class StudentProgramwithScanner {
    int rollno;

    String name;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll No.");
        rollno = sc.nextInt();
        System.out.println("Enter Student Name");
        name = sc.next();
    }

    void display() {
        System.out.println("rollno is:" +rollno);
        System.out.println("name is:"+name);
    }

    public static void main(String[] args) {
        StudentProgramwithScanner s1 = new StudentProgramwithScanner();
        s1.getdata();
        s1.display();


        StudentProgramwithScanner s2 = new StudentProgramwithScanner();
        s2.getdata();
        s2.display();

    }
}
