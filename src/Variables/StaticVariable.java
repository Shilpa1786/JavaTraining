package Variables;

public class StaticVariable {
    private static double salary;
    public int i;
    public static final String department ="Automation";

  double getvariable(){
        salary =40000;
        System.out.println(salary);
        return salary;
    }

    public static void main(String[] args){

        salary =2000;
        System.out.println(salary+ " Salary & Department "+department);
        StaticVariable sv =new StaticVariable();
        System.out.println("Print another value from get variable method"+sv.getvariable());
    }
}

