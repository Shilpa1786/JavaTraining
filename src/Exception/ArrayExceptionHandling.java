package Exception;
/*Inside the finally block, a loop iterates over each number
in the numbers array. For each number, it prints a message indicating
the current number being processed. It then uses a conditional statement to determine
 if the number is even or odd and displays the corresponding message.*/

public class ArrayExceptionHandling {

    public static void main(String[] args) {

        int a[] = {1, 2, 5, 6, 3, 2};
        System.out.println("Odd Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
