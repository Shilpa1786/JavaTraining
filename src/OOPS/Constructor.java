package OOPS;

class Studentdatas {
    int StudentID, Marks;

    Studentdatas()//No Argument Passed
    {
        StudentID = 100;
        Marks = 70;
    }
}

public class Constructor {

    public static void main(String[] args){
        Studentdatas st = new Studentdatas();
        System.out.println("Student ID-"+st.StudentID);
        System.out.println("Marks-"+st.Marks);

    }
}
