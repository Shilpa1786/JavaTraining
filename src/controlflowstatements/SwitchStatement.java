package controlflowstatements;

public class SwitchStatement {
    public static void main(String[] args) {

        int num=10;
        switch(num) {
            case(0):
                System.out.println("number is 0");
                break;
            case(1):
                System.out.println("number is 1");
                break;
            case(2):
                System.out.println("number is 2");
            default:
                System.out.println(num);
        }
    }
}
