package genericandTypeCasting;

public class CharacterToInteger {
    public static void main(String[] args) {


        char a, b;
        int i;
        a = 'x';
        i = a; //safe conversion
        System.out.println(i); //prints 120 asci code for x

        a ='x';
        i=a+1;
        System.out.println(i); //prints 121

        a='x';
        b='y';
                i=a+b;
        System.out.println(i);//print 241

    }
}
