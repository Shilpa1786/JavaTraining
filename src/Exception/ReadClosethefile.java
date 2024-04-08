package Exception;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadClosethefile {
    public static void main(String[] args) {
/*//Program 1Create the file
        PrintWriter pw = null;
        try {
pw=new PrintWriter("Myfile1.txt");
            pw.println("Text1");
        }
        catch(Exception e){
            System.out.println( "Received " +e.getMessage()+ "when writing in to the file");

        }finally{
            pw.close();
        }
        //System.out.println("come out the try catch finally block");
        }

    }*/

        //Program 2 reading and closing the file

        File f =new File("Myfile1.txt");
        Scanner sc= null;
        try{
           sc = new Scanner(System.in);
            System.out.println(sc.nextLine());

        }catch(Exception e)
        {
            System.out.println(e.getMessage());

        }
        finally {
            sc.close();

        }
    }
    }

