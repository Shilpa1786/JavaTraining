package OOPS;

import javax.lang.model.element.Name;
//Single Inheritance Program
class Employee{
int salary =100;
String Name ="Shilpa";
}
class Bonus extends Employee{
    int Total;
    int bonus = 20;


}
public class SingleInheritance {
    public static void main(String[] args){
 Bonus b = new Bonus();
 b.Total =b.bonus+b.salary;
        System.out.println("Employee-"+b.Name+" has Salary " +b.Total);
    }
}
