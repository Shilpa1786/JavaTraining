package OOPS;
//How we declare methods
public class StudentPassValuesMethod {
    int a;
    int b;

    int add(int i,int j) //parameter passed as int hence method prefix set as int
    {
        a=i;
        b=j;
        int c;
        c=  a+b;
        return c;
    }
    public static class addition {
        public static void main(String[] args){
            StudentPassValuesMethod st = new StudentPassValuesMethod();
            System.out.println(st.add(20,30));
        }

    }
}
