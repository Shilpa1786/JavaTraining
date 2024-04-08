public class VariablePractice1 {

    public static void main(String[] args) {
        //Approach 1
       int a= 100;
       int b=100;
       int c= 300;

//Approach 2 if all the variables belongs to same datatype
        int x,y,z;  //Declaration
                x=100;  //Assignments
        y=200;
        z=300;

        //Approach 3 if all the variables belongs to different datatype

        int p=100,q=200,r=300;
        System.out.println("The Value of p is:" +p);
        System.out.println("The Value of q is:" +q);   //Concatination
        System.out.println("The Value of q is:" +r);

//Single statement which can print all the variables

        System.out.println(p+ " " +q+ " " +r);//how to concanite here
    }
}
