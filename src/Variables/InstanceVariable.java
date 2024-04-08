package Variables;

public class InstanceVariable {
    public int age,grade;
    public String name;

  void display(){
      age =20;
      System.out.println("age of student " +age);
    }

    public static void main(String[] args){
        InstanceVariable iv = new InstanceVariable();
        iv.display();
    }
}
